/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;
import java.util.ArrayList;
import inf5153.battleship.controleur.PartieControleur;
import inf5153.battleship.domain.Position;
/**
 *
 * @author 0-pc
 */
public class FenetreJouerPartie extends FenetrePartie{
    private final String niveauDif;
    private EffetPlacementBateaux placementBateaux ;
    private EffetPlacementCoups placementCoups ;
    public PartieControleur controleur;
    private BoutonCustom listeBoutonsBateauxJoueur[];
            
    public FenetreJouerPartie(String nivDif) {
        niveauDif = nivDif;
        try
        {
            super.initComponents();
            initListener();
            txtJournalisation.append("Place les bateaux sur ta grille !\n");
            placementBateaux = new EffetPlacementBateaux(this);
            controleur = new PartieControleur();
        }
        catch(Exception ex) {
            txtJournalisation.append(ex.getMessage());
        }
    }
    
    private void initListener (){

        btnDemarrerPartie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
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

    private void btnDemarrerPartieMouseClicked(java.awt.event.MouseEvent evt) {
        try
        {
            //affichageBoutonDebutPartie();
            ///getListePositionsBateauxJoueur(placementBateaux.boutonsEnMemoire);
            
            controleur.commencerPartie();
            placementBateaux.placerBateaux(controleur.getBateauxIA());
            placementCoups = new EffetPlacementCoups(this,placementBateaux.mapBoutonsJoueur,placementBateaux.mapBoutonsAdv);
        }
        catch(Exception ex) {
            txtJournalisation.append("Une erreur est survenu lors du démarrage de la partie : " + ex.getMessage());
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
