
       

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
       
       Ia.setAttribute("difficulte", Integer.toString(objPartie.getJoueur2().getDifficultee()));
       
       
       for ( Coup coupPresent : objPartie.getJoueur1().getCoups()) {
           ecrireCoup(Joueur, coupPresent.getCase().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());       
       }
       
       for ( Coup coupPresent : objPartie.getJoueur2().getCoups()) {
           ecrireCoup(Ia, coupPresent.getCase().getPosition().getCoordonneX(), coupPresent.getCase().getPosition().getCoordonneY());
       }
       
       ecrireBateau(Joueur, objPartie.getJoueur1());
       
       ecrireBateau(Ia, objPartie.getJoueur2());
       
       doc.setRootElement(partie);
       partie.addContent(Joueur);
       partie.addContent(Ia);
    
       
   
   }
    


   
   private static void ecrireCoup(Element Joueur, char X, int Y) {
   
       Element Coup = new Element("coup");
       Element CoordoneeX = new Element("coordoneeX");
       Element CoordonneY = new Element("coordonneY");
       CoordoneeX.addContent(new Text(Character.toString(X)));
       CoordonneY.addContent(new Text(Integer.toString(Y)));
       
       Coup.addContent(CoordoneeX);
       Coup.addContent(CoordonneY);
       Joueur.addContent(Coup);
       
       
   
   }
   
   private static void ecrireBateau(Element Joueur, Joueur player) {
       
       
       Element eleBateau = new Element("Bateau");
       
       Element positionBateau = new Element("position");       
       Element Case = new Element("Case");
       
       for(Bateau curBateau : player.getCarte().getBateaux()){
           
           eleBateau.setAttribute("EstCoule", Integer.toString(ecrireCoule(curBateau)));
           eleBateau.setAttribute("Longeur", Integer.toString(curBateau.getLongeur()));
           
           for(Case curCase : curBateau.getCases() ) {
               
               Case.setAttribute("coordonneeX", Character.toString(curCase.getPosition().getCoordonneX()));
               Case.setAttribute("CoordoneeY", Integer.toString(curCase.getPosition().getCoordonneY()));
               
           
           }
           
           eleBateau.addContent(Joueur);
           positionBateau.addContent(eleBateau);
           Case.addContent(positionBateau);
           
       }
       
   
   }
   
   private static int ecrireCoule(Bateau curBateau){
       if(curBateau.estCoule() == false ){
           return 1;
       }
       return 0;
   
   }
   
    
}
