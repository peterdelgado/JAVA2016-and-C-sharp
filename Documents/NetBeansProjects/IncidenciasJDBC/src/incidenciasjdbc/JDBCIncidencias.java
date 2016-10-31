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


//DELETE FROM `bdincidencias`.`incidencias` WHERE `idIncidencias`='1';
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
      
 public List <DBIncidencias> selectallIncidencias() throws SQLException {
    
    List <DBIncidencias> lasIncidencias = new ArrayList<>(); 
    conectar();
    String query = "select * from Incidencias";
    Statement consulta = conexion.createStatement();
    ResultSet resultado = consulta.executeQuery(query);
    
    while(resultado.next()) {
 
        DBIncidencias I = new DBIncidencias();
        
        I.setIdIncidencias(resultado.getInt("IdIncidencias"));
        I.setHorayFecha(resultado.getString("HorayFecha"));
        I.setOrigen(resultado.getString("Origen"));
        I.setDestino(resultado.getString("Destino"));
        I.setDetalle(resultado.getString("Detalle"));
        I.setTipo(resultado.getString("Tipo"));
        lasIncidencias.add(I);
        
    }
    resultado.close();
    consulta.close();
    desconectar();
    return lasIncidencias;
           
             
}
 
 public void InsertarIncidencia (DBIncidencias I) throws SQLException {
    
     
     conectar();
    
    String insert = "insert into Incidencias values(?,?,?,?,?,?);";
    PreparedStatement NewIncidencia = conexion.prepareStatement(insert);
    NewIncidencia.setInt(1, I.getIdIncidencias());
    NewIncidencia.setString(2, I.getHorayFecha());
    NewIncidencia.setString(3, I.getOrigen());
    NewIncidencia.setString(4, I.getDestino());
    NewIncidencia.setString(5, I.getDetalle());
    NewIncidencia.setString(6, I.getTipo());
    
    NewIncidencia.executeUpdate();
    NewIncidencia.close();
    
   desconectar();
}
 
 
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