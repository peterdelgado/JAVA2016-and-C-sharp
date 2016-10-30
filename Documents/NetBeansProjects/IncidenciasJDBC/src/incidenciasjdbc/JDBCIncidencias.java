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
      
 public List <DBIncidencias> selectallsocias() throws SQLException {
    
    List <DBIncidencias> lasIncidencias = new ArrayList<>(); 
    String query = "select * from Incidencias";
    Statement consulta = conexion.createStatement();
    ResultSet resultado = consulta.executeQuery(query);
    
    while(resultado.next()) {
 
        DBIncidencias I = new DBIncidencias();
        
        I.setIdIncidencias(resultado.getInt("IdIncidencias"));
        I.setIdIncidencias(resultado.getInt())
        ""
        lasIncidencias.add(I);
        
    }
    resultado.close();
    consulta.close();
    desconectar();
    return lasIncidencias;
           
             
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