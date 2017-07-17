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
import java.util.Locale;
import java.util.TimeZone;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author P.O
 */
public class XmlDecode {
    
    public static Partie xmlToPartie(Document lireDocXml) throws Exception {
        
        Partie laPartie = new Partie(chercherDate(lireDocXml), Integer.parseInt(lireDocXml.getRootElement().getChild("IA").getAttributeValue("difficulte")));
        
        lireBateauJoueur(laPartie.getJoueur1(), lireDocXml);
        lireBateauAI(laPartie.getJoueur2(), lireDocXml);
        
        if (!lireDocXml.getRootElement().getChild("Joueur").getChildren("coup").isEmpty()){
            lireListeDeCoup(lireDocXml, laPartie);
            lireListeDeCoupAi(lireDocXml, laPartie);      
        }
        
       
        return laPartie;
    }
    
    
    
    private static Date chercherDate(Document ficXml) throws Exception {
        SimpleDateFormat formatter=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",new Locale("en_US"));
        formatter.setTimeZone(TimeZone.getTimeZone("EDT"));
        String S = ficXml.getRootElement().getAttribute("dateDebut").getValue();
        Date date  = formatter.parse(S);
        return date;
    }
    
    private static void lireListeDeCoup(Document ficXml, Partie partie) throws Exception {
        ArrayList<Coup> listeCoup = new ArrayList();
        Element lireCoup = ficXml.getRootElement().getChild("Joueur");
        for(Element curCoup : lireCoup.getChildren("coup")){
            Position curPosition = new Position(curCoup.getAttributeValue("CoordoneeX").charAt(0), Integer.parseInt(curCoup.getAttributeValue("CoordonneY")));
            partie.getJoueur2().jouerCoup(curPosition);
        }
    }
    
    
    private static void lireListeDeCoupAi(Document ficXml, Partie partie) throws Exception {
        ArrayList<Coup> listeCoup = new ArrayList();
        Element lireCoup = ficXml.getRootElement().getChild("IA");
        for(Element curCoup : lireCoup.getChildren("coup")){
            Position curPosition = new Position(curCoup.getAttributeValue("CoordoneeX").charAt(0), Integer.parseInt(curCoup.getAttributeValue("CoordonneY")));
            partie.getJoueur1().jouerCoup(curPosition);
        }
    }
    
    private static void lireBateauJoueur(Joueur joueur, Document ficXml) throws Exception {
        ArrayList<Position> listeBateauJoueur  = new ArrayList();
        Element lirejoueur = ficXml.getRootElement().getChild("Joueur");
        for(Element bateau : lirejoueur.getChildren("Bateau")){
            for (Element position : bateau.getChild("position").getChildren()){
                Position curPosition = new Position(position.getAttributeValue("coordonneeX").charAt(0), Integer.parseInt(position.getAttributeValue("CoordoneeY")));
                listeBateauJoueur.add(curPosition);
            }
        }
       joueur.placerBateaux(listeBateauJoueur);
          
    }
    
    private static void lireBateauAI(Joueur joueur, Document ficXml) throws Exception {
        ArrayList<Position> listeBateauJoueur  = new ArrayList();
        Element lirejoueur = ficXml.getRootElement().getChild("IA");
        for(Element bateau : lirejoueur.getChildren("Bateau")){
            for (Element position : bateau.getChild("position").getChildren()){
                Position curPosition = new Position(position.getAttributeValue("coordonneeX").charAt(0), Integer.parseInt(position.getAttributeValue("CoordoneeY")));
                listeBateauJoueur.add(curPosition);
            }
        }
       joueur.placerBateaux(listeBateauJoueur);
          
    }
    }
