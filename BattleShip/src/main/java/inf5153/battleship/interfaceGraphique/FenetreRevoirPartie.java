package inf5153.battleship.interfaceGraphique;

import javax.swing.JButton;
import inf5153.battleship.controleur.RevoirPartieControleur;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Partie;
import inf5153.battleship.domain.Position;
import java.awt.Color;

public class FenetreRevoirPartie extends FenetrePartie {

    private RevoirPartieControleur controleur;
    private JButton btnRetourMenu;

    public FenetreRevoirPartie(Partie partie) throws Exception {
        super.initComponents();
        controleur = new RevoirPartieControleur(partie);
        
        init_mapBoutonsJoueur();
        init_mapBoutonsAdv();
        
        btnChangerOrientation.setVisible(false);
        btnDemarrerPartie.setVisible(false);
        btnReinitialise.setVisible(false);
        btnSauvegarder.setVisible(false);
        pnlMesBateaux.setVisible(false);
        txtJournalisation.setVisible(false);
        jScrollJournalisation.setVisible(false);
        btnProchainCoup.setVisible(true);
        btnFinPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });
        
        
     
        btnProchainCoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prochainCoupOnClickListener();
            }
        });

    }

    public void prochainCoupOnClickListener() {
        Case casee = controleur.prochainCoup();
        
        if(casee != null) {
            colorierCaseAdversaire(casee);
            casee = controleur.prochainCoup();
            if(casee != null)
                colorierCase(casee);
        } else {
            btnProchainCoup.setEnabled(false);
        }
        controleur.prochainTour();

    }

    public void colorierCaseAdversaire(Case casee) {
        Color couleur = Color.BLUE;
        if(casee.bateauExiste())
            couleur = Color.RED;
        
        mapBoutonsAdv[(casee.getPosition().getCoordonneXToInt()) + (casee.getPosition().getCoordonneY() - 1) * 10].setBackground(couleur);
    }

    public void colorierCase(Case casee) {
        Color couleur = Color.BLUE;
        if(casee.bateauExiste())
            couleur = Color.RED;
        
        mapBoutonsJoueur[(casee.getPosition().getCoordonneXToInt()) + (casee.getPosition().getCoordonneY() - 1) * 10].setBackground(couleur);
    }
}
