package inf5153.battleship.interfaceGraphique;
import javax.swing.JButton;
import inf5153.battleship.domain.Position;

public class BoutonCustom extends JButton {

    public Position position;
    
    public BoutonCustom(Position position) {
        this.position = position;
    }
}

