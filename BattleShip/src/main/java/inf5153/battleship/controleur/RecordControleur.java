package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import java.util.ArrayList;

public class RecordControleur {

    /**
     *
     * @param nom
     * @param partie
     */
    public ArrayList<Record> listeDesRecords = new ArrayList<>();

    public void sauvegarderRecord(String nom, Partie partie) {
        long difference = partie.getDateFin().getTime() - partie.getDateDebut().getTime();
        Record nouveauRecord = new Record(nom, partie.getJoueur2().getDifficultee(), difference);
        listeDesRecords.add(nouveauRecord);
        
        
    }

    public void chargerRecordsHistorique() {
        // TODO - implement RecordControleur.consulterRecords
        throw new UnsupportedOperationException();
    }

    public ArrayList<Record> consulterRecords() {
        return listeDesRecords;
    }

    public boolean estUnRecord(Partie partie) {
        boolean record = false;
        long difference = partie.getDateFin().getTime() - partie.getDateDebut().getTime();
        int difficulte = partie.getJoueur2().getDifficultee();
        if (!listeDesRecords.isEmpty()) {
            for (Record rec : listeDesRecords) {
                record = true;
                if (difficulte == rec.difficulte) {
                    record = false;
                    if (difference > rec.temp) {
                        record = true;
                    }
                }
            }
        } else {
            record = true;
        }
        return record;
    }

}
