package Principal;

import java.sql.*;
import javax.swing.JOptionPane;

public class VentanaEliminarUsuario extends javax.swing.JFrame {
    Connection conexion;
    Statement manipularDB;
    public VentanaEliminarUsuario() {
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
        
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Formulario Edicion");
        setVisible(true);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextEliminarBuscar = new javax.swing.JTextField();
        BtnEliminarBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JLabel();
        BtnEliminarCancelar = new javax.swing.JButton();
        BtnEliminarBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        TextEliminarBuscar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        BtnEliminarBuscar.setBackground(new java.awt.Color(0, 0, 204));
        BtnEliminarBuscar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEliminarBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarBuscar.setText("BUSCAR!");
        BtnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        campoNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        campoNombres.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        campoApellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        campoApellidos.setForeground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        campoTelefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        campoCorreo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(255, 51, 51));

        BtnEliminarCancelar.setBackground(new java.awt.Color(204, 204, 204));
        BtnEliminarCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEliminarCancelar.setText("CANCELAR");
        BtnEliminarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarCancelarActionPerformed(evt);
            }
        });

        BtnEliminarBorrar.setBackground(new java.awt.Color(255, 0, 0));
        BtnEliminarBorrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEliminarBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarBorrar.setText("ELIMINAR");
        BtnEliminarBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextEliminarBuscar)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BtnEliminarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnEliminarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEliminarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(TextEliminarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnEliminarCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminarBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnEliminarCancelarActionPerformed

    private void BtnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarBuscarActionPerformed
        String cedulaABuscar = TextEliminarBuscar.getText();

        // Verificar si la cédula no está vacía
        if (!cedulaABuscar.isEmpty()) {
            // Consulta para obtener los datos de la persona por su cédula
            String consulta = "SELECT * FROM personas WHERE cedula=?";
            
            try {
                // Preparar la consulta
                PreparedStatement pstmt = conexion.prepareStatement(consulta);
                pstmt.setString(1, cedulaABuscar);
                
                // Ejecutar la consulta
                ResultSet rs = pstmt.executeQuery();
                
                // Verificar si se encontraron resultados
                if (rs.next()) {
                    // Mostrar los datos en los campos de texto correspondientes
                    campoNombres.setText(rs.getString("nombres"));
                    campoApellidos.setText(rs.getString("apellidos"));
                    campoTelefono.setText(rs.getString("telefono"));
                    campoCorreo.setText(rs.getString("email"));
                } else {
                    // Mostrar un mensaje si no se encontró ninguna persona con la cédula proporcionada
                    JOptionPane.showMessageDialog(this, "No se encontró ninguna persona con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Error al buscar persona: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "Error al buscar persona: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje si el campo de texto de la cédula está vacío
            JOptionPane.showMessageDialog(this, "Por favor, ingrese la cédula de la persona.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnEliminarBuscarActionPerformed

    private void BtnEliminarBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarBorrarActionPerformed
        // Obtener la cédula de la persona a eliminar del campo de texto TextEliminarCedula
    String cedulaAEliminar = TextEliminarBuscar.getText();
    
    // Verificar si la cédula no está vacía
    if (!cedulaAEliminar.isEmpty()) {
        // Consulta para eliminar la persona de la base de datos
        String consulta = "DELETE FROM personas WHERE cedula=?";
        
        try {
            // Preparar la consulta
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setString(1, cedulaAEliminar);
            
            // Ejecutar la consulta
            int filasEliminadas = pstmt.executeUpdate();
            
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(this, "La persona ha sido eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo encontrar una persona con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar persona: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error al eliminar persona: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Mostrar un mensaje si el campo de texto de la cédula está vacío
        JOptionPane.showMessageDialog(this, "Por favor, ingrese la cédula de la persona que desea eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnEliminarBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminarBorrar;
    private javax.swing.JButton BtnEliminarBuscar;
    private javax.swing.JButton BtnEliminarCancelar;
    private javax.swing.JTextField TextEliminarBuscar;
    private javax.swing.JLabel campoApellidos;
    private javax.swing.JLabel campoCorreo;
    private javax.swing.JLabel campoNombres;
    private javax.swing.JLabel campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
