package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.Random;

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

	public void placerBateauxAleatoire() throws Exception {
            
            ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();
            
            for(Bateau bateau : bateaux){
                
                ArrayList<Position> positions = genererPositionsAleatoiresValides(bateau.longueur);

                carte.placerBateau(bateau, positions);

            }
	}
        
        private ArrayList<Position> genererPositionsAleatoiresValides(int longueur) {
            ArrayList<Position> positions;
            do
            {
                positions = carte.trouverPositionsAdjacentes(orientationAleatoire(), positionAleatoire(), longueur);

            } while(!carte.positionsDisponibles(positions));
            return positions;
        }

        private Orientation orientationAleatoire() {
            Random aleatoire = new Random();
            if(aleatoire.nextBoolean())
                return Orientation.Horizontal;
            else
                return Orientation.Vertical;
        }
        
        private Position positionAleatoire() {
            Random aleatoire = new Random();
            Position position;
            position = new Position(aleatoire.nextInt(carte.LARGEUR), aleatoire.nextInt(carte.HAUTEUR));
            return position;
        }

}