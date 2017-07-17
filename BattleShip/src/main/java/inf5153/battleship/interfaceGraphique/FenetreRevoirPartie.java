package inf5153.battleship.interfaceGraphique;

import javax.swing.JButton;
import inf5153.battleship.controleur.RevoirPartieControleur;
import inf5153.battleship.domain.Partie;
import inf5153.battleship.domain.Position;
import java.awt.Color;

public class FenetreRevoirPartie extends FenetrePartie {

    private RevoirPartieControleur controleur;
    private JButton btnProchainCoup;
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
        
        btnFinPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });
        
        
        btnProchainCoup = new javax.swing.JButton();
        btnProchainCoup.setText("Prochain coup");
        btnProchainCoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prochainCoupOnClickListener();
            }
        });
        super.getContentPane().add(btnProchainCoup);
        btnProchainCoup.setBounds(330, 355, 140, 30);
    }

    public void prochainCoupOnClickListener() {
        Position position = controleur.prochainCoup();
        
        if(position != null) {
            colorierCaseAdversaire(position);
            position = controleur.prochainCoup();
            if(position != null)
                colorierCase(position);
        } else {
            btnProchainCoup.setEnabled(false);
        }
        controleur.prochainTour();

    }

    public void colorierCaseAdversaire(Position position) {
        mapBoutonsAdv[(position.getCoordonneXToInt()) + (position.getCoordonneY() - 1) * 10].setBackground(Color.BLUE);
    }

    public void colorierCase(Position position) {
        mapBoutonsJoueur[(position.getCoordonneXToInt()) + (position.getCoordonneY() - 1) * 10].setBackground(Color.BLUE);
    }

    /**
     *
     * @param position
     */
    public void ajouterCoupDansGrid(Position position) {
        // TODO - implement FenetreRevoirPartie.ajouterCoupDansGrid
        throw new UnsupportedOperationException();
    }

    public void btnRetourMenuOnClickListener() {
        // TODO - implement FenetreRevoirPartie.btnRetourMenuOnClickListener
        throw new UnsupportedOperationException();
    }

}
