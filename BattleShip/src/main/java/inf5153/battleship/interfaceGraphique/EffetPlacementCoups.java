
package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.controleur.Reponse;
import inf5153.battleship.domain.Bateau;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Position;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EffetPlacementCoups {
    private FenetreJouerPartie partie;
    public BoutonCustom mapBoutonsJoueur[];
    public BoutonCustom mapBoutonsAdv[];
    private boolean tonTour = true ;
    public boolean partieTermine = false ;
    public boolean victoire = false ;
    int n = 0;
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
                    tireAdversaire();
                    break;
                case ToucheCoule:
                    colorierCaseBateau(trouverBateau(bouton.position),Color.red);
                    tonTour = false ;
                    tireAdversaire();
                    break;
                case Eau:
                    bouton.setBackground(Color.BLUE);
                    tonTour = false ;
                    tireAdversaire();
                    break;
                case PartieTerminee:
                    colorierCaseBateau(trouverBateau(bouton.position),Color.red);
                    partie.txtJournalisation.append("pARTIE TERMINER @@@@");
                    tonTour = false ;
                    victoire = true;
                    partie.finDePartie(victoire);
                    break;
                case DejaTirer:
                    JOptionPane.showMessageDialog(null, "Vous avez deja tirer sur cette case","Message avertissement",JOptionPane.ERROR_MESSAGE);
                    tonTour = true ;
                    break;

            } 
        }
    }
    
    public void tireAdversaire() {
            Position coupGenereAI = partie.controleur.genererCoupIA();
            Reponse rep = partie.controleur.jouerCoupAI(coupGenereAI);
            BoutonCustom boutonToucheAI = mapBoutonsJoueur[coupGenereAI.getCoordonneXToInt() + (coupGenereAI.getCoordonneY()- 1) *10];
             switch (rep){
                case Touche:
                    boutonToucheAI.setBackground(Color.yellow);
                    tonTour = true ;
                    break;
                case ToucheCoule:
                    colorierCaseBateauJoueur(trouverBateauJoueur(coupGenereAI),Color.red);
                    tonTour = true ;
                    break;
                case Eau:
                    boutonToucheAI.setBackground(Color.BLUE);
                    tonTour = true ;
                    break;
                case PartieTerminee:
                    colorierCaseBateauJoueur(trouverBateauJoueur(coupGenereAI),Color.red);
                    tonTour = false ;
                    victoire = false;
                    partie.finDePartie(victoire);
                    break;

            }

         
    }
    
    
    public void colorierCaseBateau(Bateau bateau, Color color) {
        
        for(Case cas : bateau.getCases()) {
            mapBoutonsAdv[(cas.getPosition().getCoordonneXToInt()) + (cas.getPosition().getCoordonneY() - 1) *10].setBackground(color);
        }
    }
    
    public void colorierCaseBateauJoueur(Bateau bateau, Color color) {
        
        for(Case cas : bateau.getCases()) {
            mapBoutonsJoueur[(cas.getPosition().getCoordonneXToInt()) + (cas.getPosition().getCoordonneY() - 1) *10].setBackground(color);
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
    
    public Bateau trouverBateauJoueur(Position pos) {
        Bateau BateauRechercher = new Bateau();
        for(Bateau bateau : partie.controleur.getBateauxJoueur()) {
            for(Case tCase : bateau.getCases()) {
               if(tCase.getPosition().equals(pos)){
                   BateauRechercher = bateau;
               }
            }
        }
            
        return BateauRechercher;
    }
}
