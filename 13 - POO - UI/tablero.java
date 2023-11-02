import javax.swing.*;
import java.awt.*;

public class tablero{
    public static void main(String[] args){

        GridLayout grid = new GridLayout(3,3);
        JFrame tablero = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground( Color.black );
        panel.setLayout(grid);


        tablero.add(panel);


        tablero.setTitle("Tablero 3x3");
        tablero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablero.setSize(400, 400);
        tablero.setLocationRelativeTo(null);
        tablero.setResizable(false);

        
        JLabel cuadro1 = new JLabel();
        cuadro1.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro1.setText("<html><p style=\"color: red\">X</p></html>");
        cuadro1.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro2 = new JLabel();
        cuadro2.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro2.setText("O");
        cuadro2.setBackground(Color.lightGray);
        cuadro2.setOpaque(true);
        cuadro2.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro3 = new JLabel();
        cuadro3.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro3.setText("<html><p style=\"color: red\">X</p></html>");
        cuadro3.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro4 = new JLabel();
        cuadro4.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro4.setText("O");
        cuadro4.setBackground(Color.lightGray);
        cuadro4.setOpaque(true);
        cuadro4.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro5 = new JLabel();
        cuadro5.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro5.setText("<html><p style=\"color: red\">X</p></html>");
        cuadro5.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro6 = new JLabel();
        cuadro6.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro6.setText("O");
        cuadro6.setBackground(Color.lightGray);
        cuadro6.setOpaque(true);
        cuadro6.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro7 = new JLabel();
        cuadro7.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro7.setText("<html><p style=\"color: red\">X</p></html>");
        cuadro7.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro8 = new JLabel();
        cuadro8.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro8.setText("O");
        cuadro8.setBackground(Color.lightGray);
        cuadro8.setOpaque(true);
        cuadro8.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro9 = new JLabel();
        cuadro9.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro9.setText("<html><p style=\"color: red\">X</p></html>");
        cuadro9.setHorizontalAlignment(JLabel.CENTER);


        panel.add(cuadro1);
        panel.add(cuadro2);
        panel.add(cuadro3);
        panel.add(cuadro4);
        panel.add(cuadro5);
        panel.add(cuadro6);
        panel.add(cuadro7);
        panel.add(cuadro8);
        panel.add(cuadro9);
        tablero.setVisible(true);
    }
}