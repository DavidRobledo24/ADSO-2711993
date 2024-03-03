package Principal;

import javax.swing.JOptionPane;
import java.sql.*;

public class VentanaCrearUsuario extends javax.swing.JFrame {
        Connection conexion;
        Statement manipularDB;

    public VentanaCrearUsuario() {
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
        setTitle("Formulario Crear Usuario");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCorreo = new javax.swing.JTextField();
        BtnCrearCancelar = new javax.swing.JButton();
        BtnCrearAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        TextDocumento.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        TextNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        TextApellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        TextTelefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        TextCorreo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        BtnCrearCancelar.setBackground(new java.awt.Color(204, 204, 204));
        BtnCrearCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnCrearCancelar.setText("Cancelar");
        BtnCrearCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCancelarActionPerformed(evt);
            }
        });

        BtnCrearAgregar.setBackground(new java.awt.Color(0, 153, 0));
        BtnCrearAgregar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnCrearAgregar.setText("Agregar!");
        BtnCrearAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCrearCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCrearAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextDocumento))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrearCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCrearCancelarActionPerformed

    private void BtnCrearAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearAgregarActionPerformed
        String cedula = TextDocumento.getText();
        String nombres = TextNombres.getText();
        String apellidos = TextApellidos.getText();
        String telefono = TextTelefono.getText();
        String direccion = "";
        String email = TextCorreo.getText();

        // Verificar si todos los campos están llenos
        if (cedula.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Por favor, complete todos los campos.");
        } else {
            // Consulta para verificar si la cédula ya existe
            String consultaCedulaExistente = "SELECT COUNT(*) FROM personas WHERE cedula = ?";
            try (PreparedStatement pstmtConsulta = conexion.prepareStatement(consultaCedulaExistente)) {
                pstmtConsulta.setString(1, cedula);
                ResultSet rs = pstmtConsulta.executeQuery();
                rs.next();
                int count = rs.getInt(1);
        
                // Si la cédula ya existe, muestra un mensaje de error y no insertes los datos
                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "La cédula ya existe en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("La cédula ya existe en la base de datos.");
                } else {
                    // Si la cédula no existe y todos los campos están llenos, procede con la inserción de datos
                    String consultaInsercion = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES (?,?,?,?,?,?)";
                    try (PreparedStatement pstmtInsercion = conexion.prepareStatement(consultaInsercion)) {
                        pstmtInsercion.setString(1, cedula);
                        pstmtInsercion.setString(2, nombres);
                        pstmtInsercion.setString(3, apellidos);
                        pstmtInsercion.setString(4, direccion);
                        pstmtInsercion.setString(5, telefono);
                        pstmtInsercion.setString(6, email);

                        pstmtInsercion.executeUpdate();

                        TextDocumento.setText("");
                        TextNombres.setText("");
                        TextApellidos.setText("");
                        TextTelefono.setText("");
                        TextCorreo.setText("");

                        System.out.println("Datos insertados correctamente.");
                    } catch (SQLException e) {
                        System.out.println("Error al insertar datos: " + e.getMessage());
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error al consultar la base de datos: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_BtnCrearAgregarActionPerformed

   
    public static void main(String args[]) {
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearAgregar;
    private javax.swing.JButton BtnCrearCancelar;
    private javax.swing.JTextField TextApellidos;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextDocumento;
    private javax.swing.JTextField TextNombres;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
