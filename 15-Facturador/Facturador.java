import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Facturador extends JFrame{

    JPanel contenedor;
    JLabel datosCliente;
    JLabel cedula1;
    JLabel nombres1;
    JLabel nombreCliente;
    JLabel direccion;
    JLabel direccionCliente;
    JLabel datosVendedor;
    JLabel cedula2;
    JLabel nombres2;
    JLabel nombreVendedor;
    JLabel listaProductos;
    JLabel id;
    JLabel nombre;
    JLabel cant;
    JTextField textCedula1;
    JTextField textCedula2;
    JButton buscar1;
    JButton buscar2;
    JButton add;

    public Facturador(){
        contenedor = new JPanel();
        datosCliente = new JLabel();
        cedula1 = new JLabel(); 
        nombres1 = new JLabel();
        direccion = new JLabel();
        datosVendedor = new JLabel();
        cedula2 = new JLabel();
        nombres2 = new JLabel();
        listaProductos = new JLabel();
        id = new JLabel();
        nombre = new JLabel();
        cant = new JLabel();
        textCedula1 = new JTextField();
        textCedula2 = new JTextField();
        buscar1 = new JButton();
        buscar2 = new JButton();
        add = new JButton();
        nombreCliente = new JLabel();
        nombreVendedor = new JLabel();
        direccionCliente = new JLabel();

        initComponents();
    }

    public void initComponents(){
        GridBagConstraints r = new GridBagConstraints();
        contenedor.setLayout(new GridBagLayout());

        r.gridwidth = 4;
        r.gridheight = 1;
        r.weightx = 100;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 0;
        r.fill = GridBagConstraints.BOTH;
        datosCliente.setFont(new Font("Garamond", Font.BOLD, 35));
        datosCliente.setText("DATOS CLIENTE:");
        contenedor.add(datosCliente, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        cedula1.setFont(new Font("Garamond", Font.BOLD, 16));
        cedula1.setText("CEDULA: ");
        contenedor.add(cedula1, r);

        r.gridwidth = 2;
        r.gridheight = 1;
        r.weightx = 60;
        r.weighty = 1;
        r.gridx = 1;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(textCedula1, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 3;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        buscar1.setText("BUSCAR");
        contenedor.add(buscar1, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 2;
        r.fill = GridBagConstraints.BOTH;
        nombres1.setFont(new Font("Garamond", Font.BOLD, 16));
        nombres1.setText("NOMBRES: ");
        contenedor.add(nombres1, r);

        r.gridwidth = 3;
        r.gridheight = 1;
        r.weightx = 80;
        r.weighty = 1;
        r.gridx = 1;
        r.gridy = 2;
        r.fill = GridBagConstraints.BOTH;
        nombreCliente.setFont(new Font("Garamond", Font.BOLD, 16));
        nombreCliente.setText("");
        contenedor.add(nombreCliente, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 3;
        r.fill = GridBagConstraints.BOTH;
        direccion.setFont(new Font("Garamond", Font.BOLD, 16));
        direccion.setText("DIRECCION: ");
        contenedor.add(direccion, r);

        r.gridwidth = 3;
        r.gridheight = 1;
        r.weightx = 80;
        r.weighty = 1;
        r.gridx = 1;
        r.gridy = 3;
        r.fill = GridBagConstraints.BOTH;
        direccionCliente.setFont(new Font("Garamond", Font.BOLD, 16));
        direccionCliente.setText("");
        contenedor.add(direccionCliente, r);

        r.gridwidth = 4;
        r.gridheight = 1;
        r.weightx = 100;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 4;
        r.fill = GridBagConstraints.BOTH;
        datosVendedor.setFont(new Font("Garamond", Font.BOLD, 32));
        datosVendedor.setText("DATOS VENDEDOR: ");
        contenedor.add(datosVendedor, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 5;
        r.fill = GridBagConstraints.BOTH;
        cedula2.setFont(new Font("Garamond", Font.BOLD, 16));
        cedula2.setText("CEDULA: ");
        contenedor.add(cedula2, r);

        r.gridwidth = 2;
        r.gridheight = 1;
        r.weightx = 60;
        r.weighty = 1;
        r.gridx = 1;
        r.gridy = 5;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(textCedula2, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 3;
        r.gridy = 5;
        r.fill = GridBagConstraints.BOTH;
        buscar2.setText("BUSCAR");
        contenedor.add(buscar2, r);

        add(contenedor);
        setTitle("formato de Prestamos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}