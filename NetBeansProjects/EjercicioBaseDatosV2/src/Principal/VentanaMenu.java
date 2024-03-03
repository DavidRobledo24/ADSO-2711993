package Principal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import java.sql.*;

public class VentanaMenu extends javax.swing.JFrame {
        Connection conexion;
        Statement manipularDB;
    
    public VentanaMenu() {
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
        setVisible(true);
        setTitle("Menu");
        
        Image crear_usuario = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/crear_usuario.png"));
        crear_usuario = crear_usuario.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        BtnCrear.setIcon(new ImageIcon(crear_usuario) );
        
        Image buscar_usuario = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/buscar_usuario.png"));
        buscar_usuario = buscar_usuario.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        BtnLeer.setIcon(new ImageIcon(buscar_usuario) );
        
        Image editar_usuario = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/editar_usuario.png"));
        editar_usuario = editar_usuario.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        BtnEditar.setIcon(new ImageIcon(editar_usuario) );
        
        Image eliminar_usuario = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/eliminar_usuario.png"));
        eliminar_usuario = eliminar_usuario.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        BtnEliminar.setIcon(new ImageIcon(eliminar_usuario) );
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCrear = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnLeer = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        BtnCrear.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        BtnCrear.setText("CREAR");
        BtnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        BtnEditar.setText("EDITAR");
        BtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnLeer.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        BtnLeer.setText("LEER");
        BtnLeer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLeer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLeerActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
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

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        for (ActionListener al : BtnCrear.getActionListeners()) {
            BtnCrear.removeActionListener(al);
        }
        
        BtnCrear.addActionListener((ActionEvent e) -> {
            VentanaCrearUsuario ventana = new VentanaCrearUsuario();
        });
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void BtnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLeerActionPerformed
        for (ActionListener al : BtnLeer.getActionListeners()) {
            BtnLeer.removeActionListener(al);
        }
        BtnLeer.addActionListener((ActionEvent e) -> {
            VentanaListaUsuario ventana = new VentanaListaUsuario();
        });
    }//GEN-LAST:event_BtnLeerActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        for (ActionListener al : BtnEditar.getActionListeners()) {
            BtnEditar.removeActionListener(al);
        }
        BtnEditar.addActionListener((ActionEvent e) -> {
            VentanaEditarUsuario ventana = new VentanaEditarUsuario();
        });
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        for (ActionListener al : BtnEliminar.getActionListeners()) {
            BtnEliminar.removeActionListener(al);
        }
        BtnEliminar.addActionListener((ActionEvent e) -> {
            VentanaEliminarUsuario ventana = new VentanaEliminarUsuario();
        });
    }//GEN-LAST:event_BtnEliminarActionPerformed


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLeer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
