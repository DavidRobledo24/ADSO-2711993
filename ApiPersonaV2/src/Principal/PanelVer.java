package Principal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PanelVer extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    ConsumoAPI consumo;
    JScrollPane scrollPane;
    
    
    public PanelVer(ConsumoAPI consumo) {
        this.consumo = consumo;
        initComponents();
        initAlternComponents();
        cargarDatos();
    }
    
    public void initAlternComponents() {
        // Inicializamos los componentes
        modelo = new DefaultTableModel(new String[] { "ID", "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", "Email" }, 0);
        TablaUsuario = new JTable(modelo);
        scrollPane = new JScrollPane(TablaUsuario);

        // Establecemos el layout y agregamos los componentes
        setLayout(new java.awt.BorderLayout());
        add(scrollPane, java.awt.BorderLayout.CENTER);
    }
    
    public void cargarDatos(){
        modelo.setRowCount(0);
        
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        JsonArray array = JsonParser.parseString(respuesta01).getAsJsonArray();
        
        for (int i = 0; i < array.size(); i++) {
            JsonObject temp = array.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String direccion = temp.get("direccion").getAsString();
            String email = temp.get("email").getAsString();
            
            Object datos[] = new Object[] { i + 1, cedula, nombres, apellidos, telefono, direccion, email };
            modelo.addRow(datos);
        }
   
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N*", "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
