
       

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
import static inf5153.battleship.domain.Orientation.Vertical;
import inf5153.battleship.domain.Partie;
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
       Element Carte = new Element("Carte");
       Ia.setAttribute("difficulte", Integer.toString(objPartie.getJoueur2().getDifficultee()));
       
       
       for ( Coup coupPresent : objPartie.getJoueur1().getCoups()) {
           ecrireCoup(Joueur, coupPresent.getCases().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());       
       }
       
       for ( Coup coupPresent : objPartie.getJoueur2().getCoups()) {
           ecrireCoup(Ia, coupPresent.getCases().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());
       }
       
       
       doc.setRootElement(partie);
       partie.addContent(Joueur);
       Joueur.addContent(Carte);
       partie.addContent(Ia);
       Ia.addContent(Carte);
  
       
   
   }
    


   
   private static void ecrireCoup(Element Joueur, char X, int Y) {
   
       Element Coup = new Element("coup");
       Element CoordoneeX = new Element("coordoneeX");
       Element CoordonneY = new Element("coordonneY");
       CoordoneeX.addContent(new Text(X));
       CoordonneY.addContent(new Text(Integer.toString(Y)));
       Joueur.addContent(Coup);
       Coup.addContent(CoordoneeX);
       Coup.addContent(CoordonneY);
       
   
   }
   
   private static void ecrireBateau(Element Joueur, Joueur player) {
       Element eleBateau = new Element("Bateau");
       Element longBateau = new Element("Longeur");
       Element positionBateau = new Element("position");       
       Element Case = new Element("Case");
       for(Bateau curBateau : player.getCarte().getBateaux()){
           eleBateau.setAttribute("orientation", ecrireOrientation(curBateau));
           eleBateau.setAttribute("EstCoule", ecrireCoule(curBateau));
           longBateau.addContent(new Text(Integer.toString(curBateau.getLongeur())));
           for(Case curCase : curBateau.getCases() ) {
               Case.setAttribute("coordonneeX", curCase.getPosition().getCoordonneX());
               Case.setAttribute("CoordoneeY", curCase.getPosition().getCoordonneY());
               
           
           }
           eleBateau.addContent(Joueur);
           longBateau.addContent(eleBateau);
           positionBateau.addContent(eleBateau);
           Case.addContent(positionBateau);
           
       }
       
   
   }
   
   
   
   private static int ecrireOrientation(Bateau curBateau){
       if(curBateau.getOrientation() == Vertical){
           return 0;
       }
       return 1;
   }
   
   private static int ecrireCoule(Bateau curBateau){
       if(curBateau.estCoule() == false ){
           return 1;
       }
       return 0;
   
   }
   
    
}
