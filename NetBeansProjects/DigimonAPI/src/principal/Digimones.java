package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Digimones extends javax.swing.JFrame {
    
    final int totalPaginas = 291;
    final int contadorBotones = 7;
    
    int pagina;

    public Digimones() {
        this.pagina = 0;
        initComponents();
        initAlternComponent();
        cargarDigimones();
    }
    
    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        contentItems.setLayout(new GridBagLayout());
    }
    
    public void cargarDigimones(){
        ConsumoAPI consumo = new ConsumoAPI();
        String endPoint = "https://digi-api.com/api/v1/digimon?page="+this.pagina;
        String respuesta = consumo.consumoGET(endPoint);
        
        JsonObject data = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray digimones = data.getAsJsonArray("content");
        
        GridBagConstraints restriccion = new GridBagConstraints();
        contentItems.removeAll();
        
        int contx = 0;
        int conty = 0;
        for (int i = 0; i < digimones.size(); i++) {
            JsonObject temp = digimones.get(i).getAsJsonObject();
            
            ItemDigimon item = new ItemDigimon(temp);
            restriccion.gridx = contx;
            restriccion.gridy = conty;
            restriccion.gridwidth = 1;
            restriccion.gridheight =1;
            restriccion.weightx = 1;
            restriccion.weighty = 1;
            restriccion.fill = GridBagConstraints.BOTH;
            contentItems.add(item, restriccion);
            
            if(contx==2){
                contx=0;
                conty++;
            }else{
                contx++;
            }
        }
        
        cargarPaginador();
        revalidate();
        repaint();
    }
    
    public void cargarPaginador(){
        contentPaginador.removeAll();

        // Calcular el rango de páginas a mostrar
        int paginaInicial = Math.max(0, pagina - contadorBotones / 2);
        int paginaFinal = Math.min(totalPaginas, paginaInicial + contadorBotones - 1);
        
        if (paginaFinal - paginaInicial < contadorBotones) {
            paginaInicial = Math.max(0, paginaFinal - contadorBotones + 1);
        }

        // Crear el botón de primera página
        JButton btnPrimera = new JButton("<<");
        contentPaginador.add(btnPrimera);
        btnPrimera.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                pagina = 0;
                cargarDigimones();
            }
        });

        // Crear el botón de página anterior
        JButton btnAnterior = new JButton("<");
        contentPaginador.add(btnAnterior);
        btnAnterior.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (pagina > 0){
                    pagina--;
                    cargarDigimones();
                }
            }
        });

        // Crear los botones de páginas intermedias
        for (int i = paginaInicial; i <= paginaFinal; i++) {
            JButton btnIntermedio = new JButton("" + (i + 1));
            contentPaginador.add(btnIntermedio);
            
            if (i == pagina) {
                btnIntermedio.setBackground(Color.BLUE);
                btnIntermedio.setForeground(Color.WHITE);
            }
            
            final int pageIndex = i;
            btnIntermedio.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    pagina = pageIndex;
                    cargarDigimones();
                }
            });
        }

        // Crear el botón de siguiente página
        JButton btnSiguiente = new JButton(">");
        contentPaginador.add(btnSiguiente);
        btnSiguiente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (pagina < totalPaginas){
                    pagina++;
                    cargarDigimones();
                }
            }
        });

        // Crear el botón de última página
        JButton btnUltima = new JButton(">>");
        contentPaginador.add(btnUltima);
        btnUltima.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                pagina = totalPaginas;
                cargarDigimones();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        contentItems = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contentItems.setBackground(new java.awt.Color(255, 255, 255));
        contentItems.setPreferredSize(new java.awt.Dimension(711, 478));

        javax.swing.GroupLayout contentItemsLayout = new javax.swing.GroupLayout(contentItems);
        contentItems.setLayout(contentItemsLayout);
        contentItemsLayout.setHorizontalGroup(
            contentItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        contentItemsLayout.setVerticalGroup(
            contentItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        contentPaginador.setBackground(new java.awt.Color(255, 255, 255));
        contentPaginador.setLayout(new javax.swing.BoxLayout(contentPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentItems, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
            .addComponent(contentPaginador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(contentItems, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentItems;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JPanel contentPrincipal;
    // End of variables declaration//GEN-END:variables
}
