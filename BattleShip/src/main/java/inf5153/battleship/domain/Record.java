package inf5153.battleship.domain;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {

    public String nom;
    public long temp;
    public Integer difficulte;

    public Record(String nom, int difficulte, long temp) {
        this.nom = nom;
        this.difficulte = difficulte;
        this.temp = temp;
    }

}
