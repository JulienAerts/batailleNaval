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
            partie.getJoueur2().placerBateauxAleatoire();
	}

        public ArrayList<Bateau> getBateauxIA() {
            return partie.getJoueur2().getCarte().getBateaux();
        }

	/**
	 * 
	 * @param position
	 */
	public Reponse jouerCoup(Position position) {
		Reponse reponse;
                Case caseJouer  = partie.getJoueur2().jouerCoup(position);
                Bateau touche;
                if (caseJouer.bateauExiste()){
                    touche = caseJouer.getBateau();
                    if (touche.estCoule()){
                        reponse = Reponse.ToucheCoule;
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

	public boolean autreJoueurEstPret() {
		// TODO - implement PartieControleur.autreJoueurEstPret
		throw new UnsupportedOperationException();
	}

	public boolean estMonTour() {
		// TODO - implement PartieControleur.estMonTour
		throw new UnsupportedOperationException();
	}

	public Position attendreCoupAdversaire() {
		// TODO - implement PartieControleur.attendreCoupAdversaire
		throw new UnsupportedOperationException();
	}

	public boolean partieTerminee() {
		// TODO - implement PartieControleur.partieTerminee
		throw new UnsupportedOperationException();
	}

	public boolean estUnRecord() {
		// TODO - implement PartieControleur.estUnRecord
		throw new UnsupportedOperationException();
	}

	public Position genererCoupIA() {
		// TODO - implement PartieControleur.genererCoupIA
		throw new UnsupportedOperationException();
	}

	public Partie getPartie() {
		return this.partie;
	}

}