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
        Empleados J = new Empleados(2, "jvelasquez", "tete", "Jose Velasquez", 617899567);
//      DBIncidencias D = new DBIncidencias(1,"5:00,25/08/16","jvalesquez","pdelgado","No funciona Wifi","Urgente");
        DBIncidencias C = new DBIncidencias(2,"4:00,25/08/16",J,E,"No funciona portatil","Urgente");
       
       
        try {
             
//               miGestor.InsertarEmpleado(J);
            
//                miGestor.insertarIncidencia(C);
              
//               miGestor.ModificarEmpleado(E);
//               System.out.println("Empleado Modificado");
//               
//               miGestor.CambiarContrasenya(E);
//               System.out.println("Contrasenya Cambiada");
//               
////////         miGestor.EliminarEmpleado(E);
//////           System.out.println("Empleado Eliminado");
//               
           
               if (miGestor.ValidarUsuario("jvelasquez", "pepe")){
                   System.out.println("Usuario Validado");
            
              
                
                
            }
            
            System.out.println("Insertando Datos...");
     
//            miGestor.InsertarIncidencia(D);
//            miGestor.InsertarIncidencia(C);
            System.out.println("Datos Insertado");
            System.out.println("Listado de Incidencias");
            
//       List<DBIncidencias> lasIncidencias = miGestor.selectallIncidencias();
//       for (DBIncidencias actual : lasIncidencias){
//       System.out.println(actual);
//       }
       
       System.out.println("ListadodeUnaIncidencia");
//        
       List<DBIncidencias> UnaIncidencias = miGestor.selectaIncidencias();
       for (DBIncidencias actual : UnaIncidencias){
       System.out.println(actual);
       
       }
//       
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
            Logger.getLogger(IncidenciasMAIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
