package Principal;

import javax.swing.table.DefaultTableModel;

public class VentanaListaUsuario extends javax.swing.JFrame {
    DefaultTableModel modelo;
    VentanaMenu ventana;
    int posicion;


    public VentanaListaUsuario(VentanaMenu ventana, int posicion) {
        this.ventana = ventana;
        this.posicion = posicion;
        
        initComponents();
        initAlternComponents();
        imprimirUsuario();
    }
    
    public void imprimirUsuario(){
        modelo.setRowCount(0);
        for (int i = 0; i<ventana.listaPersonas.length && ventana.listaPersonas[i]!=null;i++){      
            String documento = ventana.listaPersonas[i].getDocumento();
            String nombres = ventana.listaPersonas[i].getNombres();
            String apellidos = ventana.listaPersonas[i].getApellidos();
            String telefono = ventana.listaPersonas[i].getTelefono();
            String correo = ventana.listaPersonas[i].getCorreo();
            int contador = i+1;
                
            Object datos [] = new Object[]{contador, ventana.listaPersonas[i].getDocumento(), ventana.listaPersonas[i].getNombres(),ventana.listaPersonas[i].getApellidos(),ventana.listaPersonas[i].getTelefono(),ventana.listaPersonas[i].getCorreo()};
            modelo.addRow(datos);
            
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
    }
    @SuppressWarnings("unchecked")
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
