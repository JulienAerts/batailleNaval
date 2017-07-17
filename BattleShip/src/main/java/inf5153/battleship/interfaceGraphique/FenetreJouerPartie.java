/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;

import java.util.ArrayList;
import inf5153.battleship.controleur.PartieControleur;
import inf5153.battleship.controleur.RecordControleur;
import inf5153.battleship.domain.Position;
import java.io.File;
import java.util.Date;

/**
 *
 * @author 0-pc
 */
public class FenetreJouerPartie extends FenetrePartie {

    private int niveauDif;
    private EffetPlacementBateaux placementBateaux;
    private EffetPlacementCoups placementCoups;
    private EffetChargementPartie effetChargementPartie;
    public PartieControleur controleur;
    public RecordControleur controleurRecord;

    public FenetreJouerPartie() {
        try {
            super.initComponents();
            initListener();
            init_mapBoutonsJoueur();
            init_mapBoutonsAdv();
            controleur = new PartieControleur();
            controleurRecord = new RecordControleur();
        } catch (Exception ex) {
            txtJournalisation.append(ex.getMessage());
        }
    }

    public FenetreJouerPartie(int nivDif) {
        niveauDif = nivDif;
        try {
            super.initComponents();
            initListener();
            init_mapBoutonsJoueur();
            init_mapBoutonsAdv();
            txtJournalisation.append("Place les bateaux sur ta grille !\n");
            placementBateaux = new EffetPlacementBateaux(this);
            controleur = new PartieControleur();
            controleurRecord = new RecordControleur();
        } catch (Exception ex) {
            txtJournalisation.append(ex.getMessage());
        }
    }

    private void initListener() {

        btnDemarrerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemarrerPartieMouseClicked(evt);
            }
        });
        btnChangerOrientation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangerOrientationActionPerformed(evt);
            }
        });

        btnReinitialise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinitialiseActionPerformed(evt);
            }
        });

        btnFinPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinPartieActionPerformed(evt);
            }
        });

        btnSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarderActionPerformed(evt);
            }
        });

    }

    private void btnChangerOrientationActionPerformed(java.awt.event.ActionEvent evt) {
        placementBateaux.orientation = !placementBateaux.orientation;
    }

    private void btnReinitialiseActionPerformed(java.awt.event.ActionEvent evt) {
        placementBateaux.réinitialiserEffets();
    }

    private void btnFinPartieActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.sauvegarderPartie();
    }

    private void btnDemarrerPartieMouseClicked(java.awt.event.ActionEvent evt) {
        try {
            controleur.commencerPartie(getListePositionsBateauxJoueur(placementBateaux.boutonsEnMemoire), niveauDif);
            affichageBoutonDebutPartie();
            txtJournalisation.append("Tire sur une des cases de ton adversaire!\n");
            placementCoups = new EffetPlacementCoups(this, mapBoutonsJoueur, mapBoutonsAdv);

        } catch (Exception ex) {
            txtJournalisation.append("Une erreur est survenue lors du démarrage de la partie : " + ex.getMessage());
        }
    }

    public void chargementDePartie(File fichier) {
        controleur.chargerPartie(fichier);
        affichageBoutonDebutPartie();
        txtJournalisation.append("Partie charger!");
        effetChargementPartie = new EffetChargementPartie(this);
        effetChargementPartie.placerBateaux(controleur.getBateauxJoueur());
        effetChargementPartie.placerCoupJoueur();
        effetChargementPartie.placerCoupAI();
        placementCoups = new EffetPlacementCoups(this, mapBoutonsJoueur, mapBoutonsAdv);
    }

    public void finDePartie(boolean victoire) {
        controleur.getPartie().chronometre.arretChrono();

        FenetreFinRecord fenetreFinRecord;

        if (victoire && controleurRecord.estUnRecord(controleur.getPartie())) {
            fenetreFinRecord = new FenetreNouveauRecord(controleur.getPartie(),victoire);
        } else {
            fenetreFinRecord = new FenetreFinRecord(controleur.getPartie(),victoire);
        }

        fenetreFinRecord.pack();
        fenetreFinRecord.setLocationRelativeTo(null);
        fenetreFinRecord.setVisible(true);
        dispose();

    }

    private ArrayList<Position> getListePositionsBateauxJoueur(BoutonCustom listeBoutonsBateauxJoueur[]) {
        ArrayList<Position> arrlist = new ArrayList<>(17);
        for (int i = 0; i < 17; i++) {
            arrlist.add(listeBoutonsBateauxJoueur[i].position);
        }
        return arrlist;

    }

    private void affichageBoutonDebutPartie() {

        btnSauvegarder.setEnabled(true);
        btnDemarrerPartie.setEnabled(false);
        btnReinitialise.setEnabled(false);
        btnChangerOrientation.setEnabled(false);
        btnFinPartie.setEnabled(true);
    }

}
