
package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.controleur.Reponse;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class EffetPlacementCoups {
    private FenetreJouerPartie partie;
    public BoutonCustom mapBoutonsJoueur[];
    public BoutonCustom mapBoutonsAdv[];
    private boolean tonTour = true ;
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
        if(tonTour){
            BoutonCustom bouton = (BoutonCustom)evt.getSource();
            Reponse rep = partie.controleur.jouerCoup(bouton.position);
            switch (rep){
                case Touche:
                    bouton.setBackground(Color.yellow);
                    tonTour = false ;
                    break;
                case ToucheCoule:
                    bouton.setBackground(Color.RED);
                    tonTour = false ;
                    break;
                case Eau:
                    bouton.setBackground(Color.BLUE);
                    tonTour = false ;
                    break;
                case PartieTerminee:

                    break;

            }
        }
    }
}
