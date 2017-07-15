package inf5153.battleship.domain;

import java.util.Date;

public class Record {

	private String nom;
	public long temp;
	public Integer difficulte;
        
        public Record(String Nom,int difficulte,long temp) {
            this.nom = nom;
            this.difficulte = difficulte;
            this.temp = temp;
        }
        
        
}