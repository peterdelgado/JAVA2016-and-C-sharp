


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadecontactos.hashmap;
import java.util.*;
/**
 *
 * @author pedro
 */
public class AgendadeContactosHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
//        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        
        HashMap<Contactos, String> contactoshmap = new HashMap<Contactos,String>();  
        
        
        Contactos Pedro = new Contactos("Pedro Delgado", 654493561);
        Contactos Luis  = new Contactos("Luis Perral", 671888111);
        Contactos Pepe  = new Contactos("Pepe Lepiu", 611999111);
        Contactos MamaPepe = new Contactos("Mamade Pepe", 611999111);
        Contactos Jimmy = new Contactos ("Jimmy Choo", 620000333);
        
       contactoshmap.put(Pedro, "Pedro" );
       contactoshmap.put(Luis, "Luis");   
       contactoshmap.put(Pepe, "Pepe");
       contactoshmap.put(MamaPepe, "MamaP");
       
      Iterator Contactos = contactoshmap.keySet().iterator();
      while(Contactos.hasNext()){
      Object contactosObj = Contactos.next();
      
      String como = contactoshmap.get(contactosObj);
      
      System.out.println("Clave: " + contactosObj + " -> Valor: " + contactoshmap.getOrDefault(contactosObj, como));
      
      
      
        
    }
    
    }
}
