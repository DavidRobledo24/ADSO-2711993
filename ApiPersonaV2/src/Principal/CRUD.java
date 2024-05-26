package Principal;

import static java.awt.Color.white;


public class CRUD extends javax.swing.JFrame {

   ConsumoAPI consumo;
    
    public CRUD(ConsumoAPI consumo) {
        this.consumo = consumo;
        initComponents();
        initAlternComponets();
    }
    
    public void initAlternComponets(){
        BtnCrear.setBackground(white);
        BtnVer.setBackground(white);
        BtnEditar.setBackground(white);
        BtnEliminar.setBackground(white);
        
        setVisible(true);
        setTitle("Menu");
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnCrear = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnVer = new javax.swing.JButton();
        contenedorPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        BtnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCrear.setText("Crear Persona!");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnEditar.setText("Editar Persona!");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnEliminar.setText("Eliminar Persona!");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnVer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnVer.setText("Ver Personas!");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(BtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        contenedorPrincipal.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        contenedorPrincipal.removeAll();
        PanelCrear nuevo = new PanelCrear(consumo);
        nuevo.setSize(contenedorPrincipal.getSize());
        nuevo.setPreferredSize(contenedorPrincipal.getPreferredSize());
        contenedorPrincipal.add(nuevo);
        repaint();
        revalidate(); 
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        contenedorPrincipal.removeAll();
        PanelEditar nuevo = new PanelEditar(consumo);
        nuevo.setSize(contenedorPrincipal.getSize());
        nuevo.setPreferredSize(contenedorPrincipal.getPreferredSize());
        contenedorPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        contenedorPrincipal.removeAll();
        PanelEliminar nuevo = new PanelEliminar(consumo);
        nuevo.setSize(contenedorPrincipal.getSize());
        nuevo.setPreferredSize(contenedorPrincipal.getPreferredSize());
        contenedorPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        contenedorPrincipal.removeAll();
        PanelVer nuevo = new PanelVer(consumo);
        nuevo.setSize(contenedorPrincipal.getSize());
        nuevo.setPreferredSize(contenedorPrincipal.getPreferredSize());
        contenedorPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnVerActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnVer;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
