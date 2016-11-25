



package excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            p.setNombre("Tom Cat");
            p.setEdad(5);
            p.setAltura(3);
            System.out.println(p);
        } catch (Exception ex) {
            System.out.println("Error al crear la persona: " + ex.getMessage());

       
        
        
        } 
    }
    
}
