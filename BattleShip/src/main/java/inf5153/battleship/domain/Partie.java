package inf5153.battleship.domain;

import java.util.Date;

public class Partie {

    private Date debut;
    private Date fin;
    private Chronometre chronometre;
    private Humain joueur1;
    private IA joueur2;

    public Partie(int niveauDifficulte) throws Exception {
        debut = new Date();
        Chronometre chronometre = new Chronometre();
        chronometre.partirChrono();
        joueur1 = new Humain();
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
        joueur1 = new Humain();
        if(niveauDifficulte == 0) {
            joueur2 = new IAFacile();
        }
        else {
            joueur2 = new IADifficile();
        }
        joueur2.setAdversaire(joueur1);
    }

    public Humain getJoueur1() {
        return this.joueur1;
    }

    /**
     *
     * @param joueur1
     */
    public void setJoueur1(Humain joueur1) {
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
