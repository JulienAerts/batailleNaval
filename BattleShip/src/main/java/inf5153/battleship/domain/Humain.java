package inf5153.battleship.domain;

public class Humain extends Joueur {

	private String identifiant;

	public String getIdentifiant() {
		return this.identifiant;
	}

	/**
	 * 
	 * @param identifiant
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

}