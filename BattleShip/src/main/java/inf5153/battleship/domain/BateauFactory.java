/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import java.util.ArrayList;

/**
 *
 * @author Tommy
 */
public class BateauFactory {
    public static ArrayList<Bateau> genererTousLesBateaux() {
        ArrayList<Bateau> bateaux = new ArrayList();

        Bateau bateau = new PorteAvion();
        bateaux.add(bateau);
        bateau = new Croiseur();
        bateaux.add(bateau);
        bateau = new ContreTorpilleur();
        bateaux.add(bateau);
        bateau = new SousMarin();
        bateaux.add(bateau);
        bateau = new Torpilleur();
        bateaux.add(bateau);
        
        return bateaux;
    }
}
