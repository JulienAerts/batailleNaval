package inf5153.battleship.domain;

import java.awt.Color;

public class SousMarin extends Bateau {
    public SousMarin() {
        longueur = 3;
    }
    
    @Override
    public Color getCouleur() {
        return Color.BLUE;
    }
}