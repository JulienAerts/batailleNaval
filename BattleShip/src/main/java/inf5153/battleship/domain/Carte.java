package inf5153.battleship.domain;

import java.util.ArrayList;

public class Carte {
        public final int HAUTEUR = 10;
        public final int LARGEUR = 10;
        
	private Case[][] cases;
	private ArrayList<Case> bateaux;

        public Carte() {
            cases = new Case[HAUTEUR][LARGEUR];
        }
        
	/**
	 * 
	 * @param bateau
	 */
	public void placerBateau(Bateau bateau) {
		// TODO - implement Carte.placerBateau
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param position
	 */
	public Case getCase(Position position) {
		// TODO - implement Carte.getCase
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bateaux
	 */
	public void placerBateaux(ArrayList<Bateau> bateaux) {
		// TODO - implement Carte.placerBateaux
		throw new UnsupportedOperationException();
	}

}