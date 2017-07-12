package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

	private Position positionAleatoire() {
		// TODO - implement IA.positionAleatoire
		throw new UnsupportedOperationException();
	}

	public List<Bateau> choisirPositionsBateaux() {
            List<Bateau> bateaux = new ArrayList();
            
            Bateau bateau = new PorteAvion();
            
            Random aleatoire = new Random();
            
            int positionInitiale = 7; // aleatoire.nextInteger(10);
            boolean estHorizontal = true;//aleatoire.nextBoolean();
            
            ArrayList<Integer> positions = new ArrayList();
            
            
            ArrayList<Position> positionsTemp = new ArrayList();
            if(estHorizontal) {
                if(positionInitiale + bateau.longueur < carte.LARGEUR) {
                    for(int i = positionInitiale; i < carte.LARGEUR && positionsTemp.size() < bateau.longueur; i++) {
                        positionsTemp.add(new Position(i, positionInitiale));
                    }
                }
                else {
                    for(int i = positionInitiale; i > 0 && positionsTemp.size() < bateau.longueur; i--) {
                        positionsTemp.add(new Position(i, positionInitiale));
                    }
                }
            }
            else {
                if(positionInitiale + bateau.longueur <= carte.HAUTEUR) {
                    for(int i = positionInitiale; i < carte.HAUTEUR && positionsTemp.size() < bateau.longueur; i++) {
                        positionsTemp.add(new Position(positionInitiale, i));
                    }
                }
                else {
                    for(int i = positionInitiale; i > 0 && positionsTemp.size() < bateau.longueur; i--) {
                        positionsTemp.add(new Position(positionInitiale, i));
                    }
                }
            }
            
//            for(Position position : positionsTemp) {
//                if(positions.contains(position))
//                    return true;
//            }
//            return false;
            
            carte.placerBateau(bateau);
            
            bateaux.add(bateau);
            
            
            return new ArrayList<Bateau>();
	}

}