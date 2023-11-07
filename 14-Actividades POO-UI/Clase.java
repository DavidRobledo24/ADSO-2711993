import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clase extends JFrame{

    JPanel contenedor;
    JLabel titulo; 
    JLabel capital;
    JLabel interes; 
    JLabel cuota;
    JTextField textCapital;
    JTextField textInteres;
    JTextField textCuota;
    JButton calcular;
    JLabel facturaArea;


    public Clase(){
        contenedor = new JPanel();
        titulo = new JLabel();
        capital = new JLabel();
        interes = new JLabel();
        cuota = new JLabel();
        textCapital = new JTextField();
        textInteres = new JTextField();
        textCuota = new JTextField();
        calcular = new JButton();
        facturaArea = new JLabel();

        initComponents();
    }

    public void initComponents(){
        GridBagConstraints restriccion = new GridBagConstraints();
        contenedor.setLayout(new GridBagLayout());

        restriccion.weighty = 10;
        restriccion.weightx = 10;
        restriccion.gridwidth = 2;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        titulo.setFont(new Font("Garamond", Font.BOLD, 35));
        titulo.setText("Prestamos");
        contenedor.add(titulo, restriccion);

        restriccion.gridwidth = 1;
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        capital.setFont(new Font("Garamond", Font.BOLD, 20));
        capital.setText("Capital.");
        contenedor.add(capital, restriccion);
        
        restriccion.gridwidth = 1;
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        interes.setFont(new Font("Garamond", Font.BOLD, 20));
        interes.setText("Interes.");
        contenedor.add(interes, restriccion);

        restriccion.gridwidth = 1;
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        cuota.setFont(new Font("Garamond", Font.BOLD, 20));
        cuota.setText("N. Cuotas.");
        contenedor.add(cuota, restriccion);

        restriccion.gridwidth = 1;
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(textCapital, restriccion);

        restriccion.gridwidth = 1;
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        contenedor.add(textInteres, restriccion);

        restriccion.gridwidth = 1;
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        contenedor.add(textCuota, restriccion);

        restriccion.gridwidth = 2;
        restriccion.gridx = 0;
        restriccion.gridy = 4;
        restriccion.fill = GridBagConstraints.NONE;
        calcular.setFont(new Font("Garamond", Font.BOLD, 15));
        calcular.setText("Calcular");
        calcular.addActionListener(new ActionListener(){  
        @Override
        public void actionPerformed(ActionEvent e){
            int valor1 = Integer.parseInt(textCapital.getText());
            float valor2 = Float.parseFloat(textInteres.getText());
            int valor3 = Integer.parseInt(textCuota.getText());

            double porcentaje = valor2 / 100;
            double valorCompleto = valor1 + (valor1 * porcentaje);
            double valorCuota = valorCompleto / valor3;

            String factura = "<html>Factura: <br>"+(int)valorCompleto+"<br>";

            for (int i = 0; i < valor3; i++) {
                factura +="<br>"+"Cuota N. "+(i+1)+": "+(int)valorCuota;
            }
            factura+="</html>";

            facturaArea.setText(factura);
        }
    });
        contenedor.add(calcular, restriccion);

        restriccion.gridwidth = 2;
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        contenedor.add(facturaArea, restriccion);

        contenedor.setBackground( Color.white);

        add(contenedor);
        setTitle("formato de Prestamos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}