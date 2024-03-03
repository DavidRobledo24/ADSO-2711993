package Principal;

import Utils.ClassPersona;
import javax.swing.JOptionPane;

public class VentanaCrearUsuario extends javax.swing.JFrame {
    
    VentanaMenu ventana;
    int posicion;

    public VentanaCrearUsuario(VentanaMenu ventana, int posicion) {
        this.ventana = ventana;
        this.posicion = posicion;
        
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
        //.trim() sirve para eliminar los espacion en blanco al principio y al final del texto
        String documento = TextDocumento.getText().trim();
        String nombres = TextNombres.getText().trim();
        String apellidos = TextApellidos.getText().trim();
        String telefono = TextTelefono.getText().trim();
        String correo = TextCorreo.getText().trim();

        // Validar campos vacíos
        if (documento.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean disponible = false;

        for (int i = 0; i < ventana.listaPersonas.length; i++) {
            if (ventana.listaPersonas[i] == null) {
                disponible = true;
                break;
            }
        }

        if (disponible) {
            // Validar que el documento contenga solo números
            if (!documento.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        // Validar que el documento no esté repetido
        boolean documentoRepetido = false;

        for (ClassPersona persona : ventana.listaPersonas) {
            if (persona != null && persona.getDocumento().equals(documento)) {
                documentoRepetido = true;
                JOptionPane.showMessageDialog(this, "El número de documento está repetido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Agregar la persona si no hay documento repetido
        if (!documentoRepetido) {
            for (int i = 0; i < ventana.listaPersonas.length; i++) {
                if (ventana.listaPersonas[i] == null) {
                    ventana.listaPersonas[i] = new ClassPersona(documento, nombres, apellidos, telefono, correo);
                    System.err.print("Se agregó la persona");
                    break;
                }
            }

        for (int j = 0; j < ventana.listaPersonas.length; j++) {
            System.out.println(ventana.listaPersonas[j]);
        }

        // Limpiar los campos
        TextDocumento.setText("");
        TextNombres.setText("");
        TextApellidos.setText("");
        TextTelefono.setText("");
        TextCorreo.setText("");
        }
    } 
        else {
        JOptionPane.showMessageDialog(this, "No hay más espacio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
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
