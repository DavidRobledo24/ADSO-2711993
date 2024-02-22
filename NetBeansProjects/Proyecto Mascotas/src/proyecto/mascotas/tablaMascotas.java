package proyecto.mascotas;

import Utils.ButtonEditor;
import Utils.ButtonRenderer;
import Utils.Mascotas;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class tablaMascotas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Mascotas listaMascotas[];

    public tablaMascotas() {
        listaMascotas = new Mascotas[4];
        listaMascotas[0] = new Mascotas("Samantha","8");
        listaMascotas[1] = new Mascotas("Danger", "14");
        
        initComponents();
        initAlternComponents();
        crearMascota();
    }
    
    public void crearMascota(){
        modelo.setRowCount(0);
        
        for (int i = 0; i<listaMascotas.length && listaMascotas[i]!=null;i++){
            
            int numeroMascota = i+1;
            
            String nombre = listaMascotas[i].getNombre();
            String edad = listaMascotas[i].getEdad();
            
            JButton BtnCrear= new JButton();
            BtnCrear.setBackground(Color.WHITE);
            Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("img/icono_registro.png"));
            icono_editar = icono_editar.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
            BtnCrear.setIcon(new ImageIcon(icono_editar) );
            
            Object datos [] = new Object[]{numeroMascota,listaMascotas[i].getNombre(),listaMascotas[i].getEdad(),BtnCrear};
            modelo.addRow(datos);
            
            tablaMascotas ventanaActual = this;
            final int posicion = i;
            
            BtnCrear.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println("Editar: "+ nombres+" "+apellidos);
                        TablaMedicina ventana = new TablaMedicina( ventanaActual, posicion );
                    }
                });
            
        }
        
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setTitle("Registro Mascotas");
        
        modelo = (DefaultTableModel) RegistroMascota.getModel();
        
        RegistroMascota.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JCheckBox()));
        RegistroMascota.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        
        RegistroMascota.getColumnModel().getColumn(0).setPreferredWidth(20);
        RegistroMascota.getColumnModel().getColumn(1).setPreferredWidth(120);
        RegistroMascota.getColumnModel().getColumn(2).setPreferredWidth(120);
        RegistroMascota.getColumnModel().getColumn(3).setPreferredWidth(15);
        
        RegistroMascota.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edadMascota = new javax.swing.JTextField();
        BtnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroMascota = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 158, 197));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        nombreMascota.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreMascota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Edad");

        edadMascota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnCrear.setBackground(new java.awt.Color(0, 204, 0));
        BtnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCrear.setText("Crear!");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreMascota)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        RegistroMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N", "Nombre", "Edad", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RegistroMascota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        String nombre = nombreMascota.getText();
        String edad = edadMascota.getText();
        
        boolean disponible = false;
        
        for(int i=0;i<listaMascotas.length;i++){
            if(listaMascotas[i]==null){
                disponible = true;
                break;
            }
        }
        
        if(disponible == true){
            //validacion campos vacios
            if(!nombre.equalsIgnoreCase("") && !edad.equalsIgnoreCase("")){
                for(int i=0; i<listaMascotas.length;i++){
                    if(listaMascotas[i]==null){
                        listaMascotas[i] = new Mascotas(nombre, edad);
                        crearMascota();
                        break;
                    }   
                }
                
                nombreMascota.setText("");
                edadMascota.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Faltan Datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }  
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay mas espacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_BtnCrearActionPerformed

 
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
            java.util.logging.Logger.getLogger(tablaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JTable RegistroMascota;
    private javax.swing.JTextField edadMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreMascota;
    // End of variables declaration//GEN-END:variables
}
