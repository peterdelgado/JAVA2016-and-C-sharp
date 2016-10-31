/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incidenciasjdbc;

import java.sql.SQLException;
import java.util.List;
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
    public static void main(String[] args) throws SQLException {
        
        JDBCIncidencias miGestor = new JDBCIncidencias();
        Empleados E = new Empleados(1,"pdelgado","pepe","Peter Delgado", 654493561);
        DBIncidencias D = new DBIncidencias(1,"5:00,25/08/16","jvalesquez","pdelgado","No funciona Wifi","Urgente");
        DBIncidencias C = new DBIncidencias(2,"4:00,25/08/16","dwinston","tlopez","No funciona portatil","Urgente");
        
        
        try {
            
            if (miGestor.ValidarUsuario("jvelasquez", "tete")){
            
            
                System.out.println("Usuario Validado");
            }
            
            System.out.println("Insertando Datos...");
//          miGestor.InsertarEmpleado(E);
//            miGestor.InsertarIncidencia(D);
//            miGestor.InsertarIncidencia(C);
            System.out.println("Datos Insertado");
            System.out.println("Listado de Incidencia");
            
       List<DBIncidencias> lasIncidencias = miGestor.selectallIncidencias();
       for (DBIncidencias actual : lasIncidencias){
       System.out.println(actual);
       }
       
        
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
////            Logger.getLogger(IncidenciasMAIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
