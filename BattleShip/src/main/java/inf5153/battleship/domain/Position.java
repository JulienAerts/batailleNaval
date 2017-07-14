package inf5153.battleship.domain;

import java.util.Objects;

public class Position {

    private char coordonneX;
    private Integer coordonneY;

    public Position(char pCoordonneX, int pCoordonneY) throws Exception {
        coordonneX = pCoordonneX;
        coordonneY = pCoordonneY;

        validerCoordonnes();
    }

    /**
     * @param coordonneX Attention, commence à 0 si c'est un Int. a = 0 et j = 9
     */
    public Position(int pCoordonneX, int pCoordonneY) throws Exception {

        coordonneX = (char) (int) (pCoordonneX + 'a');
        coordonneY = pCoordonneY;

        validerCoordonnes();
    }

    private void validerCoordonnes() throws Exception {
        if (coordonneY < 1 || coordonneY > 10) {
            throw new Exception("La coordonnée Y doit être entre 1 et 10. (" + coordonneY + ")");
        }
        if (coordonneX < 'a' || coordonneX > 'j') {
            throw new Exception("La coordonnée X doit être entre a et j. (" + coordonneX + ")");
        }
    }

    
    /**
     * @param coordonneX Attention, commence à 0 si c'est un Int. a = 0 et j = 9
     */
    public int getCoordonneXToInt() {
        return (int) this.coordonneX - 'a';
    }

    public char getCoordonneX() {
        return this.coordonneX;
    }

    /**
     *
     * @param coordonneX
     */
    public void setCoordonneX(char coordonneX) throws Exception {
        this.coordonneX = coordonneX;
        validerCoordonnes();
    }

    public Integer getCoordonneY() {
        return this.coordonneY;
    }

    /**
     *
     * @param coordonneY
     */
    public void setCoordonneY(Integer coordonneY) throws Exception {
        this.coordonneY = coordonneY;
        validerCoordonnes();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.coordonneX != other.coordonneX) {
            return false;
        }
        if (!Objects.equals(this.coordonneY, other.coordonneY)) {
            return false;
        }
        return true;
    }
}
