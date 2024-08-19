package principal;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class ItemDigimon extends javax.swing.JPanel {

    JsonObject digimon;
    
    public ItemDigimon(JsonObject digimon) {
        this.digimon = digimon;
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent() {
        try {
            String image_url = this.digimon.get("image").getAsString();
            URL url = new URL(image_url);
            Image imagen = getToolkit().createImage(url);
            imagen = imagen.getScaledInstance(180, 190, Image.SCALE_SMOOTH);
            etqImagenes.setIcon(new ImageIcon(imagen));
            
            String nombre = this.digimon.get("name").getAsString();
            
            if (nombre.length() >= 14) {
                nombre = nombre.substring(0, 14) + "...";
            }
            etqNombres.setText(nombre);
        } catch (MalformedURLException ex) {
            System.out.print("Error en URL: " + ex.getMessage());
        }
        
        contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        contentPrincipal.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
               contentPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
               contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
           }
           @Override
           public void mouseExited(MouseEvent e) {
               contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
           }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqNombres = new javax.swing.JLabel();
        etqImagenes = new javax.swing.JLabel();

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contentPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemDigimon.this.mouseClicked(evt);
            }
        });

        etqNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombres.setText("---------------------");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(etqImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
    System.out.println("click en : "+this.digimon.get("name").getAsString());
    System.out.println("endPoint: "+this.digimon.get("href").getAsString());
    
    String nombre = digimon.get("name").getAsString();
    String imageUrl = digimon.get("image").getAsString();
    new VentanaDigimon(nombre, imageUrl);
    }//GEN-LAST:event_mouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagenes;
    private javax.swing.JLabel etqNombres;
    // End of variables declaration//GEN-END:variables
}
