package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.domain.Partie;
import inf5153.battleship.domain.Record;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FenetreNouveauRecord extends FenetreFinRecord {

    private JButton btnSauvegarderRecord;
    private JTextArea txtNomduJouer;

    public FenetreNouveauRecord(Partie partie ,boolean victoire) {
        super(partie,victoire);
       initMessageNouveauRecord();

    }

    private void btnSauvegarderOnClickListener(java.awt.event.ActionEvent evt) {
        String nom = entrerNom.getText();
        if (!nom.isEmpty()){
            controleur.sauvegarderRecord(nom,partie);
            btnSauvegarder.setEnabled(false);
            entrerNom.setEnabled(false);
            btnSauvegarder.setText("Record sauvegarder!");
            controleur.chargerRecordsHistorique();
            informationVersGrid();
        }
    }
    
     protected void initMessageNouveauRecord(){
            
        lblNouveauRecord.setVisible(true);
        lblEntrerNom.setVisible(true);
        entrerNom.setVisible(true);
        btnSauvegarder.setVisible(true);
        btnSauvegarder.setEnabled(false);
        
        btnSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarderOnClickListener(evt);
            }
        });
       
        entrerNom.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                btnSauvegarder.setEnabled(true);
            }
            public void removeUpdate(DocumentEvent e) {
               btnSauvegarder.setEnabled(true);
            }
            public void insertUpdate(DocumentEvent e) {
              btnSauvegarder.setEnabled(true);
            }
        });
        
        this.repaint();
            
        }


}
