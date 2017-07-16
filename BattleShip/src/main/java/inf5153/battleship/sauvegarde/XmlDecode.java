/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.sauvegarde;

import inf5153.battleship.domain.*;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author P.O
 */
public class XmlDecode {
    
    public static Partie xmlToPartie(Document lireDocXml) throws Exception {
        Partie laPartie = new Partie(chercherDate(lireDocXml));
        laPartie.getJoueur2().setDifficultee(Integer.parseInt(lireDocXml.getRootElement().getChild("IA").getAttributeValue("difficulte")));
        lireBateauJoueur(laPartie.getJoueur1(), lireDocXml);
        lireBateauJoueur(laPartie.getJoueur2(), lireDocXml);
        
        if (lireDocXml.getRootElement().getChildren("coup") != null){
            lireListeDeCoup(lireDocXml, laPartie);
            lireListeDeCoupAi(lireDocXml, laPartie);      
        }
        
       
        return laPartie;
    }
    
    
    
    private static Date chercherDate(Document ficXml) throws Exception {
        SimpleDateFormat formatter=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");   
        String S = ficXml.getRootElement().getAttribute("dateDebut").getValue();
        Date date  = formatter.parse(S);
        return date;
    }
    
    private static void lireListeDeCoup(Document ficXml, Partie partie) throws Exception {
        ArrayList<Coup> listeCoup = new ArrayList();
        Element lireCoup = ficXml.getRootElement().getChild("Joueur");
        for(Element curCoup : lireCoup.getChildren("coup")){
            Position curPosition = new Position(curCoup.getAttributeValue("CoordoneeX").charAt(0), Integer.parseInt(curCoup.getAttributeValue("CoordoneeX")));
            partie.getJoueur2().jouerCoup(curPosition);
        }
    }
    
    
    private static void lireListeDeCoupAi(Document ficXml, Partie partie) throws Exception {
        ArrayList<Coup> listeCoup = new ArrayList();
        Element lireCoup = ficXml.getRootElement().getChild("AI");
        for(Element curCoup : lireCoup.getChildren("coup")){
            Position curPosition = new Position(curCoup.getAttributeValue("CoordoneeX").charAt(0), Integer.parseInt(curCoup.getAttributeValue("CoordoneeX")));
            partie.getJoueur1().jouerCoup(curPosition);
        }
    }
    
    private static void lireBateauJoueur(Joueur joueur, Document ficXml) throws Exception {
        ArrayList<Position> listeBateauJoueur  = new ArrayList();
        Element lirejoueur = ficXml.getRootElement().getChild("Joueur");
        for(Element elem : lirejoueur.getChildren("bateau")){
            Position curPosition = new Position(elem.getAttributeValue("coordonneeX").charAt(0), Integer.parseInt(elem.getAttributeValue("CoordoneeY")));
            listeBateauJoueur.add(curPosition);
        }
        
       joueur.placerBateaux(listeBateauJoueur);
          
     }
    }
