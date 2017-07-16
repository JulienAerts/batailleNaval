package inf5153.battleship.domain;

import inf5153.battleship.controleur.*;

public class Case {

    private Coup tir;

    public Coup getTir() {
        return tir;
    }
    private Position position;
    private Bateau bateau;
    private Reponse reponse;

    public Bateau getBateau() {
        return bateau;
    }

    public Position getPosition() {
        return position;
    }

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
        if(bateau == null)
            return false;
        return true;
    }

    public Reponse getReponse() {
            return reponse;
    }
    
    public void setReponse(Reponse reponse) {
            this.reponse = reponse;
    }

    public boolean bateauExiste() {
        if(bateau == null)
            return false;
        return true;
    }

}