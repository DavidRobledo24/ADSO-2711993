package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import static java.awt.Color.white;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class CRUD extends javax.swing.JFrame {

  ConsumoAPI consumo;
    
    public CRUD(ConsumoAPI consumo) {
        this.consumo = consumo;
        initComponents();
        initAlternComponets();
    }
    
    public void initAlternComponets(){
        BtnActualizar.setBackground(white);
        BtnAgregar.setBackground(white);
        BtnEliminar.setBackground(white);
        BtnLimpiar.setBackground(white);
        BtnLimpiar2.setBackground(white);
        BtnLimpiar3.setBackground(white);
        
        setVisible(true);
        setTitle("Menu");
        setLocationRelativeTo(null);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TituloCrear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CedulaCrear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NombreCrear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ApellidoCrear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonoCrear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DireccionCrear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EmailCrear = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        TituloActualizar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CedulaActualizar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NombreActualizar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ApellidoActualizar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TelefonoActualizar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DireccionActualizar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        EmailActualizar = new javax.swing.JTextField();
        BtnLimpiar2 = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        TituloEliminar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CedulaEliminar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PersonaEncontrada = new javax.swing.JLabel();
        BtnLimpiar3 = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        BtnVerLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TituloCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloCrear.setText("Menu Crear Persona");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cedula:");

        CedulaCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        NombreCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        ApellidoCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Telefono:");

        TelefonoCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Direccion:");

        DireccionCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email:");

        EmailCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        BtnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar!");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnAgregar.setBackground(new java.awt.Color(51, 255, 0));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAgregar.setText("Agregar!");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        TituloActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloActualizar.setText("Menu Actualizar Persona");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cedula:");

        CedulaActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Nombre:");

        NombreActualizar.setBackground(new java.awt.Color(204, 204, 204));
        NombreActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Apellido:");

        ApellidoActualizar.setBackground(new java.awt.Color(204, 204, 204));
        ApellidoActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Telefono:");

        TelefonoActualizar.setBackground(new java.awt.Color(204, 204, 204));
        TelefonoActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Direccion:");

        DireccionActualizar.setBackground(new java.awt.Color(204, 204, 204));
        DireccionActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Email:");

        EmailActualizar.setBackground(new java.awt.Color(204, 204, 204));
        EmailActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        BtnLimpiar2.setBackground(new java.awt.Color(255, 102, 0));
        BtnLimpiar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar2.setText("Limpiar!");
        BtnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiar2ActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(255, 255, 0));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar!");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnActualizar.setBackground(new java.awt.Color(51, 255, 0));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnActualizar.setText("Actualizar!");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        TituloEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloEliminar.setText("Menu Eliminar Persona");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cedula:");

        CedulaEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Nombre encontrado:");

        PersonaEncontrada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PersonaEncontrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonaEncontrada.setText("----------------------");

        BtnLimpiar3.setBackground(new java.awt.Color(255, 102, 0));
        BtnLimpiar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar3.setText("Limpiar!");
        BtnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiar3ActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar.setText("Eliminar!");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar2.setBackground(new java.awt.Color(255, 255, 0));
        BtnBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnBuscar2.setText("Buscar!");
        BtnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscar2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Menu Lista de Personas");

        BtnVerLista.setBackground(new java.awt.Color(51, 255, 0));
        BtnVerLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnVerLista.setText("Ver Lista!");
        BtnVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CedulaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmailCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DireccionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TelefonoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(TituloCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(TituloActualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CedulaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ApellidoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EmailActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DireccionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TelefonoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(TituloEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PersonaEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CedulaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(TituloCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CedulaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TelefonoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DireccionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EmailCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TituloActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CedulaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TelefonoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DireccionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ApellidoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EmailActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TituloEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CedulaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PersonaEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(BtnVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        Map<String,String> datosInsertar = new HashMap<>();       
        datosInsertar.put("cedula", CedulaCrear.getText());
        datosInsertar.put("nombres", NombreCrear.getText());
        datosInsertar.put("apellidos", ApellidoCrear.getText());
        datosInsertar.put("telefono", TelefonoCrear.getText());
        datosInsertar.put("direccion", DireccionCrear.getText());
        datosInsertar.put("email", EmailCrear.getText());
        
        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
        System.out.println("Respuesta insertar: "+ respuesta02);
        
        JsonObject listado = JsonParser.parseString(respuesta02).getAsJsonObject();
        boolean status = listado.get("status").getAsBoolean();
        
        if(status == true){
            CedulaCrear.setText(" ");
            NombreCrear.setText(" ");
            ApellidoCrear.setText(" ");
            TelefonoCrear.setText(" ");
            DireccionCrear.setText(" ");
            EmailCrear.setText(" ");
            
            JOptionPane.showMessageDialog(this, "Persona ingresada.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Persona no ingresada.", "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        CedulaCrear.setText(" ");
        NombreCrear.setText(" ");
        ApellidoCrear.setText(" ");
        TelefonoCrear.setText(" ");
        DireccionCrear.setText(" ");
        EmailCrear.setText(" ");
        
        JOptionPane.showMessageDialog(this, "Campos limpados.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", CedulaActualizar.getText());
        datosActualizar.put("nombres", NombreActualizar.getText());
        datosActualizar.put("apellidos", ApellidoActualizar.getText());
        datosActualizar.put("telefono", TelefonoActualizar.getText());
        datosActualizar.put("direccion", DireccionActualizar.getText());
        datosActualizar.put("email", EmailActualizar.getText());

        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("respuesta actualizar: "+ respuesta03);

        JOptionPane.showMessageDialog(this, "Persona editada.", "Exito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        NombreActualizar.setEnabled(false);
        ApellidoActualizar.setEnabled(false);
        TelefonoActualizar.setEnabled(false);
        DireccionActualizar.setEnabled(false);
        EmailActualizar.setEnabled(false);

        String cedulaBuscar = CedulaActualizar.getText();

        String resBuscar = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        JsonArray array = JsonParser.parseString(resBuscar).getAsJsonArray();

        boolean encontrado = false;

        for (int i = 0; i < array.size(); i++) {
            JsonObject temp = array.get(i).getAsJsonObject();
            String cedulaComparar = temp.get("cedula").getAsString();

            if (cedulaComparar.equals(cedulaBuscar)) {
                NombreActualizar.setEnabled(true);
                NombreActualizar.setBackground(Color.WHITE);
                NombreActualizar.setText(temp.get("nombres").getAsString());

                ApellidoActualizar.setEnabled(true);
                ApellidoActualizar.setBackground(Color.WHITE);
                ApellidoActualizar.setText(temp.get("apellidos").getAsString());

                TelefonoActualizar.setEnabled(true);
                TelefonoActualizar.setBackground(Color.WHITE);
                TelefonoActualizar.setText(temp.get("telefono").getAsString());

                DireccionActualizar.setEnabled(true);
                DireccionActualizar.setBackground(Color.WHITE);
                DireccionActualizar.setText(temp.get("direccion").getAsString());

                EmailActualizar.setEnabled(true);
                EmailActualizar.setBackground(Color.WHITE);
                EmailActualizar.setText(temp.get("email").getAsString());

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Persona no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiar2ActionPerformed
        CedulaActualizar.setText(" ");
        NombreActualizar.setText(" ");
        ApellidoActualizar.setText(" ");
        TelefonoActualizar.setText(" ");
        DireccionActualizar.setText(" ");
        EmailActualizar.setText(" ");
        
        JOptionPane.showMessageDialog(this, "Campos limpados.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnLimpiar2ActionPerformed

    private void BtnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscar2ActionPerformed
        String cedulaBuscar = CedulaEliminar.getText();
        
        String resBuscar = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        JsonArray array = JsonParser.parseString(resBuscar).getAsJsonArray();
        
        boolean encontrado = false;

        for (int i = 0; i < array.size(); i++) {
            JsonObject temp = array.get(i).getAsJsonObject();
            String cedulaComparar = temp.get("cedula").getAsString();

            if (cedulaComparar.equals(cedulaBuscar)) {
                
                PersonaEncontrada.setText(temp.get("nombres").getAsString());

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Persona no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscar2ActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        String cedulaEliminar = CedulaEliminar.getText();
        Map<String, String> datosEliminar = new HashMap<>();
        datosEliminar.put("cedula", cedulaEliminar);
        
        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
        JOptionPane.showMessageDialog(this, "Persona eliminada.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Respusta eliminar: "+respuesta04);
        
        CedulaEliminar.setText(" ");
        PersonaEncontrada.setText("----------------------");
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiar3ActionPerformed
       CedulaActualizar.setText(" ");
        NombreActualizar.setText(" ");
        ApellidoActualizar.setText(" ");
        TelefonoActualizar.setText(" ");
        DireccionActualizar.setText(" ");
        EmailActualizar.setText(" ");
        
        JOptionPane.showMessageDialog(this, "Campos limpados.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnLimpiar3ActionPerformed

    private void BtnVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerListaActionPerformed
        new ListaPersonas(consumo);
    }//GEN-LAST:event_BtnVerListaActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoActualizar;
    private javax.swing.JTextField ApellidoCrear;
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnBuscar2;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLimpiar2;
    private javax.swing.JButton BtnLimpiar3;
    private javax.swing.JButton BtnVerLista;
    private javax.swing.JTextField CedulaActualizar;
    private javax.swing.JTextField CedulaCrear;
    private javax.swing.JTextField CedulaEliminar;
    private javax.swing.JTextField DireccionActualizar;
    private javax.swing.JTextField DireccionCrear;
    private javax.swing.JTextField EmailActualizar;
    private javax.swing.JTextField EmailCrear;
    private javax.swing.JTextField NombreActualizar;
    private javax.swing.JTextField NombreCrear;
    private javax.swing.JLabel PersonaEncontrada;
    private javax.swing.JTextField TelefonoActualizar;
    private javax.swing.JTextField TelefonoCrear;
    private javax.swing.JLabel TituloActualizar;
    private javax.swing.JLabel TituloCrear;
    private javax.swing.JLabel TituloEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
