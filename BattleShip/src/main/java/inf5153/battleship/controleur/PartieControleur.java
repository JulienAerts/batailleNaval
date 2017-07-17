package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import static inf5153.battleship.sauvegarde.Fichier.ecrireFichierXml;
import java.util.ArrayList;
import static inf5153.battleship.sauvegarde.Fichier.lireFichierXml;
import java.io.File;

public class PartieControleur {

    private Partie partie;

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public void commencerPartie(ArrayList<Position> listePositionsBateauxJoueur, int niveauDifficulte) throws Exception {
        
        partie = new Partie(niveauDifficulte);
        partie.getJoueur1().placerBateaux(listePositionsBateauxJoueur);
        partie.getJoueur2().placerBateauxAleatoire();

    }

    public ArrayList<Bateau> getBateauxIA() {
        return partie.getJoueur2().getCarte().getBateaux();
    }

    public ArrayList<Bateau> getBateauxJoueur() {
        return partie.getJoueur1().getCarte().getBateaux();
    }

    public Reponse jouerCoup(Position position) {
        Reponse reponse;
        if (partie.getJoueur2().getCarte().positionNonTirer(position)) {
            Case caseJouer = partie.getJoueur2().jouerCoup(position);
            Bateau touche;
            if (caseJouer.bateauExiste()) {
                touche = caseJouer.getBateau();
                if (touche.estCoule()) {
                    if (partie.getJoueur2().getCarte().bateauxTousCouler()) {
                        reponse = Reponse.PartieTerminee;
                    } else {
                        reponse = Reponse.ToucheCoule;
                    }
                } else {
                    reponse = Reponse.Touche;
                }
            } else {
                reponse = Reponse.Eau;
            }
        } else {
            reponse = Reponse.DejaTirer;
        }

        return reponse;
    }

    public Reponse jouerCoupAI(Position position) {
        Reponse reponse;
        Case caseJouer = partie.getJoueur1().jouerCoup(position);
        Bateau touche;
        if (caseJouer.bateauExiste()) {
            touche = caseJouer.getBateau();
            if (touche.estCoule()) {
                if (partie.getJoueur1().getCarte().bateauxTousCouler()) {
                    reponse = Reponse.PartieTerminee;
                } else {
                    reponse = Reponse.ToucheCoule;
                }
            } else {
                reponse = Reponse.Touche;
            }
        } else {
            reponse = Reponse.Eau;
        }

        return reponse;
    }

    public ArrayList<Case> getListeCoupJoueur() {
        ArrayList<Case> positions = new ArrayList();

        for (Coup coup : partie.getJoueur1().getCoups()) {

            positions.add(coup.getCase());
        }

        return positions;
    }

    public ArrayList<Case> getListeCoupAI() {
        ArrayList<Case> positions = new ArrayList();

        for (Coup coup : partie.getJoueur2().getCoups()) {

            positions.add(coup.getCase());

        }

        return positions;
    }


    public void sauvegarderPartie() {
        ecrireFichierXml(partie);

    }

    public void chargerPartie(File fichier) {
        partie = lireFichierXml(fichier);
        partie.getJoueur2().setAdversaire(partie.getJoueur1());
    }

    public Position genererCoupIA() throws Exception {
        Position positionGenere = partie.getJoueur2().genererCoup();
        return positionGenere;
    }

    public Partie getPartie() {
        return this.partie;
    }
    

}
