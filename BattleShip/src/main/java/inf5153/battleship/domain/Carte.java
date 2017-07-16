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
                    cases[x][y] = new Case(new Position(x, y + 1));
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
        
        public boolean positionNonTirer(Position position) {
            if (getCase(position).getTir() == null){
                 return true;
            }else return false;
        }
        
        public boolean bateauxTousCouler() {
            boolean reponse = true;
            for (Bateau bateau :bateaux){
                if (reponse){
                    reponse = bateau.estCoule();
                }
            }
            return reponse;
        }
        
	public ArrayList<Position> trouverPositionsAdjacentes(Orientation orientation, Position positionDepart, int longueur) throws Exception {
            
            ArrayList<Position> positions = new ArrayList();
            
            if(orientation == Orientation.Horizontal) {
                
                if(positionDepart.getCoordonneXToInt() + longueur <= LARGEUR) {
                    for(int i = positionDepart.getCoordonneXToInt(); i < LARGEUR && positions.size() < longueur; i++) {
                        positions.add(new Position(i, positionDepart.getCoordonneY()));
                    }
                }
                else {
                    for(int i = positionDepart.getCoordonneXToInt(); i > 0 && positions.size() < longueur; i--) {
                        positions.add(new Position(i, positionDepart.getCoordonneY()));
                    }
                }
            }
            else {
                
                if(positionDepart.getCoordonneY() + longueur <= HAUTEUR + 1) {
                    for(int i = positionDepart.getCoordonneY(); i <= HAUTEUR && positions.size() < longueur; i++) {
                        positions.add(new Position(positionDepart.getCoordonneX(), i));
                    }
                }
                else {
                    for(int i = positionDepart.getCoordonneY(); i > 0 && positions.size() < longueur; i--) {
                        positions.add(new Position(positionDepart.getCoordonneX(), i));
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