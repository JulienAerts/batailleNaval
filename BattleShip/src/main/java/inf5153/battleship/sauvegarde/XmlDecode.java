/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.sauvegarde;

import inf5153.battleship.domain.*;
import java.util.Date;
import java.text.SimpleDateFormat;  
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author P.O
 */
public class XmlDecode {
    
    private static Partie xmlToPartie(Document lireDocXml) throws Exception {
        Partie laPartie = new Partie(chercherDate(lireDocXml));
       
        return laPartie;
    }
    
    private static Date chercherDate(Document ficXml) throws Exception {
        SimpleDateFormat formatter=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");   
        String S = ficXml.getRootElement().getAttribute("dateDebut").getValue();
        Date date  = formatter.parse(S);
        return date;
    }
    
    private static void lireBateauJoueur(Partie partie){
        ArrayList 
        
        partie.getJoueur1().placerBateau();
          
     }
    
    private static Joueur creerAi(){
        Joueur Joueur2 = new Ia(creerCarte(), creerListeCoup(), creerDifficulte());
        return Joueur2;
    }
    
    private static ArrayList<Coup> creerListeCoup(){
        
    }
    
    private static int creerDifficulte(Document lireDocXml){
    return String.valueOf(lireDocXml.getRootElement().getChild("Ia").getAttributeValue("difficulte"));
    }
    
    private static ArrayList<Coup> creerListeCoup(Document lireDocXml, String Joueur){
        ArrayList<Coup> list = new ArrayList<Coup>();
        Element root = lireDocXml.getRootElement().getChild(Joueur);
        for(Element curElem : root.getChild("Coup")){
            Position curPos = new Position(curElem.getChild("Coup").getAttribute("coordoneeX"), curElem.getChild("Coup").getAttribute("coordoneeY"));
            Case curCase = new Case (NULL ,curPos, NULL);
            
        }
        return list;
    }
    
    }
    
    
    
    
    
    
    
}
