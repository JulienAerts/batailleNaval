package inf5153.battleship.sauvegarde;

import java.io.File;
import java.io.FileOutputStream;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import static inf5153.battleship.sauvegarde.XmlEncode.partieToXml;
import inf5153.battleship.domain.Partie;
import static inf5153.battleship.sauvegarde.XmlDecode.xmlToPartie;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fichier {

    
    public static void ecrireFichierXml(Partie objPartie){
        try{
            Document docXml = new Document();
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
            String nomFichier = formatter.format(new Date());
            String extension = ".xml";
            String nomFichierAvecExtension = nomFichier.concat(extension);
            String repertoire = "./src/main/resources/sauvegarde/";
            String cheminComplet = repertoire.concat(nomFichierAvecExtension);
            partieToXml(docXml, objPartie);
            
            XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
            
            xmlOutput.output(docXml, new FileOutputStream(new File(cheminComplet)));

        }catch(Exception e){
         e.printStackTrace();
        }
        
    }
    
    
    public static Partie lireFichierXml(File fichier){
    
        SAXBuilder builder = new SAXBuilder();
        try{
        
            Document lireDocXml = builder.build(fichier);
            return xmlToPartie(lireDocXml);
            
        }catch(Exception e){
            e.printStackTrace();
             return null;
        }
    
    }

    
}
