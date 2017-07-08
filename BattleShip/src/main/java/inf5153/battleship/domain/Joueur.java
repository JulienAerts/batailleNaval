package inf5153.battleship.domain;

import java.util.ArrayList;

public abstract class Joueur {

	private Carte carte;
	private ArrayList<Coup> coups;

	public ArrayList<Coup> getCoups() {
		return this.coups;
	}

	/**
	 * 
	 * @param position
	 */
	public Case jouerCoup(Position position) {
		// TODO - implement Joueur.jouerCoup
		throw new UnsupportedOperationException();
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

}