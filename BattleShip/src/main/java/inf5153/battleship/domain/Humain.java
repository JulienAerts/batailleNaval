package inf5153.battleship.domain;

import java.util.ArrayList;

public class Humain extends Joueur {

	private String identifiant;

        public Humain() throws Exception {
            
        }
        
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