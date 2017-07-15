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
import java.util.Date;
/**
 *
 * @author 0-pc
 */
public class FenetreJouerPartie extends FenetrePartie{
    private final int niveauDif;
    private EffetPlacementBateaux placementBateaux ;
    private EffetPlacementCoups placementCoups ;
    public PartieControleur controleur;
    public RecordControleur controleurRecord;
    private BoutonCustom listeBoutonsBateauxJoueur[];
            
    public FenetreJouerPartie(int nivDif) {
        niveauDif = nivDif;
        try
        {
            super.initComponents();
            initListener();
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
        txtJournalisation.append("Sauvegarde pas implementer encore !\n");
    }

    private void btnDemarrerPartieMouseClicked(java.awt.event.ActionEvent evt) {
        try
        {   
            controleur.commencerPartie(getListePositionsBateauxJoueur(placementBateaux.boutonsEnMemoire),niveauDif);
            placementBateaux.placerBateaux(controleur.getBateauxIA());
            affichageBoutonDebutPartie();     
            txtJournalisation.append("Tire sur une des cases de ton adversaire!\n");
            placementCoups = new EffetPlacementCoups(this,placementBateaux.mapBoutonsJoueur,placementBateaux.mapBoutonsAdv);
            
        }
        catch(Exception ex) {
            txtJournalisation.append("Une erreur est survenu lors du démarrage de la partie : " + ex.getMessage());
        }
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
}
