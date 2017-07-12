package inf5153.battleship.domain;

import inf5153.battleship.controleur.*;

public class Case {

    private Coup tir;
    private Position position;
    private Bateau bateau;

    public Case(Position position) {
        tir = null;
        bateau = null;
        this.position = position;
    }

    public void setTir(Coup tir) {
        this.tir = tir;
    }

    public void setBateau(Bateau bateau) {
        this.bateau = bateau;
    }
        
    public boolean bateauTouche() {
            // TODO - implement Case.bateauTouche
            throw new UnsupportedOperationException();
    }

    public Reponse getReponse() {
            // TODO - implement Case.getReponse
            throw new UnsupportedOperationException();
    }

    public boolean bateauExiste() {
        if(bateau == null)
            return false;
        return true;
    }

}