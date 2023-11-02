import javax.swing.*;
import java.awt.*;

public class principal{
    public static void main(String[] args){

        JFrame ventana = new JFrame();
        ventana.setTitle("Ventana 1");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground( Color.cyan );


        JLabel etq_titulo = new JLabel();
        etq_titulo.setFont(new Font("Garamond", Font.BOLD, 35));
        etq_titulo.setText("Titulo de la ventana");
        etq_titulo.setBorder(BorderFactory.createLineBorder(Color.black));
        etq_titulo.setForeground(new Color(146, 58, 146));

        JTextField texto = new JTextField();
        texto.setPreferredSize(new Dimension(100,20));
        texto.setColumns();
        

        contenedor.add(etq_titulo);
        contenedor.add(texto);
        ventana.add(contenedor);

        ventana.setVisible(true);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   
        //ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}