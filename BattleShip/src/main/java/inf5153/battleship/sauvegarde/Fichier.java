/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.sauvegarde;

import java.io.File;
import java.io.FileOutputStream;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import static inf5153.battleship.sauvegarde.XmlEncode.partieToXml;
import inf5153.battleship.domain.Partie;

/**
 *
 * @author P.O
 */
public class Fichier {
    
    
    public static void ecrireFichierXml(Partie objPartie){
        try{
            Document docXml = new Document();
            
            partieToXml(docXml, objPartie);
            
            XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

            xmlOutput.output(docXml, new FileOutputStream(new File("./src/sauvegarde.xml")));

        }catch(Exception e){
         e.printStackTrace();
        }
        
    }
    
    
    private static void lireFichierXml(){
    
        SAXBuilder builder = new SAXBuilder();
        try{
        
            Document lireDocXml = builder.build(new File("./src/sauvegarde.xml"));

            
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
}
