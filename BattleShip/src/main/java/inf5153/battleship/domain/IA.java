package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.Random;

public class IA extends Joueur {

	private Integer difficultee;
        private Joueur adversaire;
        public IA() throws Exception {
        }
        
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
        
        public void setAdversaire(Joueur adversaire) {
		this.adversaire = adversaire;
	}
        
	public Position genererCoup() {
            
            Position positionGenere = null;
            try
            {
		if (difficultee == 0){
                    
                    positionGenere = positionFacile();
                    
                }else  positionGenere = positionMiniMax();
            }catch(Exception ex) {
            
            }
            return positionGenere;
	}
        
        public Position positionFacile() throws Exception{
            Position positionGenere  = null;
            do{
            positionGenere = positionAleatoire();
            }while(!adversaire.getCarte().positionNonTirer(positionGenere));
            
            return positionGenere;
        }
        
	public Position positionMiniMax() throws Exception {
            Coup dernierCoup = dernierCoupBateauTouche();
            
            if(dernierCoup == null)
                return positionFacile();
            else {
                
                Position position = dernierCoup.getCase().getPosition();
                Position adjacente = positionAdjacente(position);
                
                ArrayList<Coup> coupExclure = new ArrayList();
                while(adjacente == null) {
                    // Si on est pas capable de généré une position adjacente, on doit chercher alentour d'un autre coup.
                    coupExclure.add(dernierCoup);
                    dernierCoup = dernierCoupBateauToucheExclureCoup(coupExclure);
                    
                    // Si on ne trouve pas d'autre, coup il a y probablement une erreur, donc on envoi une position aléatoire.
                    if(dernierCoup == null)
                        return positionFacile();
                    
                    adjacente = positionAdjacente(dernierCoup.getCase().getPosition());
                    
                }
                return adjacente;
            }
	}
        
        private Position positionAdjacente(Position position) throws Exception {
            Position adjacente = null;
            if(position.getCoordonneXToInt() < Position.MAX_X && !coupDejaEffectue(new Position(position.getCoordonneXToInt() + 1, position.getCoordonneY()))) {
                adjacente = new Position(position.getCoordonneXToInt() + 1, position.getCoordonneY());
            }
            else if(position.getCoordonneY() < Position.MAX_Y && !coupDejaEffectue(new Position(position.getCoordonneXToInt(), position.getCoordonneY() + 1))) {
                adjacente = new Position(position.getCoordonneXToInt(), position.getCoordonneY() + 1);
            }
            else if(position.getCoordonneXToInt() > Position.MIN_X && !coupDejaEffectue(new Position(position.getCoordonneXToInt() - 1, position.getCoordonneY()))) {
                adjacente = new Position(position.getCoordonneXToInt() - 1, position.getCoordonneY());
            }
            else if(position.getCoordonneY() > Position.MIN_Y && !coupDejaEffectue(new Position(position.getCoordonneXToInt(), position.getCoordonneY() - 1))) {
                adjacente = new Position(position.getCoordonneXToInt(), position.getCoordonneY() - 1);
            }
            return adjacente;
        }
        
        private boolean coupDejaEffectue(Position position) {
            for(Coup coup : adversaire.getCoups()) {
                if(coup.getCase().getPosition().equals(position))
                    return true;
            }
            return false;
        }
        
        private Coup dernierCoupBateauTouche() {
            for(Coup coup : adversaire.getCoups()) {
                if(coup.getCase().bateauTouche() && !coup.getCase().getBateau().estCoule()) {
                    return coup;
                }
            }
            return null;
        }
        
        private Coup dernierCoupBateauToucheExclureCoup(ArrayList<Coup> coupExclu) {
            for(Coup coup : adversaire.getCoups()) {
                if(coup.getCase().bateauTouche() && !coupExclu.contains(coup) && !coup.getCase().getBateau().estCoule()) {
                    return coup;
                }
            }
            return null;
        }

	public void placerBateauxAleatoire() throws Exception {
            
            ArrayList<Bateau> bateaux = BateauFactory.genererTousLesBateaux();
            
            for(Bateau bateau : bateaux){
                
                ArrayList<Position> positions = genererPositionsAleatoiresValides(bateau.longueur);
                
                carte.placerBateau(bateau, positions);

            }
	}
        
        private ArrayList<Position> genererPositionsAleatoiresValides(int longueur) throws Exception {
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
        
        private Position positionAleatoire() throws Exception {
            Random aleatoire = new Random();
            Position position;
            // +1 parce que la position commence à a,1
            position = new Position(aleatoire.nextInt(carte.LARGEUR), aleatoire.nextInt(carte.HAUTEUR) + 1);
            return position;
        }

}