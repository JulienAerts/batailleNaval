/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvegarde;

import org.jdom2.Element;

/**
 *
 * @author P.O
 */
public class XmlDecode {
    
    private static Partie xmlToPartie(Document lireDocXml) {
    
        
    
    }
    
   
    
    private static Joueur creerJoeur(){
            Joueur Jouer1 = new Joueur(creerCarte(),creerListeCoup());
           return Joueur1;
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
