package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.List;

public class Carte {
        public static final int HAUTEUR = 10;
        public static final int LARGEUR = 10;
        
	private Case[][] cases;
	private ArrayList<Bateau> bateaux;

        public ArrayList<Bateau> getBateaux() {
            return bateaux;
        }

        public Carte() throws Exception {
            cases = new Case[HAUTEUR][LARGEUR];
            
            for(int x = 0; x < LARGEUR; x++) {
                for(int y = 0; y < HAUTEUR; y++)
                    cases[x][y] = new Case(new Position(x + 1, y + 1));
            }
            bateaux = new ArrayList<Bateau>();
        }
        
	/**
	 * 
	 * @param bateau
	 */
	public void placerBateau(Bateau bateau, ArrayList<Position> positions) throws Exception {
           
            for(Position position : positions) {
                bateau.addCase(getCase(position));
                getCase(position).setBateau(bateau);
            }
            bateaux.add(bateau);
	}
        
        public boolean positionsDisponibles(List<Position> positions) {
            for(Position position : positions) {
                if(getCase(position).bateauExiste())
                    return false;
            }
            return true;
        }
        
	public ArrayList<Position> trouverPositionsAdjacentes(Orientation orientation, Position position, int longueur) throws Exception {
            
            ArrayList<Position> positions = new ArrayList();
            int positionInitiale;
            if(orientation == Orientation.Horizontal) {
                positionInitiale = position.getCoordonneXToInt();
                
                if(positionInitiale + longueur < LARGEUR) {
                    for(int i = positionInitiale; i < LARGEUR && positions.size() < longueur; i++) {
                        positions.add(new Position(i, positionInitiale));
                    }
                }
                else {
                    for(int i = positionInitiale; i > 0 && positions.size() < longueur; i--) {
                        positions.add(new Position(i, positionInitiale));
                    }
                }
            }
            else {
                positionInitiale = position.getCoordonneY();
                
                if(positionInitiale + longueur <= HAUTEUR) {
                    for(int i = positionInitiale; i < HAUTEUR && positions.size() < longueur; i++) {
                        positions.add(new Position(positionInitiale, i));
                    }
                }
                else {
                    for(int i = positionInitiale; i > 0 && positions.size() < longueur; i--) {
                        positions.add(new Position(positionInitiale, i));
                    }
                }
            }
            return positions;
	}

	/**
	 * 
	 * @param position
	 */
	public Case getCase(Position position) {
            Case casea = cases[position.getCoordonneXToInt()][position.getCoordonneY()-1];
            return casea;
	}

}