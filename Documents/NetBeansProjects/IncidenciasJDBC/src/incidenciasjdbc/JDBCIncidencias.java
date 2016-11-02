/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incidenciasjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author pedro
 */
public class JDBCIncidencias {
    

private Connection conexion;

    
    


public void InsertarEmpleado (Empleados E) throws SQLException {
    conectar();
    
    String insert = "insert into Empleados values(?,?,?,?,?);";
    PreparedStatement NewEmpleado = conexion.prepareStatement(insert);
    NewEmpleado.setInt(1, E.getIdEmpleados());
    NewEmpleado.setString(2, E.getNombredeUsuario());
    NewEmpleado.setString(3, E.getContrasenya());
    NewEmpleado.setString(4, E.getNombreCompleto());
    NewEmpleado.setInt(5, E.getTelefonoContacto());
    
    NewEmpleado.executeUpdate();
    NewEmpleado.close();
    
   desconectar();
}
      
// public List <DBIncidencias> selectallIncidencias() throws SQLException {
    
//    List <DBIncidencias> lasIncidencias = new ArrayList<>(); 
//    conectar();
//    String query = "select * from Incidencias;";
//    Statement consulta = conexion.createStatement();
//    ResultSet resultado = consulta.executeQuery(query);
//    
//    while(resultado.next()) {
// 
//        DBIncidencias I = new DBIncidencias();
//        
//        I.setIdIncidencias(resultado.getInt("IdIncidencias"));
//        I.setHorayFecha(resultado.getString("HorayFecha"));
//        
//        I.setOrigen(resultado.getString("Origen"));//Aqui tengo el problema me dice String cannot be converted to Empleados
//        I.setDestino(resultado.getString("Destino"));
//        
//        I.setDetalle(resultado.getString("Detalle"));
//        I.setTipo(resultado.getString("Tipo"));
//        lasIncidencias.add(I);
//        
//    }
//    resultado.close();
//    consulta.close();
//    desconectar();
//    return lasIncidencias;
//           
//             
//}
 

 
 public boolean ValidarUsuario(String NombredeUsuario, String Contrasenya ) throws SQLException{
    boolean existe;
     conectar();
     //definimos la consulta
    String query = "select * from empleados where nombredeusuario='" + NombredeUsuario+ "' and contrasenya='" + Contrasenya+"'";
   // creamos el statement para poder ejecutarlo
    Statement st = conexion.createStatement();
//     ejecutamos la consulta y recogemos el resultado
    ResultSet rs = st.executeQuery(query);
    
    if (rs.next()) {
     
     existe = true;
     
     }
     
     else {
     existe = false;
     }
     rs.close();
     st.close();
     desconectar();
     return existe;
     
     
     
 }
 

 public void ModificarEmpleado (Empleados E) throws SQLException {
    conectar();
    
    String insert = "update Empleados set NombreCompleto=('Joseula Velalu') where NombredeUsuario=('jvelasquez')";
    PreparedStatement NewEmpleado = conexion.prepareStatement(insert);
    
    
    NewEmpleado.executeUpdate();
    NewEmpleado.close();
    
   desconectar();
}

 
 public void CambiarContrasenya (Empleados E) throws SQLException {
    conectar();
    
    String insert = "update Empleados set Contrasenya=('tete') where Contrasenya=('pepe')";
    PreparedStatement NewEmpleado = conexion.prepareStatement(insert);
    
    
    NewEmpleado.executeUpdate();
    NewEmpleado.close();
    
   desconectar();
}
 
 public void EliminarEmpleado (Empleados E) throws SQLException {
    conectar();
    
    String insert = "DELETE FROM empleados WHERE NombredeUsuario='jvelasquez';";
    PreparedStatement NewEmpleado = conexion.prepareStatement(insert);
    
    
    NewEmpleado.executeUpdate();
    NewEmpleado.close();
    
   desconectar();
}
 
 public List <DBIncidencias> selectaIncidencias() throws SQLException {
    
    List <DBIncidencias> lasIncidencias = new ArrayList<>(); 
    conectar();
    String query = "select * from Incidencias where idincidencias=2";
    Statement consulta = conexion.createStatement();
    ResultSet resultado = consulta.executeQuery(query);
    
    while(resultado.next()) {
 
        DBIncidencias I = new DBIncidencias();
        
        I.setIdIncidencias(resultado.getInt("IdIncidencias"));
        I.setHorayFecha(resultado.getString("HorayFecha"));
        
        I.setDestino(resultado.getString("Destino"));
        I.getDestino().setNombredeUsuario("Destino");
        
        I.setDetalle(resultado.getString("Detalle"));
        I.setTipo(resultado.getString("Tipo"));
        lasIncidencias.add(I);
        
    }
    resultado.close();
    consulta.close();
    desconectar();
    return lasIncidencias;
           
             
}
 
// 
 public void insertarIncidencia(DBIncidencias m) throws SQLException {
        conectar();
        String insert = "insert into incidencias values(?, ?, ?, ?, ?,?);";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setInt(1, m.getIdIncidencias());
        ps.setString(2,m.getHorayFecha());
        ps.setString(3, m.getOrigen().getNombreCompleto());
        ps.setString(4, m.getDestino().getNombredeUsuario());
        ps.setString(5, m.getDetalle());
        ps.setString(6, m.getTipo());
        ps.executeUpdate();
        ps.close();
        
        
       
        desconectar();
    }
 
// 
 
// public List <DBIncidencias> ObtenerIncidenciaEmpleado() throws SQLException {
//    
//    List <DBIncidencias> lasIncidencias = new ArrayList<>(); 
//    conectar();
//    String query = "select * from Incidencias where idincidencias=1";
//    Statement consulta = conexion.createStatement();
//    ResultSet resultado = consulta.executeQuery(query);
//    
//    while(resultado.next()) {
// 
//        DBIncidencias I = new DBIncidencias();
//        
//        I.setIdIncidencias(resultado.getInt("IdIncidencias"));
//        I.setHorayFecha(resultado.getString("HorayFecha"));
//        I.setOrigen(resultado.getString("Origen"));
//        I.setDestino(resultado.getString("Destino"));
//        
//        I.setDetalle(resultado.getString("Detalle"));
//        I.setTipo(resultado.getString("Tipo"));
//        lasIncidencias.add(I);
//        
//    }
//    resultado.close();
//    consulta.close();
//    desconectar();
//    return lasIncidencias;
//           
//             
//}
 
 
private void conectar () throws SQLException {

String url =  "jdbc:mysql://localhost:3306/bdincidencias";
String usr = "root";
String pass = "pepe1234";

conexion = DriverManager.getConnection(url, usr, pass);
    
}   
    

private void desconectar () throws SQLException{
        
        conexion.close();
    
}
}