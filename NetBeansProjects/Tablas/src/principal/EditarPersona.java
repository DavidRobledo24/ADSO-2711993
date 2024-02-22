package principal;


public final class EditarPersona extends javax.swing.JFrame {

   TablaBotones ventana;
   int posicion;
   
    public EditarPersona(TablaBotones ventana, int posicion) {
        this.ventana = ventana;
        this.posicion = posicion;
        
        initComponents();
        initAlternComponents();
        
    }
    
    public void initAlternComponents(){
        setTitle("Formulario Edicion");
        setVisible(true);
        setLocationRelativeTo(null);
        
        textDocumentoEdit.setText(ventana.listaPersonas[posicion].getDocumento());
        textNombresEdit.setText(ventana.listaPersonas[posicion].getNombres());
        textApellidosEdit.setText(ventana.listaPersonas[posicion].getApellidos());
        textTelefonoEdit.setText(ventana.listaPersonas[posicion].getTelefono());
        textCorreoEdit.setText(ventana.listaPersonas[posicion].getCorreo());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimeraSeccion = new javax.swing.JPanel();
        TituloEditarPersona = new javax.swing.JLabel();
        SegundaSeccion = new javax.swing.JPanel();
        Documento = new javax.swing.JLabel();
        textDocumentoEdit = new javax.swing.JTextField();
        textNombresEdit = new javax.swing.JTextField();
        textApellidosEdit = new javax.swing.JTextField();
        textTelefonoEdit = new javax.swing.JTextField();
        textCorreoEdit = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrimeraSeccion.setBackground(new java.awt.Color(0, 158, 156));

        TituloEditarPersona.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TituloEditarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloEditarPersona.setText("EDITAR PERSONA");

        SegundaSeccion.setBackground(new java.awt.Color(0, 232, 165));

        Documento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Documento.setText("Documento:");

        textDocumentoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDocumentoEditActionPerformed(evt);
            }
        });

        Apellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Apellidos.setText("Apellidos:");

        Telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Telefono.setText("Telefono:");

        Nombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombres.setText("Nombres:");

        Correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Correo.setText("Correo Elec:");

        BtnEditar.setBackground(new java.awt.Color(255, 0, 51));
        BtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEditar.setText("EDITAR");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SegundaSeccionLayout = new javax.swing.GroupLayout(SegundaSeccion);
        SegundaSeccion.setLayout(SegundaSeccionLayout);
        SegundaSeccionLayout.setHorizontalGroup(
            SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SegundaSeccionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(SegundaSeccionLayout.createSequentialGroup()
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(textDocumentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombresEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SegundaSeccionLayout.createSequentialGroup()
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(textTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCorreoEdit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textApellidosEdit)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SegundaSeccionLayout.setVerticalGroup(
            SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SegundaSeccionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Documento)
                    .addComponent(Apellidos)
                    .addComponent(Nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDocumentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombresEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApellidosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SegundaSeccionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono)
                            .addComponent(Correo)))
                    .addGroup(SegundaSeccionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SegundaSeccionLayout.createSequentialGroup()
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textTelefonoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(textCorreoEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout PrimeraSeccionLayout = new javax.swing.GroupLayout(PrimeraSeccion);
        PrimeraSeccion.setLayout(PrimeraSeccionLayout);
        PrimeraSeccionLayout.setHorizontalGroup(
            PrimeraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeraSeccionLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(TituloEditarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
            .addComponent(SegundaSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrimeraSeccionLayout.setVerticalGroup(
            PrimeraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeraSeccionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TituloEditarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SegundaSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimeraSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimeraSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDocumentoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentoEditActionPerformed

    }//GEN-LAST:event_textDocumentoEditActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        String documento = textDocumentoEdit.getText();
        String nombres = textNombresEdit.getText();
        String apellidos = textApellidosEdit.getText();
        String telefono = textTelefonoEdit.getText();
        String correo = textCorreoEdit.getText();
        
        if(documento.equals(" ") || nombres.equals(" ") || apellidos.equals(" ") || telefono.equals(" ") || correo.equals(" ")){
            Alerta ventana = new Alerta();
        }
        else{
            ventana.listaPersonas[posicion].setDocumento(documento);
            ventana.listaPersonas[posicion].setNombres(nombres);
            ventana.listaPersonas[posicion].setApellidos(apellidos);
            ventana.listaPersonas[posicion].setTelefono(telefono);
            ventana.listaPersonas[posicion].setCorreo(correo);
            
            ventana.imprimirPersona();
            dispose();
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Nombres;
    private javax.swing.JPanel PrimeraSeccion;
    private javax.swing.JPanel SegundaSeccion;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TituloEditarPersona;
    private javax.swing.JTextField textApellidosEdit;
    private javax.swing.JTextField textCorreoEdit;
    private javax.swing.JTextField textDocumentoEdit;
    private javax.swing.JTextField textNombresEdit;
    private javax.swing.JTextField textTelefonoEdit;
    // End of variables declaration//GEN-END:variables
}
