package Principal;

import static java.awt.Color.white;
import java.awt.Image;
import javax.swing.ImageIcon;


public class CRUD extends javax.swing.JFrame {

    BaseDatos bd;
    
    
    public CRUD(BaseDatos bd) {
        this.bd = bd;
        initComponents();
        initAlternComponets();
    }
    
    public void initAlternComponets(){
        BtnCrear.setBackground(white);
        BtnLeer.setBackground(white);
        BtnEditar.setBackground(white);
        BtnEliminar.setBackground(white);
        
        setVisible(true);
        setTitle("Menu");
        setLocationRelativeTo(null);
        
        Image menu = getToolkit().createImage(ClassLoader.getSystemResource("img/icono_menu.png"));
        menu = menu.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(menu));
        
        Image crear_usuario = getToolkit().createImage(ClassLoader.getSystemResource("img/crear_usuario.png"));
        crear_usuario = crear_usuario.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        BtnCrear.setIcon(new ImageIcon(crear_usuario));
        
        Image leer_usuario = getToolkit().createImage(ClassLoader.getSystemResource("img/buscar_usuario.png"));
        leer_usuario = leer_usuario.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        BtnLeer.setIcon(new ImageIcon(leer_usuario));
        
        Image editar_usuario = getToolkit().createImage(ClassLoader.getSystemResource("img/editar_usuario.png"));
        editar_usuario = editar_usuario.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        BtnEditar.setIcon(new ImageIcon(editar_usuario));
        
        Image eliminar_usuario = getToolkit().createImage(ClassLoader.getSystemResource("img/eliminar_usuario.png"));
        eliminar_usuario = eliminar_usuario.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        BtnEliminar.setIcon(new ImageIcon(eliminar_usuario));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        BtnCrear = new javax.swing.JButton();
        BtnLeer = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        logo = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();
        textoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(0, 255, 255));

        BtnCrear.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        BtnCrear.setForeground(new java.awt.Color(51, 255, 0));
        BtnCrear.setText("Crear!");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        BtnLeer.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        BtnLeer.setForeground(new java.awt.Color(204, 102, 0));
        BtnLeer.setText("Leer!");
        BtnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLeerActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(204, 0, 204));
        BtnEditar.setText("Editar!");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        BtnEliminar.setText("Eliminar!");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(BtnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(BtnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                    .addGroup(contentMenuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        contentPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        textoInicio.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        textoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInicio.setText("INICIO!");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(textoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(textoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        //Eliminar el contenedor actual
        contentPrincipal.removeAll();
        //crear instancia del nuevo contenedor
        PanelCrear nuevo = new PanelCrear(bd);
        //Ajustar el tamaño del nuevo contenedor
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        //Agregar el nuevo contenedor dentdo del contenedor principal
        contentPrincipal.add(nuevo);
        //Renerizar toda la ventana
        repaint();
        revalidate();
        
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void BtnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLeerActionPerformed
        contentPrincipal.removeAll();
        PanelLeer nuevo = new PanelLeer(bd);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnLeerActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        contentPrincipal.removeAll();
        PanelEditar nuevo = new PanelEditar(bd);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        contentPrincipal.removeAll();
        PanelEliminar nuevo = new PanelEliminar(bd);
        nuevo.setSize(contentPrincipal.getSize());
        nuevo.setPreferredSize(contentPrincipal.getPreferredSize());
        contentPrincipal.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_BtnEliminarActionPerformed
    
 
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLeer;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JButton logo;
    private javax.swing.JLabel textoInicio;
    // End of variables declaration//GEN-END:variables
}
