package principal;

import Utils.ButtonEditor;
import Utils.ButtonRenderer;
import Utils.Persona;
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

public final class TablaBotones extends javax.swing.JFrame {

    private static void getColumnModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    DefaultTableModel modelo;
    Persona listaPersonas[];

    public TablaBotones() {
        listaPersonas = new Persona[10];
        listaPersonas[0] = new Persona("1010105189", "David", "Robledo", "3217254256","david@gmial.com");
        listaPersonas[1] = new Persona("3645667", "Manuel", "castillo", "4564635","manuel@gmial.com");
        listaPersonas[2] = new Persona("45743", "Martha", "Acevedo", "67558","martha@gmial.com");
        listaPersonas[3] = new Persona("234245", "Carolina", "Robledo", "7686742","carolina@gmial.com");
        listaPersonas[4] = new Persona("246367", "Fernando", "Robledo", "43453467","fernando@gmial.com");
        
        initComponents();
        initAlternComponents();
        imprimirPersona();
    }
    
    
    
    //=================================================================================================================
    //se imprime las personas ya creadas en el array
    public void imprimirPersona(){
        modelo.setRowCount(0);
        for (int i = 0; i<listaPersonas.length && listaPersonas[i]!=null;i++){
            if(listaPersonas[i]!=null){
                
                
                String documento = listaPersonas[i].getDocumento();
                String nombres = listaPersonas[i].getNombres();
                String apellidos = listaPersonas[i].getApellidos();
                String telefono = listaPersonas[i].getTelefono();
                String correo = listaPersonas[i].getCorreo();

                JButton btnEditar= new JButton();
                btnEditar.setBackground(Color.WHITE);
                Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png"));
                icono_editar = icono_editar.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
                btnEditar.setIcon(new ImageIcon(icono_editar) );
                
                JButton btnEliminar = new JButton();
                btnEliminar.setBackground(Color.WHITE);
                Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
                icono_eliminar = icono_eliminar.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
                btnEliminar.setIcon(new ImageIcon(icono_eliminar));
                
                
                
                Object datos [] = new Object[]{listaPersonas[i].getDocumento(), listaPersonas[i].getNombres(),listaPersonas[i].getApellidos(),listaPersonas[i].getTelefono(),listaPersonas[i].getCorreo(),btnEditar, btnEliminar};
                modelo.addRow(datos);
                
                TablaBotones ventanaActual = this;
                final int posicion = i;
                
                btnEditar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println("Editar: "+ nombres+" "+apellidos);
                        EditarPersona ventana = new EditarPersona( ventanaActual, posicion );
                    }
                });
                
                btnEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println("Eliminar: "+ nombres+" "+apellidos);
                        FormEliminarPersona ventana = new FormEliminarPersona( ventanaActual, posicion);
                    }
                });
            }
        }
    }
    
    //==================================================================================================
   
    public void initAlternComponents(){
        setVisible(true);
        setTitle("Tabla con Botones");
        
        
        modelo = (DefaultTableModel) tablaRegistro.getModel();
        
        tablaRegistro.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaRegistro.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tablaRegistro.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaRegistro.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        tablaRegistro.setRowHeight(30);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        
        
        tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(120);
        tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(130);
        tablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(15);
        tablaRegistro.getColumnModel().getColumn(6).setPreferredWidth(15);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimeraSeccion = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        SegundaSeccion = new javax.swing.JPanel();
        Documento = new javax.swing.JLabel();
        textDocumento = new javax.swing.JTextField();
        textNombres = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        TerceraSeccion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrimeraSeccion.setBackground(new java.awt.Color(0, 158, 156));

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Tabla Con Botones");

        javax.swing.GroupLayout PrimeraSeccionLayout = new javax.swing.GroupLayout(PrimeraSeccion);
        PrimeraSeccion.setLayout(PrimeraSeccionLayout);
        PrimeraSeccionLayout.setHorizontalGroup(
            PrimeraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeraSeccionLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrimeraSeccionLayout.setVerticalGroup(
            PrimeraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimeraSeccionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        SegundaSeccion.setBackground(new java.awt.Color(0, 232, 165));

        Documento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Documento.setText("Documento:");

        textDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDocumentoActionPerformed(evt);
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

        botonAgregar.setBackground(new java.awt.Color(255, 0, 51));
        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
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
                                .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SegundaSeccionLayout.createSequentialGroup()
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SegundaSeccionLayout.createSequentialGroup()
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCorreo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textApellidos)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
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
                    .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SegundaSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(textCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(textTelefono))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        TerceraSeccion.setBackground(new java.awt.Color(0, 213, 129));

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Elec", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRegistro);

        javax.swing.GroupLayout TerceraSeccionLayout = new javax.swing.GroupLayout(TerceraSeccion);
        TerceraSeccion.setLayout(TerceraSeccionLayout);
        TerceraSeccionLayout.setHorizontalGroup(
            TerceraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TerceraSeccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        TerceraSeccionLayout.setVerticalGroup(
            TerceraSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TerceraSeccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimeraSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SegundaSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TerceraSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PrimeraSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SegundaSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TerceraSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentoActionPerformed
        
    }//GEN-LAST:event_textDocumentoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        String documento = textDocumento.getText();
        String nombres = textNombres.getText();
        String apellidos = textApellidos.getText();
        String telefono = textTelefono.getText();
        String correo = textCorreo.getText();
        
        //=============================================================================================
        //Validacion de espacio en array
        boolean disponible = false;
        
        for(int i=5;i<listaPersonas.length;i++){
            if(listaPersonas[i]==null){
                disponible = true;
            }
            else{
                JOptionPane.showMessageDialog(this, "No hay mas espacio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        //=============================================================================================
        
        if(disponible=true){
           
            //=======================================================================================
            //validacion de unicamente numeros en el campo documento y creacion de mensaje de error en caso de no cumplir
            if (!documento.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //=======================================================================================
            //Validacion de cedula no repetida

            boolean documentoRepetido = false;

            for (Persona persona : listaPersonas) {
                if (persona != null && persona.getDocumento().equals(documento)) {
                    documentoRepetido = true;
                    JOptionPane.showMessageDialog(this, "El numero de documento esta repetido.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }

            //=======================================================================================
            // Si el documento no esta repetido se agrega la informacion en la tabla
            if(documentoRepetido==false){
               if(!documento.equals(" ") || !nombres.equals(" ") || !apellidos.equals(" ") || !telefono.equals(" ") || !correo.equals(" ")){
                    for(int i=0; i<listaPersonas.length;i++){
                        //Se agrega la persona en el array
                        if(listaPersonas[i]==null){
                            listaPersonas[i] = new Persona(documento, nombres, apellidos, telefono, correo);
                            imprimirPersona();
                            break;
                        }
                        //break;
                    }
                    
                    for(int j=0;j<listaPersonas.length;j++){
                        System.out.println(listaPersonas[j]);
                    }

                    //Se limpian los campos para agregar a una nueva persona
                    textDocumento.setText("");
                    textNombres.setText("");
                    textApellidos.setText("");
                    textTelefono.setText("");
                    textCorreo.setText("");
                }else{
                    Alerta alerta = new Alerta();
                 
                    //=======================================================================================
                } 
            }
        
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Nombres;
    private javax.swing.JPanel PrimeraSeccion;
    private javax.swing.JPanel SegundaSeccion;
    private javax.swing.JLabel Telefono;
    private javax.swing.JPanel TerceraSeccion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRegistro;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDocumento;
    private javax.swing.JTextField textNombres;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
