
package incidenciasdb4o;
import com.db4o.*;
import com.db4o.ext.Db4oException;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pedro
 */
public class IncidenciasBDOO {
  
    private ObjectContainer db;
   

    public IncidenciasBDOO() {
        try  {
            db = Db4oEmbedded.openFile("Incidenciasdb4o.dat");
        } catch(Db4oException ex) {
            System.out.println("Error al abrir BBDD: "+ex.getMessage());
        }
    }
    
    
    public boolean insertarEmpleado(Empleados a) {
        try {
            db.store(a);
            return true;
        } catch(Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return false;
        }
    }
    
    
    public List<Empleados> selectAllEmpleados() {
        try{
            List<Empleados> todos = new ArrayList<>();
            Query q = db.query();
            q.constrain(Empleados.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                Empleados actual = (Empleados) resultado.next();
                todos.add(actual);
            }
            return todos;
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return null;
        }
    }
    
    
    public boolean validarEmpleado(String user, String pass){
        
        try {
           Query q = db.query();
           q.constrain(Empleados.class);
           Constraint c = q.descend("Contrasenya").constrain(pass);
           q.descend("NombredeUsuario").constrain(user).and(c);
           ObjectSet resultado = q.execute();
           if(resultado.hasNext()) {
               Empleados ok = (Empleados) resultado.next();
               System.out.println("Empleado validado");
               Historial h = new Historial(1,user,"I","08/7/2016");
               db.store(h);
               return true;
               
           }
          } 
            catch(Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
                      
        }
    return false;  
    }
            
    
            
    public boolean modificarEmpleado(Empleados antiguo, Empleados nuevo) {
        try {
            ObjectSet resultado = db.queryByExample(antiguo);
            Empleados emp = (Empleados) resultado.next();
            emp.setIdEmpleados(nuevo.getIdEmpleados());
            emp.setNombredeUsuario(nuevo.getNombredeUsuario());
            emp.setContrasenya(nuevo.getContrasenya());
            emp.setNombreCompleto(nuevo.getNombreCompleto());
            emp.setTelefonoContacto(nuevo.getTelefonoContacto());
            db.store(emp);
            System.out.println("Empleado Modificado");
            
            return true;
        } catch(Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return false;
        }
    }
    
    
    public boolean modificarContrasenyadeEmpleado(Empleados antiguo, Empleados nuevo) {
        try {
            ObjectSet resultado = db.queryByExample(antiguo);
            Empleados emp = (Empleados) resultado.next();
            emp.setIdEmpleados(nuevo.getIdEmpleados());
            emp.setNombredeUsuario(nuevo.getNombredeUsuario());
            emp.setContrasenya(nuevo.getContrasenya());
            emp.setNombreCompleto(nuevo.getNombreCompleto());
            emp.setTelefonoContacto(nuevo.getTelefonoContacto());
            db.store(emp);
            System.out.println("Contrasenya de Empleado Modificado");
            
            return true;
        } catch(Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return false;
        }
    }
    

    
    
    boolean deleteEmpleado(Empleados p) {

        Empleados found = null;
        ObjectSet<Empleados> result = db.queryByExample(p);

        if (result.hasNext()) {

            found = result.next();
            db.delete(found);
            db.commit();
            System.out.println("Empleado Eliminado");
            return true;

        } else {
          System.out.println("Empleado no Eliminado");
            return false;

        }
    }
    
 public boolean insertarIncidencia(DBIncidencias a, String user) {
        try {
            db.store(a);
           
            if (a.getTipo().contains("U")) {
            
            System.out.println("Incidencia Insertada");
            Historial p = new Historial(2, user ,"U","08/7/2016");
            db.store(p);
            }
            return true;
        } catch(Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return false;
        }
    }

   
    
    
    public void eliminarEmpleados() {
        try{
            Query q = db.query();
            q.constrain(Empleados.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                Empleados actual = (Empleados) resultado.next();
                db.delete(actual);
            }
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
            
         }    
    
    
    public List<DBIncidencias> selectAllIncidencias() {
        try{
            List<DBIncidencias> todos = new ArrayList<>();
            Query q = db.query();
            q.constrain(DBIncidencias.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                DBIncidencias actual = (DBIncidencias) resultado.next();
                todos.add(actual);
            }
            return todos;
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return null;
        }
    }
    
    
    public List<Historial> selectHistorial() {
        try{
            List<Historial> todos = new ArrayList<>();
            Query q = db.query();
            q.constrain(Historial.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                Historial actual = (Historial) resultado.next();
                todos.add(actual);
            }
            return todos;
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
            return null;
        }
    }
    
    public void eliminarIncidencias() {
        try{
            Query q = db.query();
            q.constrain(DBIncidencias.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                DBIncidencias actual = (DBIncidencias) resultado.next();
                db.delete(actual);
            }
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
            
         }    
    
    public void eliminarHistorial() {
        try{
            Query q = db.query();
            q.constrain(Historial.class);
            ObjectSet resultado = q.execute();
            while (resultado.hasNext()) {
                Historial actual = (Historial) resultado.next();
                db.delete(actual);
            }
        } catch (Db4oException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    } 
//         
     public boolean ObtenerIdIncidencias(int idIncidencias) {
        
        
           Query q = db.query();
           q.constrain(DBIncidencias.class);
           q.descend("idIncidencias").constrain(idIncidencias);
           ObjectSet resultado = q.execute();
           if(resultado.hasNext()) {
               DBIncidencias ok = (DBIncidencias) resultado.next();
               System.out.println("Tu Incidencia:" + ok);
               
               return true;
               
           }
      return false;  
    }
     
        
           public boolean ObtenerIdaPartirdeClaseEmpleado(String usuario) {
        
        
           Query q = db.query();
           q.constrain(Empleados.class);
           Constraint C = q.constrain(usuario);
           Query p = db.query();
           p.constrain(DBIncidencias.class);
           p.descend("Destino").constrain(usuario).and(C);
           ObjectSet resultado = p.execute();
           if(resultado.hasNext()) {
               DBIncidencias ok = (DBIncidencias) resultado.next();
               System.out.println("Incidencia de Clase Empleados:" + ok);
               
               return true;
               
           }
      return false;  
    } 
           
           
     public boolean ObtenerIncidenciasNombredeEmpleados(String usuario) {
        
        
           Query q = db.query();
           q.constrain(DBIncidencias.class);
           q.descend("Origen").constrain(usuario);
           ObjectSet resultado = q.execute();
           if(resultado.hasNext()) {
               DBIncidencias ok = (DBIncidencias) resultado.next();
               System.out.println("Incidencia de Empleado:" + ok);
               
               return true;
               
           }
      return false;  
    } 
           
           
           
           
           
    public void cerrar() {
        try {
            db.close();
        } catch(Db4oException ex) {
            System.out.println("Error al cerrar BBDD: "+ex.getMessage());
        }
    
    
}
}


