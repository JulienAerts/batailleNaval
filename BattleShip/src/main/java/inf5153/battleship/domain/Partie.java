package inf5153.battleship.domain;

import java.util.Date;

public class Partie {

	private Date debut;
	private Date fin;
	private Humain joueur1;
	private IA joueur2;

        public Partie() throws Exception {
            debut = new Date();
            joueur1 = new Humain();
            joueur2 = new IA();
        }
        
	public void sauvegarde() {
		// TODO - implement Partie.sauvegarde
		throw new UnsupportedOperationException();
	}

	public Humain getJoueur1() {
		return this.joueur1;
	}

	/**
	 * 
	 * @param joueur1
	 */
	public void setJoueur1(Humain joueur1) {
		this.joueur1 = joueur1;
	}

	public IA getJoueur2() {
		return this.joueur2;
	}
        
        /**
	 * 
	 * @param fin
	 */
	public void setDateFin(Date fin) {
		this.fin = fin;
	}

	public Date getDateFin() {
		return this.fin;
	}
        
        public Date getDateDebut() {
		return this.debut;
	}

	/**
	 * 
	 * @param joueur2
	 */
	public void setJoueur2(IA joueur2) {
		this.joueur2 = joueur2;
	}

}