package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import java.util.ArrayList;
public class PartieControleur {

	private Partie partie;

	/**
	 * 
	 * @param partie
	 */
	public void setPartie(Partie partie) {
		this.partie = partie;
	}

	/**
	 * 
	 * @param positions
	 */
	public void placerBateau(ArrayList<Position> positions) {
		// TODO - implement PartieControleur.placerBateau
		throw new UnsupportedOperationException();
	}

	public void commencerPartie() {
		// TODO - implement PartieControleur.commencerPartie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param position
	 */
	public Reponse jouerCoup(Position position) {
		// TODO - implement PartieControleur.jouerCoup
		throw new UnsupportedOperationException();
	}

	public void reinitialiserBateaux() {
		// TODO - implement PartieControleur.reinitialiserBateaux
		throw new UnsupportedOperationException();
	}

	public void sauvegarderPartie() {
		// TODO - implement PartieControleur.sauvegarderPartie
		throw new UnsupportedOperationException();
	}

	public boolean autreJoueurEstPret() {
		// TODO - implement PartieControleur.autreJoueurEstPret
		throw new UnsupportedOperationException();
	}

	public boolean estMonTour() {
		// TODO - implement PartieControleur.estMonTour
		throw new UnsupportedOperationException();
	}

	public Position attendreCoupAdversaire() {
		// TODO - implement PartieControleur.attendreCoupAdversaire
		throw new UnsupportedOperationException();
	}

	public boolean partieTerminee() {
		// TODO - implement PartieControleur.partieTerminee
		throw new UnsupportedOperationException();
	}

	public boolean estUnRecord() {
		// TODO - implement PartieControleur.estUnRecord
		throw new UnsupportedOperationException();
	}

	public Position genererCoupIA() {
		// TODO - implement PartieControleur.genererCoupIA
		throw new UnsupportedOperationException();
	}

	public Partie getPartie() {
		return this.partie;
	}

}