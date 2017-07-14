/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.controleur.Reponse;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 *
 * @author 0-pc
 */
public class EffetPlacementCoups {
    private FenetreJouerPartie partie;
    public BoutonCustom mapBoutonsJoueur[];
    public BoutonCustom mapBoutonsAdv[];
    
    public EffetPlacementCoups(FenetreJouerPartie partie,BoutonCustom[] mapBoutonsJoueur,BoutonCustom[] mapBoutonsAdv){
        this.partie=partie;
        this.mapBoutonsAdv = mapBoutonsAdv;
        this.mapBoutonsJoueur = mapBoutonsJoueur;
        initialiserListenerMouse();


    }
    
    private void initialiserListenerMouse(){
        for (int i=0;i<100;i++){
            mapBoutonsAdv[i].addActionListener((ActionEvent evt) -> {
                mapBoutonsAdvActionPerformed(evt);
            });
        }
    }
    
    private void mapBoutonsAdvActionPerformed(ActionEvent evt){
        BoutonCustom bouton = (BoutonCustom)evt.getSource();
        Reponse rep = partie.controleur.jouerCoup(bouton.position);
        switch (rep){
            case Touche:
                bouton.setBackground(Color.RED);
                break;
            case ToucheCoule:
                bouton.setBackground(Color.RED);
                break;
            case Eau:
                bouton.setBackground(Color.BLUE);
                break;
            case PartieTerminee:

                break;

        }
    }
}
