package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.Random;

public abstract class IA extends Joueur {

    protected Joueur adversaire;

    public IA() throws Exception {
    }

    abstract public Position genererCoup() throws Exception;
    abstract public int getDifficultee();

    public void placerBateauxAleatoire() throws Exception {

        ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();

        for (Bateau bateau : bateaux) {
            ArrayList<Position> positions = genererPositionsAleatoiresValides(bateau.longueur);
            carte.placerBateau(bateau, positions);
        }
    }
    
    protected Position positionAleatoireValide() throws Exception {
        Position positionGenere = null;
        do {
            positionGenere = positionAleatoire();
        } while (!adversaire.getCarte().positionNonTirer(positionGenere));

        return positionGenere;
    }

    private ArrayList<Position> genererPositionsAleatoiresValides(int longueur) throws Exception {
        ArrayList<Position> positions;
        do {
            positions = carte.trouverPositionsAdjacentes(orientationAleatoire(), positionAleatoire(), longueur);

        } while (!carte.positionsDisponibles(positions));
        return positions;
    }

    private Orientation orientationAleatoire() {
        Random aleatoire = new Random();
        if (aleatoire.nextBoolean()) {
            return Orientation.Horizontal;
        } else {
            return Orientation.Vertical;
        }
    }
    
    private Position positionAleatoire() throws Exception {
        Random aleatoire = new Random();
        Position position = new Position(aleatoire.nextInt(carte.LARGEUR), aleatoire.nextInt(carte.HAUTEUR) + 1);
        return position;
    }

    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }
    
}
