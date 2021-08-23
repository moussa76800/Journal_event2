/**
 * 
 */
package icc.be.poo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author Moussa
 *
 */
public class MyUtilities {

	public static XStream xstream = new XStream(new DomDriver());

	// Serialisation

	public static void toXMLFile(Concert concert, String filename) {

		// ConfigurationXStream

		xstream.alias("concert", Concert.class);
		xstream.alias("designation", Concert.class);
		xstream.alias("Artiste",Artiste.class);
        xstream.useAttributeFor("dateCreation",Artiste.class);
        xstream.addImplicitCollection(Concert.class,"artistes");
        
        //convertir en String xml et sauve dans le fichier
        
        try {
			xstream.toXML(concert,new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        /*
    	 * Déserialisation
    	 */
    	public static Concert fromXml(String fileName) {

    		// Configuration XStream
    		xstream.alias("concert", Concert.class);
    		xstream.useAttributeFor(Concert.class, "designation");
    		xstream.alias("Artiste", Artiste.class);
    		xstream.useAttributeFor(Artiste.class, "dateCreation");
    		xstream.addImplicitCollection(Concert.class, "artistes");
    		// Récuperer l'objet
    		return (Concert) xstream.fromXML(new File(fileName));
    	}

    	public static XStream Json = new XStream(new JsonHierarchicalStreamDriver());
    	public static XStream fromJson = new XStream(new JettisonMappedXmlDriver());

    	/*
    	 * sérialisation en Json
    	 */
    	public static void toJsonFile(Concert concert, String fileName) {

    		// Configuration XStream
    		Json.alias("concert", Concert.class);
    		Json.alias("Artiste", Artiste.class);
    		Json.useAttributeFor(Artiste.class, "dateCreation");
    		Json.addImplicitCollection(Concert.class, "artistes");

    		// Convertir en String json et sauve dans le fichier texte
    		try {
    			Json.toXML(concert, new FileWriter(fileName));
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

    	}

    	/*
    	 * Déserialisation en Json
    	 */
    	public static Concert fromJson(String fileName) {

    		// Configuration XStream
    		fromJson.alias("concert", Concert.class);
    		fromJson.alias("Artiste", Artiste.class);
    		fromJson.useAttributeFor(Artiste.class, "dateCreation");
    		fromJson.addImplicitCollection(Concert.class, "artistes");

    		// Récuperer l'objet

    		return (Concert) fromJson.fromXML(new File(fileName));
    	}
	}
