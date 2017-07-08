package inf5153.battleship.domain;

import java.util.List;

public class IA extends Joueur {

	private Integer difficultee;

	public Integer getDifficultee() {
		return this.difficultee;
	}

	/**
	 * 
	 * @param difficultee
	 */
	public void setDifficultee(Integer difficultee) {
		this.difficultee = difficultee;
	}

	public Position genererCoup() {
		// TODO - implement IA.genererCoup
		throw new UnsupportedOperationException();
	}

	private Position positionMiniMax() {
		// TODO - implement IA.positionMiniMax
		throw new UnsupportedOperationException();
	}

	private Position positionAleatoire() {
		// TODO - implement IA.positionAleatoire
		throw new UnsupportedOperationException();
	}

	public List<Bateau> choisirPositionsBateaux() {
		// TODO - implement IA.choisirPositionsBateaux
		throw new UnsupportedOperationException();
	}

}