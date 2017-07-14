package inf5153.battleship.domain;

import java.awt.Color;

public class PorteAvion extends Bateau {
    
    public PorteAvion() {
        longueur = 5;
    }
    @Override
    public Color getCouleur() {
        return Color.gray;
    }
}