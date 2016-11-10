/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incidenciasjdbc;

import com.db4o.*;

public class idb4oIncidencias {
    
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
