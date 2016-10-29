/**
 * 
 */
package gestionIncidencias;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 * @author pedro
 *
 */
public class GestionIncidenciasSAX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			
			LectorIncidencias L = new LectorIncidencias();
			parser.parse(new File("incidencias.xml"), L);
		    
			
			for (Incidencias l : L.getLasIncidencias()){
			System.out.println("FechayHora:"+ l.getfechahora());
			System.out.println("Origen: " + l.getOrigen());
            System.out.println("Destino: " + l.getDestino());
            System.out.println("Detalle: " + l.getDetalle());
            System.out.println("Tipo: " + l.getTipo());
            System.out.println("*************************");
			
			}
			
			//for (int i = 0; i < L.getLasIncidencias().size(); i++);
		    //int i = 0;
			//System.out.println(L.getLasIncidencias().get(i).getDetalle());
		
		
		} catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(GestionIncidenciasSAX.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
