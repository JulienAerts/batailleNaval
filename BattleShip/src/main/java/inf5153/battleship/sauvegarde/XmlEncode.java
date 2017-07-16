
       

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.sauvegarde;


import inf5153.battleship.domain.Bateau;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Coup;
import inf5153.battleship.domain.Joueur;
import inf5153.battleship.domain.Partie;
import java.util.Date;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Text;

/**
 *
 * @author P.O
 */




public class XmlEncode {
    
    
   public static void partieToXml(Document doc, Partie objPartie) {
      

       Element partie = new Element("partie");
       Element Joueur = new Element("Joueur");
       Element Ia = new Element("IA");
       
       partie.setAttribute("dateDebut", String.valueOf(objPartie.getDateDebut()));
       Ia.setAttribute("difficulte", Integer.toString(objPartie.getJoueur2().getDifficultee()));
        
       
       
       for ( Coup coupPresent : objPartie.getJoueur1().getCoups()) {
           ecrireCoup(Ia, coupPresent.getCase().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());       
       }
       
       for ( Coup coupPresent : objPartie.getJoueur2().getCoups()) {
           ecrireCoup(Joueur, coupPresent.getCase().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());
       }
       
       ecrireBateau(Joueur, objPartie.getJoueur1());
       
       ecrireBateau(Ia, objPartie.getJoueur2());
       
       doc.setRootElement(partie);
       partie.addContent(Joueur);
       partie.addContent(Ia);
    
       
   
   }
    


   
   private static void ecrireCoup(Element Joueur, char X, int Y) {
   
       Element Coup = new Element("coup");
      
       Coup.setAttribute("CoordoneeX", Character.toString(X));
       Coup.setAttribute("CoordonneY", Integer.toString(Y));
       

       Joueur.addContent(Coup);
       
       
   
   }
   
   private static void ecrireBateau(Element Joueur, Joueur player) {
       
         
       for(Bateau curBateau : player.getCarte().getBateaux()){
            
            Element eleBateau = new Element("Bateau");
            Element positionBateau = new Element("position");       
            
           
           eleBateau.setAttribute("EstCoule", Integer.toString(ecrireCoule(curBateau)));
           eleBateau.setAttribute("Longeur", Integer.toString(curBateau.getLongeur()));
           
           for(Case curCase : curBateau.getCases() ) {
               
               Element Case = new Element("Case");
               
               Case.setAttribute("coordonneeX", Character.toString(curCase.getPosition().getCoordonneX()));
               Case.setAttribute("CoordoneeY", Integer.toString(curCase.getPosition().getCoordonneY()));
               
               positionBateau.addContent(Case);
           
           }
           
           eleBateau.addContent(positionBateau);
           Joueur.addContent(eleBateau);
           
          
           
       }
       
   
   }
   
   private static int ecrireCoule(Bateau curBateau){
       if(curBateau.estCoule() == false ){
           return 1;
       }
       return 0;
   
   }
   
    
}
