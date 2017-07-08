package inf5153.battleship.domain;

public class Position {

	private char coordonneX;
	private Integer coordonneY;

	public char getCoordonneX() {
		return this.coordonneX;
	}

	/**
	 * 
	 * @param coordonneX
	 */
	public void setCoordonneX(char coordonneX) {
		this.coordonneX = coordonneX;
	}

	public Integer getCoordonneY() {
		return this.coordonneY;
	}

	/**
	 * 
	 * @param coordonneY
	 */
	public void setCoordonneY(Integer coordonneY) {
		this.coordonneY = coordonneY;
	}

}