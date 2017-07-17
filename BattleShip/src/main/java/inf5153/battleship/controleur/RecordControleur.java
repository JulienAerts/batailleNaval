package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RecordControleur {

    private String cheminRecordFacile = System.getProperty("user.home")+"\\save_game\\record0.ser";
    private String cheminRecordDifficile = System.getProperty("user.home")+"\\save_game\\record1.ser";
    public ArrayList<Record> listeDesRecords = new ArrayList<>();

    public void sauvegarderRecord(String nom, Partie partie) {
        long difference = partie.getDateFin().getTime() - partie.getDateDebut().getTime();
        Record nouveauRecord = new Record(nom, partie.getJoueur2().getDifficultee(), difference);
        if (nouveauRecord.difficulte == 0 ){
            serializeRecord(nouveauRecord,cheminRecordFacile);
        }else{
            serializeRecord(nouveauRecord,cheminRecordDifficile);
        }
    }

    public void chargerRecordsHistorique() {
        listeDesRecords = new ArrayList<>();
        File fileRecordFacile = new File(cheminRecordFacile);
        File fileRecordDifficile = new File(cheminRecordDifficile);
        if (fileRecordFacile.exists()){
            listeDesRecords.add(deserialzeRecord(cheminRecordFacile));
        }
        if (fileRecordDifficile.exists()){
            listeDesRecords.add(deserialzeRecord(cheminRecordDifficile));
        }
        
    }

    public ArrayList<Record> consulterRecords() {
        return listeDesRecords;
    }
    
    public void serializeRecord(Record record , String chemin) {

		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		try {

			fout = new FileOutputStream(chemin);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(record);

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
    }
    
    public Record deserialzeRecord(String filename) {

		Record record = null;

		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try {

			fin = new FileInputStream(filename);
			ois = new ObjectInputStream(fin);
			record = (Record) ois.readObject();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		return record;

    }
    
    public boolean estUnRecord(Partie partie) {
        boolean record = false;
        int difficulte = partie.getJoueur2().getDifficultee();
        if (!listeDesRecords.isEmpty()) {
            for (Record rec : listeDesRecords) {
                record = true;
                if (difficulte == rec.difficulte) {
                    record = false;
                    if (partie.chronometre.getTempsExecution() > rec.temp) {
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
