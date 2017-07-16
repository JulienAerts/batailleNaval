package inf5153.battleship.domain;

import java.util.ArrayList;

public abstract class Joueur {

	protected Carte carte;
	protected ArrayList<Coup> coups;

        public Joueur() throws Exception {
            carte = new Carte();
            coups = new ArrayList<Coup>();
        }
        
	public ArrayList<Coup> getCoups() {
		return this.coups;
	}

	/**
	 * 
	 * @param position
	 */
	public Case jouerCoup(Position position) {
            Coup coup = new Coup(carte.getCase(position));
            coups.add(coup);
            carte.getCase(position).setTir(coup);
            return carte.getCase(position);
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
        
        public void placerBateaux(ArrayList<Position> positions) throws Exception {
            
            ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();
            
            for(Bateau bateau : bateaux){
                
                ArrayList<Position> positionsBateau = new ArrayList<Position>(positions.subList(0, bateau.longueur));
                positions.removeAll(positionsBateau);
                carte.placerBateau(bateau, positionsBateau);

            }
            
            
	}

}