package Principal;

import java.sql.*;
import javax.swing.JOptionPane;

public class VentanaEditarUsuario extends javax.swing.JFrame {
    Connection conexion;
    Statement manipularDB;

    public VentanaEditarUsuario() {
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
        TextEditarBuscar = new javax.swing.JTextField();
        BtnEditarBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TextEditarNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextEditarApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextEditarTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextEditarEmail = new javax.swing.JTextField();
        BtnEditarCancelar = new javax.swing.JButton();
        BtnEditarEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        TextEditarBuscar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        BtnEditarBuscar.setBackground(new java.awt.Color(0, 0, 204));
        BtnEditarBuscar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEditarBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditarBuscar.setText("BUSCAR!");
        BtnEditarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        TextEditarNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        TextEditarApellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        TextEditarTelefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        TextEditarEmail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        BtnEditarCancelar.setBackground(new java.awt.Color(204, 204, 204));
        BtnEditarCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEditarCancelar.setText("CANCELAR");
        BtnEditarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarCancelarActionPerformed(evt);
            }
        });

        BtnEditarEdit.setBackground(new java.awt.Color(0, 255, 0));
        BtnEditarEdit.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnEditarEdit.setText("EDITAR");
        BtnEditarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarEditActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextEditarEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextEditarBuscar)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextEditarNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextEditarTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextEditarApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BtnEditarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnEditarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(TextEditarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TextEditarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TextEditarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TextEditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TextEditarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnEditarCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditarEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BtnEditarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnEditarCancelarActionPerformed

    private void BtnEditarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarEditActionPerformed
        String cedulaAEditar = TextEditarBuscar.getText();
        String nuevosNombres = TextEditarNombres.getText();
        String nuevosApellidos = TextEditarApellidos.getText();
        String nuevoTelefono = TextEditarTelefono.getText();
        String nuevoEmail = TextEditarEmail.getText();
    
    // Verificar si la cédula no está vacía
    if (!cedulaAEditar.isEmpty()) {
        // Consulta para actualizar los datos de la persona
        String consulta = "UPDATE personas SET nombres=?, apellidos=?, telefono=?, email=? WHERE cedula=?";
        
        try {
            // Preparar la consulta
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            pstmt.setString(1, nuevosNombres);
            pstmt.setString(2, nuevosApellidos);
            pstmt.setString(3, nuevoTelefono);
            pstmt.setString(4, nuevoEmail);
            pstmt.setString(5, cedulaAEditar);
            
            
            // Ejecutar la consulta
            int filasActualizadas = pstmt.executeUpdate();
            
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(this, "Los datos de la persona han sido actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo encontrar una persona con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error al editar persona: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error al editar persona: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Mostrar un mensaje si el campo de texto de la cédula está vacío
        JOptionPane.showMessageDialog(this, "Por favor, ingrese la cédula de la persona.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BtnEditarEditActionPerformed

    private void BtnEditarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarBuscarActionPerformed
        String cedulaABuscar = TextEditarBuscar.getText();

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
                    TextEditarNombres.setText(rs.getString("nombres"));
                    TextEditarApellidos.setText(rs.getString("apellidos"));
                    TextEditarTelefono.setText(rs.getString("telefono"));
                    TextEditarEmail.setText(rs.getString("email"));
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
    }//GEN-LAST:event_BtnEditarBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditarBuscar;
    private javax.swing.JButton BtnEditarCancelar;
    private javax.swing.JButton BtnEditarEdit;
    private javax.swing.JTextField TextEditarApellidos;
    private javax.swing.JTextField TextEditarBuscar;
    private javax.swing.JTextField TextEditarEmail;
    private javax.swing.JTextField TextEditarNombres;
    private javax.swing.JTextField TextEditarTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
