package inf5153.battleship.domain;

import java.awt.Color;

public class ContreTorpilleur extends Bateau {
    public ContreTorpilleur() {
        longueur = 3;
    }
    
    @Override
    public Color getCouleur() {
        return Color.MAGENTA;
    }
}