package inf5153.battleship.domain;

import java.awt.Color;

public class Torpilleur extends Bateau {
    public Torpilleur() {
        longueur = 2;
    }
    
    @Override
    public Color getCouleur() {
        return Color.orange;
    }
}