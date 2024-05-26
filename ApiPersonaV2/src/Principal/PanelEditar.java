
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class PanelEditar extends javax.swing.JPanel {
    
    ConsumoAPI consumo;
   
    public PanelEditar(ConsumoAPI consumo) {
        this.consumo = consumo;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        BtnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 255));

        panelContenido.setBackground(new java.awt.Color(102, 255, 255));

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL EDITAR");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Cedula:");

        textCedula.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        BtnBuscar.setBackground(new java.awt.Color(0, 0, 153));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        textNombres.setBackground(new java.awt.Color(204, 204, 204));
        textNombres.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        textNombres.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        textApellidos.setBackground(new java.awt.Color(204, 204, 204));
        textApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        textApellidos.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        textTelefono.setBackground(new java.awt.Color(204, 204, 204));
        textTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        textTelefono.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        textEmail.setEnabled(false);

        BtnEditar.setBackground(new java.awt.Color(51, 204, 0));
        BtnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        BtnEditar.setText("EDITAR");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Direccion:");

        textDireccion.setBackground(new java.awt.Color(204, 204, 204));
        textDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        textDireccion.setEnabled(false);

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCedula)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellidos)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textTelefono)
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textEmail)
                .addGap(27, 27, 27)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        textNombres.setEnabled(false);
        textApellidos.setEnabled(false);
        textTelefono.setEnabled(false);
        textDireccion.setEnabled(false);
        textEmail.setEnabled(false);

        String cedulaBuscar = textCedula.getText();

        String resBuscar = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        JsonArray array = JsonParser.parseString(resBuscar).getAsJsonArray();

        boolean encontrado = false;

        for (int i = 0; i < array.size(); i++) {
            JsonObject temp = array.get(i).getAsJsonObject();
            String cedulaComparar = temp.get("cedula").getAsString();

            if (cedulaComparar.equals(cedulaBuscar)) {
                textNombres.setEnabled(true);
                textNombres.setBackground(Color.WHITE);
                textNombres.setText(temp.get("nombres").getAsString());

                textApellidos.setEnabled(true);
                textApellidos.setBackground(Color.WHITE);
                textApellidos.setText(temp.get("apellidos").getAsString());

                textTelefono.setEnabled(true);
                textTelefono.setBackground(Color.WHITE);
                textTelefono.setText(temp.get("telefono").getAsString());

                textDireccion.setEnabled(true);
                textDireccion.setBackground(Color.WHITE);
                textDireccion.setText(temp.get("direccion").getAsString());

                textEmail.setEnabled(true);
                textEmail.setBackground(Color.WHITE);
                textEmail.setText(temp.get("email").getAsString());

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Persona no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", textCedula.getText());
        datosActualizar.put("nombres", textNombres.getText());
        datosActualizar.put("apellidos", textApellidos.getText());
        datosActualizar.put("telefono", textTelefono.getText());
        datosActualizar.put("direccion", textDireccion.getText());
        datosActualizar.put("email", textEmail.getText());

        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("respuesta actualizar: "+ respuesta03);

        JOptionPane.showMessageDialog(this, "Persona editada.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNombres;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
