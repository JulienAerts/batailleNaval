package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import java.util.ArrayList;
import java.util.List;
public class PartieControleur {

	private Partie partie;

	/**
	 * 
	 * @param partie
	 */
	public void setPartie(Partie partie) {
		this.partie = partie;
	}

	/**
	 * 
	 * @param positions
	 */
	public void placerBateau(ArrayList<Position> positions) {
		// TODO - implement PartieControleur.placerBateau
		throw new UnsupportedOperationException();
	}
	public void commencerPartie(ArrayList<Position> listePositionsBateauxJoueur, int niveauDifficulte)  throws Exception {
            // TODO: Validations du joueur1 ??
            partie = new Partie();
            partie.getJoueur1().placerBateauxUI(listePositionsBateauxJoueur);
            partie.getJoueur2().setDifficultee(niveauDifficulte);
            partie.getJoueur2().setAdversaire(partie.getJoueur1());
            partie.getJoueur2().placerBateauxAleatoire();
            
	}

        public ArrayList<Bateau> getBateauxIA() {
            return partie.getJoueur2().getCarte().getBateaux();
        }
        
        public ArrayList<Bateau> getBateauxJoueur() {
            return partie.getJoueur1().getCarte().getBateaux();
        }

	/**
	 * 
	 * @param position
	 */
	public Reponse jouerCoup(Position position) {
		Reponse reponse;
                if (partie.getJoueur2().getCarte().positionNonTirer(position)){
                    Case caseJouer  = partie.getJoueur2().jouerCoup(position);
                    Bateau touche;
                    if (caseJouer.bateauExiste()){
                        touche = caseJouer.getBateau();
                        if (touche.estCoule()){
                             if (partie.getJoueur2().getCarte().bateauxTousCouler()){
                            reponse = Reponse.PartieTerminee;
                        }else reponse = Reponse.ToucheCoule;
                        }else reponse = Reponse.Touche;                 
                    }else reponse = Reponse.Eau;
                }else reponse = Reponse.DejaTirer;


		return reponse;
	}
        
        public Reponse jouerCoupAI(Position position) {
		Reponse reponse;
                Case caseJouer  = partie.getJoueur1().jouerCoup(position);
                Bateau touche;
                if (caseJouer.bateauExiste()){
                    touche = caseJouer.getBateau();
                    if (touche.estCoule()){
                        if (partie.getJoueur1().getCarte().bateauxTousCouler()){
                            reponse = Reponse.PartieTerminee;
                        }else reponse = Reponse.ToucheCoule;
                    }else reponse = Reponse.Touche;                 
                }else reponse = Reponse.Eau;

		return reponse;
	}

	public void reinitialiserBateaux() {
		// TODO - implement PartieControleur.reinitialiserBateaux
		throw new UnsupportedOperationException();
	}

	public void sauvegarderPartie() {
		// TODO - implement PartieControleur.sauvegarderPartie
		throw new UnsupportedOperationException();
	}

	public Position genererCoupIA() {
		Position positionGenere =partie.getJoueur2().genererCoup();
                return positionGenere;
	}

	public Partie getPartie() {
		return this.partie;
	}

}