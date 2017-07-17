package inf5153.battleship.domain;

import java.util.Date;

public class Partie {

    private Date debut;
    private Date fin;
    private Joueur joueur1;
    private IA joueur2;

    public Partie(int niveauDifficulte) throws Exception {
        debut = new Date();
        joueur1 = new Joueur();
        if(niveauDifficulte == 0) {
            joueur2 = new IAFacile();
        }
        else {
            joueur2 = new IADifficile();
        }
        
        joueur2.setAdversaire(joueur1);
    }

    public Partie(Date debut, int niveauDifficulte) throws Exception {
        this.debut = debut;
        joueur1 = new Joueur();
        if(niveauDifficulte == 0) {
            joueur2 = new IAFacile();
        }
        else {
            joueur2 = new IADifficile();
        }
        joueur2.setAdversaire(joueur1);
    }

    public Joueur getJoueur1() {
        return this.joueur1;
    }

    /**
     *
     * @param joueur1
     */
    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public IA getJoueur2() {
        return this.joueur2;
    }

    /**
     *
     * @param fin
     */
    public void setDateFin(Date fin) {
        this.fin = fin;
    }

    public Date getDateFin() {
        return this.fin;
    }

    public Date getDateDebut() {
        return this.debut;
    }

    /**
     *
     * @param joueur2
     */
    public void setJoueur2(IA joueur2) {
        this.joueur2 = joueur2;
    }

}
