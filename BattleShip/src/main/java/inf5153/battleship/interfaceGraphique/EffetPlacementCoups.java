
package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.controleur.Reponse;
import inf5153.battleship.domain.Bateau;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Position;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

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
        if(true){
            BoutonCustom bouton = (BoutonCustom)evt.getSource();
            Reponse rep = partie.controleur.jouerCoup(bouton.position);
            switch (rep){
                case Touche:
                    bouton.setBackground(Color.yellow);
                    tonTour = false ;
                    break;
                case ToucheCoule:
                    colorierCaseBateau(trouverBateau(bouton.position),Color.red);
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
    
    public void colorierCaseBateau(Bateau bateau, Color color) {
        
        for(Case cas : bateau.getCases()) {
            mapBoutonsAdv[(cas.getPosition().getCoordonneXToInt()) + (cas.getPosition().getCoordonneY() - 1) *10].setBackground(color);
        }
    }
    
    public Bateau trouverBateau(Position pos) {
        Bateau BateauRechercher = new Bateau();
        for(Bateau bateau : partie.controleur.getBateauxIA()) {
            for(Case tCase : bateau.getCases()) {
               if(tCase.getPosition().equals(pos)){
                   BateauRechercher = bateau;
               }
            }
        }
            
        return BateauRechercher;
    }
}
