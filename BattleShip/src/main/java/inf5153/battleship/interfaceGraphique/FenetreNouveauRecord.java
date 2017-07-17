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
            updateTableauScore();
        }
    }
    
    private void updateTableauScore(){
        int i =0;
        int l =0;
        String niveau;

        for (Record record :controleur.consulterRecords()){
            if (record.difficulte==0){
                niveau = "facile";
            }else  niveau = "difficile";
            tblMeilleureTemps.setValueAt(record.nom, i, l);
            tblMeilleureTemps.setValueAt(niveau, i, l+1);
            tblMeilleureTemps.setValueAt(((record.temp/1000)/60)+" secondes", i, l+2);
            l =0;
            i =i+1;
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
