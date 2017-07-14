package inf5153.battleship.domain;

import java.awt.Color;

public class Croiseur extends Bateau {
    public Croiseur() {
        longueur = 4;
    }
    @Override
    public Color getCouleur() {
        return Color.DARK_GRAY;
    }
}