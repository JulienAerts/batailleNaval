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
        
        public void placerBateauxUI(ArrayList<Position> positions) throws Exception {
            
            ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();
            
            for(Bateau bateau : bateaux){
                
                ArrayList<Position> positionsBateau = new ArrayList<Position>(positions.subList(0, bateau.longueur));
                positions.removeAll(positionsBateau);
                carte.placerBateau(bateau, positionsBateau);

            }
	}

}