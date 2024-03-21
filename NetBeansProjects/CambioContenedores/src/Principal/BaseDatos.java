
package Principal;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BaseDatos {
    public Connection conexion;
    public Statement manipularDB;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa");
        }
        catch (SQLException ex) {
            System.out.println("Error en conexion: "+ex.getMessage());
        }
    }
    
    public boolean insertarPersona(String documento, String nombres, String apellidos, String telefono, String direccion, String email){
        boolean respuesta = false;
        try {

            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+documento+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
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
        
        return respuesta;
    }
    
    public void imprimirUsuarios(JTable tablaUsuarios) {
        
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("N*");
        modelo.addColumn("Documento");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Direccion");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");

        tablaUsuarios.setModel(modelo);

        try {
            String consulta = "SELECT * FROM personas"; 
            ResultSet registros = manipularDB.executeQuery(consulta); 

            int contador = 1;
            while (registros.next()) {
                // Crear un arreglo de objetos para cada columna
                Object[] personas = {
                    contador,
                    registros.getString("cedula"), // Obtener el valor de una variable
                    registros.getString("nombres"),
                    registros.getString("apellidos"),
                    registros.getString("direccion"),
                    registros.getString("telefono"),
                    registros.getString("email")
                };
                modelo.addRow(personas);

                contador++;
            }
        } catch (SQLException ex) {
            System.out.println("No es posible llenar la tabla: " + ex.getMessage());
        }
    }
    
    
    public void crearUsuario(String cedulaN,String nombresN,String apellidosN,String telefonoN,String emailN){
 
        String cedula = cedulaN;
        String nombres = nombresN;
        String apellidos = apellidosN;
        String telefono = telefonoN;
        String email = emailN;
        
        try{
            String consulta = "INSERT INTO personas (cedula,nombres,apellidos,telefono,email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta); 
 
            if (resp_consulta == 1) { 
                System.out.println("Insertado con exito");
                //JOptionPane.showMessageDialog(this, "Insertado con exito");
            } else {
                System.out.println("No se pudo insertar");
                //JOptionPane.showMessageDialog(this, "No se pudo insertar");
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar"+ex.getMessage());
            //JOptionPane.showMessageDialog(this, "Error al insertar: " + ex.getMessage());
        }
    }
    
    public void editarUsuario(String cedulaAEditar, String nombreNuevo,String apellidosNuevos,String telefonoNuevo,String correoNuevo){
        String cedula= cedulaAEditar; 
        String nombres= nombreNuevo; 
        String apellidos = apellidosNuevos; 
        String telefono = telefonoNuevo;
        String correo= correoNuevo; 
        
        if (!cedulaAEditar.isEmpty()) {
            

            try {
            // Consulta para actualizar los datos de la persona
            String consulta = "UPDATE personas SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', email='"+correo+"' WHERE cedula='"+cedula+"' ";
                Statement stmt = conexion.createStatement();
                

                int filasActualizadas = stmt.executeUpdate(consulta);

                if (filasActualizadas > 0) {
                    System.out.println( "Los datos de la persona han sido actualizados correctamente");
                } else {
                    System.out.println("No se pudo encontrar una persona con la cedula proporcionada");
                }
            } catch (SQLException e) {
                System.out.println("Error al editar persona: " + e.getMessage());
            }
        } else {
            System.out.println("Por favor, ingrese la cedula de la persona");
        }
    }
    
    public void eliminarUsuario(String cedulaAEliminar){
        String cedula = cedulaAEliminar;

        if (!cedulaAEliminar.isEmpty()) {
            String consulta = "DELETE FROM personas WHERE cedula='" + cedula+ "'";

            try {
                Statement stmt = conexion.createStatement();
                int filasEliminadas = stmt.executeUpdate(consulta);

                if (filasEliminadas > 0) {
                    System.out.println("La persona ha sido eliminada correctamente");
                } else {
                    System.out.println("No se pudo encontrar una persona con la cedula proporcionada");
                }
            } catch (SQLException e) {
                System.out.println("Error al eliminar persona: " + e.getMessage());    }
        } else {
            System.out.println("Por favor, ingrese la cedula de la persona que desea eliminar");
        }
    }
}
