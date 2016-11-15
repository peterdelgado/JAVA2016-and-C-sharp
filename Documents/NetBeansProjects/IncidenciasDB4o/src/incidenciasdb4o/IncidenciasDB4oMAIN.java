
package incidenciasdb4o;
import com.db4o.*;
import java.util.List;
/**
 *
 * @author pedro
 */
public class IncidenciasDB4oMAIN {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    IncidenciasBDOO gestor = new IncidenciasBDOO();
    Empleados E = new Empleados(1,"pdelgado","pepe","Peter Delgado", 654493561);
    if (gestor.insertarEmpleado(E)){
        System.out.println("Empleado dado de alta:");
        System.out.println(E);
  }
    else  {
            System.out.println("El Empleado no se ha dado de alta:");
        }
    
    Empleados P = new Empleados(2,"jvelazquez","tete","Jose Velazquez:", 654493561);
    if (gestor.insertarEmpleado(P)){
        System.out.println("Empleado dado de alta");
         System.out.println(P);
  }
    else  {
            System.out.println("El Empleado no se ha dado de alta.");
        }
   
    Empleados C = new Empleados(3,"jchoo","coco","Jimmy Choo", 654493561);
//    if (gestor.insertarEmpleado(C)){
//        System.out.println("Empleado dado de alta");
//         System.out.println(C);
//  }
//    else  {
//            System.out.println("El Empleado no se ha dado de alta.");
//        }
    
    List<Empleados> misEmpleados = gestor.selectAllEmpleados();
        if (misEmpleados != null) {
            System.out.println("Listado de Empleados");
            for (Empleados a : misEmpleados) {
                System.out.println(a);
            }
        }
   
    
    
    gestor.validarEmpleado("pdelgado","pepe");
    
    Empleados D = new Empleados(1,"pdelgado","pepe","Peter RAFAEL Delgado", 654493561);
    gestor.modificarEmpleado(E, D);
 
    Empleados F = new Empleados(2, "jvelasquez", "lolo", "Jose Velasquez", 654493561);
    gestor.modificarContrasenyadeEmpleado(P, F);
    
    
    gestor.deleteEmpleado(C);
   
    gestor.selectAllEmpleados();
    if (misEmpleados != null) {
            System.out.println("Listado de Empleados Modificados");
            for (Empleados a : misEmpleados) {
                System.out.println(a);
            }
        }
  
     
   DBIncidencias A = new DBIncidencias(1,"5:00,25/08/16","pdelgado","jvelasquez","No funciona Wifi","U");
   DBIncidencias B = new DBIncidencias(2,"5:00,25/08/16","jvelasquez","pdelgado","No funcione laptop","U");
   
   gestor.insertarIncidencia(A,"jvelasquez");
   gestor.insertarIncidencia(B,"pdelgado");
   
   List<DBIncidencias> misIncidencias = gestor.selectAllIncidencias();
   if (misIncidencias != null) {
            System.out.println("Listado de Incidencias");
            for (DBIncidencias a : misIncidencias) {
                System.out.println(a);
            }
        }
   
   List<Historial> miHistoriales = gestor.selectHistorial();
   if (miHistoriales != null) {
            System.out.println("Listado de Historial");
            for (Historial a : miHistoriales) {
                System.out.println(a);
            }
        }
   
   gestor.ObtenerIdIncidencias(2);
   gestor.ObtenerIdaPartirdeClaseEmpleado("pdelgado");
   gestor.ObtenerIncidenciasNombredeEmpleados("pdelgado");

    gestor.eliminarEmpleados();
    gestor.eliminarIncidencias();
    gestor.eliminarHistorial();
    gestor.cerrar();
    
    }
    
   
}

