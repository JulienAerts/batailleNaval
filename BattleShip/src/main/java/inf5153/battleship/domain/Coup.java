package inf5153.battleship.domain;

import java.util.Date;

public class Coup {

    private Date date;
    private Case casee;

    public Case getCase() {
        return casee;
    }

    public Coup(Case casee) {
        this.casee = casee;
        this.date = new Date();
    }
}