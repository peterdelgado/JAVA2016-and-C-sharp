
package incidenciasdb4o;
import com.db4o.*;
/**
 *
 * @author pedro
 */
public class IncidenciasDB4oMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Incidenciasdb4o");
try
{
 Empleados E = new Empleados(1,"pdelgado","pepe","Peter Delgado", 654493561);
 db.store(E);  
 System.out.println("Stored:" + E);
 
 
 Empleados J = new Empleados(2, "jvelasquez", "tete", "Jose Velasquez", 617899567);
 db.store(J);
 System.out.println("Stored:" + J);
 
}
finally
{
 db.close();
}

    
    
}
}