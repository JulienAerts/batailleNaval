/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvegarde;

import java.io.File;
import java.io.FileOutputStream;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import static sauvegarde.XmlEncode.partieToXml;


/**
 *
 * @author P.O
 */
public class Fichier {
    
    
    private static void ecrireFichierXml(Partie objPartie){
        try{
            Document docXml = new Document();
            
            partieToXml(docXml, partie);
            
            XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

            xmlOutput.output(docXml, new FileOutputStream(new File("./src/sauvegarde.xml")));

        }catch(Exception e){
        
        }
        
    }
    
    
    private static void lireFichierXml(){
    
        SAXBuilder builder = new SAXBuilder();
        try{
        
            Document lireDocXml = builder.build(new File("./src/sauvegarde.xml"));

            
        }catch(Exception e){
        
        }
    
    }
    
}
