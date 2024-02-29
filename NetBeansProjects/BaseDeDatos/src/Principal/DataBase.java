package Principal;

import  java.sql.Connection;
import  java.sql.Statement;
import  java.sql.DriverManager;
import  java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
   //con esta clase nos conectamos y manipulamos la base de datos
    
    Connection conexion;
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        
        //estructura de control para capturar errores en tiempo de ejecucion
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa");
        }
        catch (SQLException ex) {
            System.out.println("Error en conexion: "+ex.getMessage());
        }
        
    }
    
    public void imprimirDatos(){
        //ResultSet son objetos para almacenar datos
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
            //.next ubicarse en el primer registro
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println("-----------------------------");
	            System.out.println(registros.getRow());
	            System.out.println(registros.getString("cedula"));
	            System.out.println(registros.getString("nombres"));
	            System.out.println(registros.getString("apellidos"));
	            System.out.println(registros.getString("direccion"));
	            System.out.println(registros.getString("email"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}
    }
    
    public void insertarPersona(){
        boolean respuesta = false;
        try {
            String cedula = "108806";
            String nombres = "CAROLINA MARIA";
            String apellidos = "LOPEZ MONTOYA";
            String direccion = "CARRERA 2";
            String telefono = "3000003";
            String email = "carolina@mail.com";

            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
    }
    
    public void actualizar(){
        boolean respuesta = false;
        try {
            String cedula = "108806";
            String nombres = "David";
            String apellidos = "Robledo";
            String direccion = "CARRERA 2";
            String telefono = "3000003";
            String email = "carolina@mail.com";

            String consulta = "UPDATE personas SET cedula='111', nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
    }
    
    public void eliminar(){
        boolean respuesta = false;
        try {
            String cedula = "111";

            String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
    }
    
}
