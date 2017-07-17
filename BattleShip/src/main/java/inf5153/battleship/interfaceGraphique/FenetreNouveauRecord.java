package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.domain.Partie;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class FenetreNouveauRecord extends FenetreFinRecord {

    private JButton btnSauvegarderRecord;
    private JTextArea txtNomduJouer;

    public FenetreNouveauRecord(Partie partie ,boolean victoire) {
        super(partie,victoire);
       initMessageNouveauRecord();

    }

    public void btnSauvegarderOnClickListener() {
        // TODO - implement FenetreNouveauRecord.btnSauvegarderOnClickListener
        throw new UnsupportedOperationException();
    }
    
     protected void initMessageNouveauRecord(){
            
        lblNouveauRecord.setVisible(true);
        lblEntrerNom.setVisible(true);
        entrerNom.setVisible(true);
        this.repaint();
            
        }

}
