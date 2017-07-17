package inf5153.battleship.domain;

import inf5153.battleship.controleur.Reponse;
import java.util.ArrayList;

public class Joueur {

    protected Carte carte;
    protected ArrayList<Coup> coups;

    public Joueur() throws Exception {
        carte = new Carte();
        coups = new ArrayList<Coup>();
    }

    public ArrayList<Coup> getCoups() {
        return this.coups;
    }

    /**
     *
     * @param position
     */
    public Case jouerCoup(Position position) {
        Coup coup = new Coup(carte.getCase(position));
        Reponse reponse;
        Case caseJouer = carte.getCase(position);
        caseJouer.setTir(coup);
        if (caseJouer.bateauExiste()) {
            Bateau touche = caseJouer.getBateau();
            if (touche.estCoule()) {
                reponse = Reponse.ToucheCoule;
            } else {
                reponse = Reponse.Touche;
            }
        } else {
            reponse = Reponse.Eau;
        }

        coups.add(coup);
        caseJouer.setReponse(reponse);
        return caseJouer;
    }

    public Carte getCarte() {
        return this.carte;
    }

    /**
     *
     * @param carte
     */
    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public void placerBateaux(ArrayList<Position> positions) throws Exception {

        ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();

        for (Bateau bateau : bateaux) {

            ArrayList<Position> positionsBateau = new ArrayList<Position>(positions.subList(0, bateau.longueur));
            positions.removeAll(positionsBateau);
            carte.placerBateau(bateau, positionsBateau);

        }

    }

    public Coup getCoup(int tour) {
        if (tour < coups.size()) {
            return coups.get(tour);
        }
        return null;
    }

}
