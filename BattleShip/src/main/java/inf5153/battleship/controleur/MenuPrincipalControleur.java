package inf5153.battleship.controleur;

import inf5153.battleship.domain.*;
import java.io.File;
import static inf5153.battleship.sauvegarde.Fichier.lireFichierXml;

public class MenuPrincipalControleur {

    public Partie chargerPartie(File fichier) {
        Partie partie = lireFichierXml(fichier);
        return partie;
    }

}
