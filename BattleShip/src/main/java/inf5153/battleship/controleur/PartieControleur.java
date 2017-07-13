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

	public void commencerPartie(ArrayList<Position> listePositionsBateauxJoueur ,int niveauDifficulte) {
            // TODO: Validations du joueur1 ??
            try
            {
                partie = new Partie();
                partie.getJoueur2().placerBateauxAleatoire();
            }
            catch(Exception ex)
            {
                // Écrire dans le log de l'écran
            }
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
                if (partie.getJoueur2().jouerCoup(position).bateauExiste()){
                    
                     reponse = Reponse.Touche;
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