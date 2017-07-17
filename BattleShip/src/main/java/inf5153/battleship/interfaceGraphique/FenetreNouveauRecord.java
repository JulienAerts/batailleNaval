package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.domain.Partie;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class FenetreNouveauRecord extends FenetreFinRecord {

    private JButton btnSauvegarderRecord;
    private JTextArea txtNomduJouer;

    public FenetreNouveauRecord(Partie partie ,boolean victoire) {
        super(partie,victoire);
       

    }

    public void btnSauvegarderOnClickListener() {
        // TODO - implement FenetreNouveauRecord.btnSauvegarderOnClickListener
        throw new UnsupportedOperationException();
    }

}
