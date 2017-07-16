/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;
import java.util.ArrayList;
import inf5153.battleship.controleur.PartieControleur;
import inf5153.battleship.controleur.RecordControleur;
import inf5153.battleship.domain.Position;
import java.io.File;
import java.util.Date;
import javax.swing.JButton;
/**
 *
 * @author 0-pc
 */
public class FenetreJouerPartie extends FenetrePartie{
    private int niveauDif;
    public BoutonCustom mapBoutonsJoueur[];
    public BoutonCustom mapBoutonsAdv[];
    private EffetPlacementBateaux placementBateaux ;
    private EffetPlacementCoups placementCoups ;
    private EffetChargementPartie effetChargementPartie ;
    public PartieControleur controleur;
    public RecordControleur controleurRecord;
    private BoutonCustom listeBoutonsBateauxJoueur[];
    
    public FenetreJouerPartie() {
        try
        {
            super.initComponents();
            initListener();
            init_mapBoutonsJoueur();
            init_mapBoutonsAdv();
            controleur = new PartieControleur();
            controleurRecord = new RecordControleur();
        }
        catch(Exception ex) {
            txtJournalisation.append(ex.getMessage());
        }
    }
    
    public FenetreJouerPartie(int nivDif) {
        niveauDif = nivDif;
        try
        {
            super.initComponents();
            initListener();
            init_mapBoutonsJoueur();
            init_mapBoutonsAdv();
            txtJournalisation.append("Place les bateaux sur ta grille !\n");
            placementBateaux = new EffetPlacementBateaux(this);
            controleur = new PartieControleur();
            controleurRecord = new RecordControleur();
        }
        catch(Exception ex) {
            txtJournalisation.append(ex.getMessage());
        }
    }
    
    
    
    private void initListener (){

        btnDemarrerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemarrerPartieMouseClicked(evt);
            }
        });
        btnChangerOrientation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangerOrientationActionPerformed(evt);
            }
        });
        
        btnReinitialise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinitialiseActionPerformed(evt);
            }
        });
        
        btnFinPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinPartieActionPerformed(evt);
            }
        });
        
         btnSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarderActionPerformed(evt);
            }
        });
        
    }
    
    private void btnChangerOrientationActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        placementBateaux.orientation = !placementBateaux.orientation;
    }
    
    private void btnReinitialiseActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        placementBateaux.réinitialiserEffets();
    }
    
    private void btnFinPartieActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        System.exit(0);
    }
    
    private void btnSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        controleur.sauvegarderPartie();
    }

    private void btnDemarrerPartieMouseClicked(java.awt.event.ActionEvent evt) {
        try
        {   
            controleur.commencerPartie(getListePositionsBateauxJoueur(placementBateaux.boutonsEnMemoire),niveauDif);
            placementBateaux.placerBateaux(controleur.getBateauxIA());
            affichageBoutonDebutPartie();     
            txtJournalisation.append("Tire sur une des cases de ton adversaire!\n");
            placementCoups = new EffetPlacementCoups(this,mapBoutonsJoueur,mapBoutonsAdv);
            
        }
        catch(Exception ex) {
            txtJournalisation.append("Une erreur est survenu lors du démarrage de la partie : " + ex.getMessage());
        }
    }
    
    public void chargementDePartie (File fichier){
        controleur.chargerPartie(fichier);
        affichageBoutonDebutPartie();
        txtJournalisation.append("Partie charger!");
        effetChargementPartie = new EffetChargementPartie(this);
        effetChargementPartie.placerBateaux(controleur.getBateauxJoueur());
        effetChargementPartie.placerCoupJoueur();
        effetChargementPartie.placerCoupAI();
        placementCoups = new EffetPlacementCoups(this,mapBoutonsJoueur,mapBoutonsAdv);
    }
    public void finDePartie(boolean victoire){
        controleur.getPartie().setDateFin(new Date());
        if (victoire && controleurRecord.estUnRecord(controleur.getPartie()) ){
               
            FenetreNouveauRecord fenetreNouveauRecord = new FenetreNouveauRecord();
            fenetreNouveauRecord.pack();
            fenetreNouveauRecord.setLocationRelativeTo(null);
            fenetreNouveauRecord.setVisible(true);
            dispose();
            
            
        }else{
            
            FenetreFinRecord fenetreFinRecord = new FenetreFinRecord();
            fenetreFinRecord.pack();
            fenetreFinRecord.setLocationRelativeTo(null);
            fenetreFinRecord.setVisible(true);
            dispose();
            
        }
        
    }
    
    private ArrayList<Position> getListePositionsBateauxJoueur(BoutonCustom listeBoutonsBateauxJoueur[]){
        ArrayList<Position> arrlist = new ArrayList<>(17);
        for (int i = 0;i<17;i++){
            arrlist.add(listeBoutonsBateauxJoueur[i].position);       
        }
        return arrlist;
    
    }
    private void affichageBoutonDebutPartie(){
        
        btnSauvegarder.setEnabled(true);
        btnDemarrerPartie.setEnabled(false);
        btnReinitialise.setEnabled(false);
        btnChangerOrientation.setEnabled(false);
        btnFinPartie.setEnabled(true);
    }
    


    public void init_mapBoutonsJoueur(){
        mapBoutonsJoueur = new BoutonCustom [100];
        
        mapBoutonsJoueur[0]=jButtonA1;
        mapBoutonsJoueur[1]=jButtonB1;
        mapBoutonsJoueur[2]=jButtonC1;
        mapBoutonsJoueur[3]=jButtonD1;
        mapBoutonsJoueur[4]=jButtonE1;
        mapBoutonsJoueur[5]=jButtonF1;
        mapBoutonsJoueur[6]=jButtonG1;
        mapBoutonsJoueur[7]=jButtonH1;
        mapBoutonsJoueur[8]=jButtonI1;
        mapBoutonsJoueur[9]=jButtonJ1;
        
        mapBoutonsJoueur[10]=jButtonA2;
        mapBoutonsJoueur[11]=jButtonB2;
        mapBoutonsJoueur[12]=jButtonC2;
        mapBoutonsJoueur[13]=jButtonD2;
        mapBoutonsJoueur[14]=jButtonE2;
        mapBoutonsJoueur[15]=jButtonF2;
        mapBoutonsJoueur[16]=jButtonG2;
        mapBoutonsJoueur[17]=jButtonH2;
        mapBoutonsJoueur[18]=jButtonI2;
        mapBoutonsJoueur[19]=jButtonJ2;
        
        mapBoutonsJoueur[20]=jButtonA3;
        mapBoutonsJoueur[21]=jButtonB3;
        mapBoutonsJoueur[22]=jButtonC3;
        mapBoutonsJoueur[23]=jButtonD3;
        mapBoutonsJoueur[24]=jButtonE3;
        mapBoutonsJoueur[25]=jButtonF3;
        mapBoutonsJoueur[26]=jButtonG3;
        mapBoutonsJoueur[27]=jButtonH3;
        mapBoutonsJoueur[28]=jButtonI3;
        mapBoutonsJoueur[29]=jButtonJ3;
        
        mapBoutonsJoueur[30]=jButtonA4;
        mapBoutonsJoueur[31]=jButtonB4;
        mapBoutonsJoueur[32]=jButtonC4;
        mapBoutonsJoueur[33]=jButtonD4;
        mapBoutonsJoueur[34]=jButtonE4;
        mapBoutonsJoueur[35]=jButtonF4;
        mapBoutonsJoueur[36]=jButtonG4;
        mapBoutonsJoueur[37]=jButtonH4;
        mapBoutonsJoueur[38]=jButtonI4;
        mapBoutonsJoueur[39]=jButtonJ4;
        
        mapBoutonsJoueur[40]=jButtonA5;
        mapBoutonsJoueur[41]=jButtonB5;
        mapBoutonsJoueur[42]=jButtonC5;
        mapBoutonsJoueur[43]=jButtonD5;
        mapBoutonsJoueur[44]=jButtonE5;
        mapBoutonsJoueur[45]=jButtonF5;
        mapBoutonsJoueur[46]=jButtonG5;
        mapBoutonsJoueur[47]=jButtonH5;
        mapBoutonsJoueur[48]=jButtonI5;
        mapBoutonsJoueur[49]=jButtonJ5;
        
        mapBoutonsJoueur[50]=jButtonA6;
        mapBoutonsJoueur[51]=jButtonB6;
        mapBoutonsJoueur[52]=jButtonC6;
        mapBoutonsJoueur[53]=jButtonD6;
        mapBoutonsJoueur[54]=jButtonE6;
        mapBoutonsJoueur[55]=jButtonF6;
        mapBoutonsJoueur[56]=jButtonG6;
        mapBoutonsJoueur[57]=jButtonH6;
        mapBoutonsJoueur[58]=jButtonI6;
        mapBoutonsJoueur[59]=jButtonJ6;
        
        mapBoutonsJoueur[60]=jButtonA7;
        mapBoutonsJoueur[61]=jButtonB7;
        mapBoutonsJoueur[62]=jButtonC7;
        mapBoutonsJoueur[63]=jButtonD7;
        mapBoutonsJoueur[64]=jButtonE7;
        mapBoutonsJoueur[65]=jButtonF7;
        mapBoutonsJoueur[66]=jButtonG7;
        mapBoutonsJoueur[67]=jButtonH7;
        mapBoutonsJoueur[68]=jButtonI7;
        mapBoutonsJoueur[69]=jButtonJ7;
        
        mapBoutonsJoueur[70]=jButtonA8;
        mapBoutonsJoueur[71]=jButtonB8;
        mapBoutonsJoueur[72]=jButtonC8;
        mapBoutonsJoueur[73]=jButtonD8;
        mapBoutonsJoueur[74]=jButtonE8;
        mapBoutonsJoueur[75]=jButtonF8;
        mapBoutonsJoueur[76]=jButtonG8;
        mapBoutonsJoueur[77]=jButtonH8;
        mapBoutonsJoueur[78]=jButtonI8;
        mapBoutonsJoueur[79]=jButtonJ8;
        
        mapBoutonsJoueur[80]=jButtonA9;
        mapBoutonsJoueur[81]=jButtonB9;
        mapBoutonsJoueur[82]=jButtonC9;
        mapBoutonsJoueur[83]=jButtonD9;
        mapBoutonsJoueur[84]=jButtonE9;
        mapBoutonsJoueur[85]=jButtonF9;
        mapBoutonsJoueur[86]=jButtonG9;
        mapBoutonsJoueur[87]=jButtonH9;
        mapBoutonsJoueur[88]=jButtonI9;
        mapBoutonsJoueur[89]=jButtonJ9;
        
        mapBoutonsJoueur[90]=jButtonA10;
        mapBoutonsJoueur[91]=jButtonB10;
        mapBoutonsJoueur[92]=jButtonC10;
        mapBoutonsJoueur[93]=jButtonD10;
        mapBoutonsJoueur[94]=jButtonE10;
        mapBoutonsJoueur[95]=jButtonF10;
        mapBoutonsJoueur[96]=jButtonG10;
        mapBoutonsJoueur[97]=jButtonH10;
        mapBoutonsJoueur[98]=jButtonI10;        
        mapBoutonsJoueur[99]=jButtonJ10;

 
    }
    
    public void init_mapBoutonsAdv(){
        mapBoutonsAdv = new BoutonCustom[100];
        
        mapBoutonsAdv[0]=jButton1A;
        mapBoutonsAdv[1]=jButton1B;
        mapBoutonsAdv[2]=jButton1C;
        mapBoutonsAdv[3]=jButton1D;
        mapBoutonsAdv[4]=jButton1E;
        mapBoutonsAdv[5]=jButton1F;
        mapBoutonsAdv[6]=jButton1G;
        mapBoutonsAdv[7]=jButton1H;
        mapBoutonsAdv[8]=jButton1I;
        mapBoutonsAdv[9]=jButton1J;
        
        mapBoutonsAdv[10]=jButton2A;
        mapBoutonsAdv[11]=jButton2B;
        mapBoutonsAdv[12]=jButton2C;
        mapBoutonsAdv[13]=jButton2D;
        mapBoutonsAdv[14]=jButton2E;
        mapBoutonsAdv[15]=jButton2F;
        mapBoutonsAdv[16]=jButton2G;
        mapBoutonsAdv[17]=jButton2H;
        mapBoutonsAdv[18]=jButton2I;
        mapBoutonsAdv[19]=jButton2J;
        
        mapBoutonsAdv[20]=jButton3A;
        mapBoutonsAdv[21]=jButton3B;
        mapBoutonsAdv[22]=jButton3C;
        mapBoutonsAdv[23]=jButton3D;
        mapBoutonsAdv[24]=jButton3E;
        mapBoutonsAdv[25]=jButton3F;
        mapBoutonsAdv[26]=jButton3G;
        mapBoutonsAdv[27]=jButton3H;
        mapBoutonsAdv[28]=jButton3I;
        mapBoutonsAdv[29]=jButton3J;
        
        mapBoutonsAdv[30]=jButton4A;
        mapBoutonsAdv[31]=jButton4B;
        mapBoutonsAdv[32]=jButton4C;
        mapBoutonsAdv[33]=jButton4D;
        mapBoutonsAdv[34]=jButton4E;
        mapBoutonsAdv[35]=jButton4F;
        mapBoutonsAdv[36]=jButton4G;
        mapBoutonsAdv[37]=jButton4H;
        mapBoutonsAdv[38]=jButton4I;
        mapBoutonsAdv[39]=jButton4J;
        
        mapBoutonsAdv[40]=jButton5A;
        mapBoutonsAdv[41]=jButton5B;
        mapBoutonsAdv[42]=jButton5C;
        mapBoutonsAdv[43]=jButton5D;
        mapBoutonsAdv[44]=jButton5E;
        mapBoutonsAdv[45]=jButton5F;
        mapBoutonsAdv[46]=jButton5G;
        mapBoutonsAdv[47]=jButton5H;
        mapBoutonsAdv[48]=jButton5I;
        mapBoutonsAdv[49]=jButton5J;
        
        mapBoutonsAdv[50]=jButton6A;
        mapBoutonsAdv[51]=jButton6B;
        mapBoutonsAdv[52]=jButton6C;
        mapBoutonsAdv[53]=jButton6D;
        mapBoutonsAdv[54]=jButton6E;
        mapBoutonsAdv[55]=jButton6F;
        mapBoutonsAdv[56]=jButton6G;
        mapBoutonsAdv[57]=jButton6H;
        mapBoutonsAdv[58]=jButton6I;
        mapBoutonsAdv[59]=jButton6J;
        
        mapBoutonsAdv[60]=jButton7A;
        mapBoutonsAdv[61]=jButton7B;
        mapBoutonsAdv[62]=jButton7C;
        mapBoutonsAdv[63]=jButton7D;
        mapBoutonsAdv[64]=jButton7E;
        mapBoutonsAdv[65]=jButton7F;
        mapBoutonsAdv[66]=jButton7G;
        mapBoutonsAdv[67]=jButton7H;
        mapBoutonsAdv[68]=jButton7I;
        mapBoutonsAdv[69]=jButton7J;
        
        mapBoutonsAdv[70]=jButton8A;
        mapBoutonsAdv[71]=jButton8B;
        mapBoutonsAdv[72]=jButton8C;
        mapBoutonsAdv[73]=jButton8D;
        mapBoutonsAdv[74]=jButton8E;
        mapBoutonsAdv[75]=jButton8F;
        mapBoutonsAdv[76]=jButton8G;
        mapBoutonsAdv[77]=jButton8H;
        mapBoutonsAdv[78]=jButton8I;
        mapBoutonsAdv[79]=jButton8J;
        
        mapBoutonsAdv[80]=jButton9A;
        mapBoutonsAdv[81]=jButton9B;
        mapBoutonsAdv[82]=jButton9C;
        mapBoutonsAdv[83]=jButton9D;
        mapBoutonsAdv[84]=jButton9E;
        mapBoutonsAdv[85]=jButton9F;
        mapBoutonsAdv[86]=jButton9G;
        mapBoutonsAdv[87]=jButton9H;
        mapBoutonsAdv[88]=jButton9I;
        mapBoutonsAdv[89]=jButton9J;
        
        mapBoutonsAdv[90]=jButton10A;
        mapBoutonsAdv[91]=jButton10B;
        mapBoutonsAdv[92]=jButton10C;
        mapBoutonsAdv[93]=jButton10D;
        mapBoutonsAdv[94]=jButton10E;
        mapBoutonsAdv[95]=jButton10F;
        mapBoutonsAdv[96]=jButton10G;
        mapBoutonsAdv[97]=jButton10H;
        mapBoutonsAdv[98]=jButton10I;       
        mapBoutonsAdv[99]=jButton10J;
        
    }
}
