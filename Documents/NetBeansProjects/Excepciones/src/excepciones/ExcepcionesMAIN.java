/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author pedro
 */
public class ExcepcionesMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String message;
        
        try {
            Persona p = new Persona();
            p.setNombre("Mar");
            p.setEdad(55);
            System.out.println(p);
        } catch (Exception ex) {
            System.out.println("Error al crear la persona: " + ex.getMessage());
//            Logger.getLogger(ExcepcionesMAIN.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
