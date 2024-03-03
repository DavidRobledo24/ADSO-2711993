package Principal;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class VentanaListaUsuario extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Connection conexion;
    Statement manipularDB;
    
    public VentanaListaUsuario() {
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
        imprimirUsuario();
    }
    
    public void imprimirUsuario(){
        modelo.setRowCount(0);
        
        // Consulta para obtener los datos de la base de datos
        String consulta = "SELECT * FROM personas";

        try {
            // Ejecutar la consulta
            PreparedStatement pstmt = conexion.prepareStatement(consulta);
            ResultSet rs = pstmt.executeQuery();
            
            // Contador para el número de personas
            int contador = 1;
            
            // Iterar a través de los resultados y agregarlos a la tabla
            while (rs.next()) {
                
                Object[] fila = {
                    contador,
                    rs.getString("cedula"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("telefono"),
                    rs.getString("email")
                };
                modelo.addRow(fila);
                
                contador++; // Aumentar el contador
            }
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e.getMessage());
        }
        
    }

    
    public void initAlternComponents(){
        setTitle("Formulario Edicion");
        setVisible(true);
        setLocationRelativeTo(null);

        
        modelo = new DefaultTableModel();

        
        TablaUsuario.setModel(modelo);

        
        modelo.addColumn("N*");
        modelo.addColumn("Documento");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        
        TablaUsuario.getColumnModel().getColumn(0).setPreferredWidth(12);
        TablaUsuario.getColumnModel().getColumn(1).setPreferredWidth(120);
        TablaUsuario.getColumnModel().getColumn(2).setPreferredWidth(120);
        TablaUsuario.getColumnModel().getColumn(3).setPreferredWidth(120);
        TablaUsuario.getColumnModel().getColumn(4).setPreferredWidth(120);
        TablaUsuario.getColumnModel().getColumn(4).setPreferredWidth(120);
    }    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        BtnListaCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N*", "Cedula", "Nombres", "Apellidos", "Telefono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaUsuario);

        BtnListaCancelar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BtnListaCancelar.setText("Cancelar");
        BtnListaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnListaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnListaCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
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

    private void BtnListaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnListaCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListaCancelar;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
