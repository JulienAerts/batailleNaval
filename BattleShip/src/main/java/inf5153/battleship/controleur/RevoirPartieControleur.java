package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;

public class RevoirPartieControleur {

    private Partie partie;
    private int tour;
    private Joueur joueurActuel;

    public RevoirPartieControleur(Partie partie) {
        this.partie = partie;
        tour = 0;
    }

    public Position prochainCoup() {
        
        if(partie.getJoueur2() == joueurActuel) {
            joueurActuel = partie.getJoueur1();
        } else {
            joueurActuel = partie.getJoueur2();
        }
        
        Coup coup = joueurActuel.getCoup(tour);
        
        if(coup == null)
            return null;
        else
            return coup.getCase().getPosition();
    }

    public void prochainTour() {
        tour++;
    }
}
