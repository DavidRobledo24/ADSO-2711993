package principal;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

public class VentanaDigimon extends javax.swing.JFrame {

    public VentanaDigimon(String nombre, String imagenUrl) {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        nombreDigimon.setText(nombre);
        
        try {
            URL url = new URL(imagenUrl);
            Image imagen = getToolkit().createImage(url);
            imagen = imagen.getScaledInstance(imagenDigimon.getWidth(), imagenDigimon.getHeight(), Image.SCALE_SMOOTH);
            imagenDigimon.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            System.out.println("Error en URL: " + ex.getMessage());
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreDigimon = new javax.swing.JLabel();
        imagenDigimon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nombreDigimon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nombreDigimon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreDigimon.setText("-----------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombreDigimon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(imagenDigimon, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nombreDigimon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenDigimon, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenDigimon;
    private javax.swing.JLabel nombreDigimon;
    // End of variables declaration//GEN-END:variables
}
