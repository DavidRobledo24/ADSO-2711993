import javax.swing.*;
import java.awt.*;

public class Mina extends JFrame{

    JPanel contenedor;
    JTextField espacio1;
    JButton reset;
    JTextField espacio2;
    JButton campo;

    public Mina(){
        contenedor = new JPanel();
        espacio1 = new JTextField();
        espacio2 = new JTextField();
        reset = new JButton();
        campo = new JButton();

        initComponents();
    }

    public void initComponents(){
        GridBagConstraints r = new GridBagConstraints();
        contenedor.setLayout(new GridBagLayout());

        r.gridwidth = 3;
        r.gridheight = 2;
        r.weightx = 40;
        r.weighty = 1;
        r.gridx = 0;
        r.gridy = 0;
        r.fill = GridBagConstraints.BOTH;
        espacio1.setText("Text Color: Red");
        espacio1.setFont(new Font("Garamond", Font.BOLD, 16));
        espacio1.setText("20");
        espacio1.setEnabled(false);
        espacio1.setBackground(Color.black);
        contenedor.add(espacio1, r);

        r.gridwidth = 2;
        r.gridheight = 2;
        r.weightx = 20;
        r.weighty = 1;
        r.gridx = 4;
        r.gridy = 0;
        r.fill = GridBagConstraints.BOTH;
        reset.setFont(new Font("Garamond", Font.BOLD, 16));
        reset.setText("Reset");
        contenedor.add(reset, r);
        
        r.gridwidth = 3;
        r.gridheight = 2;
        r.weightx = 40;
        r.weighty = 1;
        r.gridx = 8;
        r.gridy = 0;
        r.fill = GridBagConstraints.BOTH;
        espacio2.setText("Text Color: Red");
        espacio2.setFont(new Font("Garamond", Font.BOLD, 16));
        espacio2.setText("20");
        espacio2.setEnabled(false);
        espacio2.setBackground(Color.black);
        contenedor.add(espacio2, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 0;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);
        
        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 1;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 2;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 3;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 4;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 5;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 6;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 7;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);

        r.gridwidth = 1;
        r.gridheight = 1;
        r.weightx = 11;
        r.weighty = 11;
        r.gridx = 8;
        r.gridy = 1;
        r.fill = GridBagConstraints.BOTH;
        contenedor.add(campo, r);



        contenedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        add(contenedor);
        setTitle("Buscaminas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}

