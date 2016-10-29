//clase para manejar los eventos de SAX a leer xml

package gestionIncidencias;

import java.util.ArrayList;

import javax.swing.text.html.parser.Element;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LectorIncidencias extends DefaultHandler {
     private ArrayList<Incidencias> lasIncidencias;
     private Incidencias IncidenciaActual;
	 int elementoActual = 0;
	 //
	 //
     //String detalle= "";
     //String tipo= "";
	 
	 public LectorIncidencias() {
	
		lasIncidencias = new ArrayList<>();
		
	}
	  
	
	


	public ArrayList<Incidencias> getLasIncidencias() {
		return lasIncidencias;
	}



	@Override
	public void startElement(String uri, String localname, String qName, Attributes atrbts) throws SAXException {
		
		if (qName.equals("incidencia")) {
	  
			
		// cree una nueva incidencia
	    IncidenciaActual = new Incidencias();
	    //guarder el atributo
	    IncidenciaActual.setfechahora(atrbts.getValue(atrbts.getQName(0)));
	    elementoActual = 0;
		
		
		}
		
	    else if (qName.equals("origen"))  {
	       	
	    elementoActual = 2;
        
	}
	     else if (qName.equals("destino")) {
	    	
	     elementoActual  = 3;
	    }
   
	     else if (qName.equals("detalle")) {
		    	
		 elementoActual  = 4;
		    }
	
	     else if (qName.equals("tipo")) {
		    	
		 elementoActual  = 5;
		    }
	
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		//inicializar el variable
		
		
		if (elementoActual==2) {
			String origen = "";
			for (int i=start; i<length+start; i++)
			
				origen=origen+ch[i];
			IncidenciaActual.setOrigen(origen);
			
			elementoActual=0;
			
		
		}
		else if (elementoActual==3) {
			String destino= "";
			for (int i=start; i<length+start; i++)
			destino=destino+ch[i];
			IncidenciaActual.setDestino(destino);
		    elementoActual = 0;
		}
		else if (elementoActual==4) {
			String detalle = "";
			for (int i=start; i<length+start; i++)
			detalle=detalle+ch[i];
			IncidenciaActual.setDetalle(detalle);
		    elementoActual = 0;
		
		}
	
		else if (elementoActual==5) {
			String tipo = "";
			for (int i=start; i<length+start; i++)
			tipo=tipo+ch[i];
			IncidenciaActual.setTipo(tipo);
		    elementoActual = 0;
		}
	
	
	}
		
       
		
		
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if (qName.equals("incidencia")) {
		lasIncidencias.add(IncidenciaActual);
		
		}
	
		
		 //if (qName.equals("origen")) {
			
		//lasIncidencias.add(IncidenciaActual);	
				
		   
		
	}

   
			
}		
			
			
			
		  


	
	
	
	

