/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incidenciasjdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class IncidenciasMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JDBCIncidencias miGestor = new JDBCIncidencias();
        Empleados E = new Empleados(1,"pdelgado","pepe","Peter Delgado", 654493561);
        try {
            System.out.println("Insertando Datos...");
            miGestor.InsertarEmpleado(E);
            System.out.println("Datos Insertado");
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
//            Logger.getLogger(IncidenciasMAIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
