package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.domain.Partie;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class FenetreFinRecord extends FenetreRecords {

    public JButton btnRevoirPartie;
    private Partie partie;

    public FenetreFinRecord(Partie partie) {
        initExtraComponents();
        super.initComponents();
        this.partie = partie;
    }

    public void btnRevoirPartieOnClickListener(java.awt.event.ActionEvent evt) throws Exception {
        
        FenetreRevoirPartie fenetrePartie = new FenetreRevoirPartie(partie);
        fenetrePartie.pack();
        fenetrePartie.setLocationRelativeTo(null);
        fenetrePartie.setVisible(true);
        dispose();
    }

    void initExtraComponents() {
        btnRevoirPartie = new javax.swing.JButton();
        btnRevoirPartie.setText("Revoir la partie");
        btnRevoirPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnRevoirPartieOnClickListener(evt);
                } catch (Exception ex) {
                    Logger.getLogger(FenetreFinRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnRevoirPartie.setBounds(200, 520, 140, 30);
        super.getContentPane().add(btnRevoirPartie);
    }

}
