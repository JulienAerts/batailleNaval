/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.controleur.PartieControleur;

/**
 *
 * @author 0-pc
 */
public class FenetreJouerPartie extends FenetrePartie{
    private final String niveauDif;
    private EffetPlacementBateaux placementBateaux ;
    private PartieControleur controleur2;
    
    public FenetreJouerPartie(String nivDif) {
        niveauDif = nivDif;
        super.initComponents();
        initListener();
        placementBateaux = new EffetPlacementBateaux(this);
        controleur2 = new PartieControleur();
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
        
    }
    
    private void btnChangerOrientationActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        placementBateaux.orientation = !placementBateaux.orientation;
    }                                                     

    private void btnDemarrerPartieMouseClicked(java.awt.event.MouseEvent evt) {                                               
        controleur2.commencerPartie();
    } 
}
