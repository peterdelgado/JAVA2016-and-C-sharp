/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionIncidencias;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 *
 * @author pedro
 */
public class Traslado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    try {
            Incidencias LasIncidencias = new Incidencias();
            BufferedReader in = new BufferedReader(new FileReader("incidencias.txt"));
            Incidencias IncidenciaActual;
            String linea;
            while ((linea = in.readLine()) != null) {
                IncidenciaActual = new Incidencias();
             
                
                IncidenciaActual.setfechahora(linea);
                linea = in.readLine();
                IncidenciaActual.setOrigen(linea);
                linea = in.readLine();
                IncidenciaActual.setDestino(linea);
                linea = in.readLine();
                IncidenciaActual.setDetalle(linea);
                linea = in.readLine();
                IncidenciaActual.setTipo(linea);
               
              
               
            }
            
                        in.close();
			

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Traslado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Traslado.class.getName()).log(Level.SEVERE, null, ex);
       

    }
    }
    }