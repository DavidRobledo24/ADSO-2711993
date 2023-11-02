import javax.swing.*;
import java.awt.*;

public class Ajedrez{
    public static void main(String[] args){

        GridLayout grid = new GridLayout (8,8);
        JFrame ventana = new JFrame();
        JPanel tablero = new JPanel();

        tablero.setBackground( new Color(115, 147, 84));
        tablero.setLayout(grid);

        ventana.add(tablero);

        ventana.setTitle("Tablero de Ajedrez.");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        //FICHAS NEGRAS
        JLabel cuadro1 = new JLabel();
        cuadro1.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro1.setText("<html><p style=\"color: black\">TN</p></html>");
        cuadro1.setBackground(new Color(235,235,211));
        cuadro1.setOpaque(true);
        cuadro1.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro2 = new JLabel();
        cuadro2.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro2.setText("<html><p style=\"color: black\">CN</p></html>");
        cuadro2.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro3 = new JLabel();
        cuadro3.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro3.setText("<html><p style=\"color: black\">AN</p></html>");
        cuadro3.setBackground(new Color(235,235,211));
        cuadro3.setOpaque(true);
        cuadro3.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro4 = new JLabel();
        cuadro4.setFont(new Font("Garamond", Font.BOLD, 30));
        cuadro4.setText("<html><p style=\"color: black\">RNN</p></html>");
        cuadro4.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro5 = new JLabel();
        cuadro5.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro5.setText("<html><p style=\"color: black\">RN</p></html>");
        cuadro5.setBackground(new Color(235,235,211));
        cuadro5.setOpaque(true);
        cuadro5.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro6 = new JLabel();
        cuadro6.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro6.setText("<html><p style=\"color: black\">AN</p></html>");
        cuadro6.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro7 = new JLabel();
        cuadro7.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro7.setText("<html><p style=\"color: black\">CN</p></html>");
        cuadro7.setBackground(new Color(235,235,211));
        cuadro7.setOpaque(true);
        cuadro7.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro8 = new JLabel();
        cuadro8.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro8.setText("<html><p style=\"color: black\">TN</p></html>");
        cuadro8.setHorizontalAlignment(JLabel.CENTER);

        //PEONES NEGROS
        JLabel cuadro9 = new JLabel();
        cuadro9.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro9.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro9.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro10 = new JLabel();
        cuadro10.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro10.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro10.setBackground(new Color(235,235,211));
        cuadro10.setOpaque(true);
        cuadro10.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro11 = new JLabel();
        cuadro11.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro11.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro11.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro12 = new JLabel();
        cuadro12.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro12.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro12.setBackground(new Color(235,235,211));
        cuadro12.setOpaque(true);
        cuadro12.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro13 = new JLabel();
        cuadro13.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro13.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro13.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro14 = new JLabel();
        cuadro14.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro14.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro14.setBackground(new Color(235,235,211));
        cuadro14.setOpaque(true);
        cuadro14.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro15 = new JLabel();
        cuadro15.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro15.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro15.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro16 = new JLabel();
        cuadro16.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro16.setText("<html><p style=\"color: black\">PN</p></html>");
        cuadro16.setBackground(new Color(235,235,211));
        cuadro16.setOpaque(true);
        cuadro16.setHorizontalAlignment(JLabel.CENTER);

        //vacio fila 1
        JLabel cuadro17 = new JLabel();
        cuadro17.setBackground(new Color(235,235,211));
        cuadro17.setOpaque(true);
        cuadro17.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro18 = new JLabel();
        cuadro18.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro19 = new JLabel();
        cuadro19.setBackground(new Color(235,235,211));
        cuadro19.setOpaque(true);
        cuadro19.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro20 = new JLabel();
        cuadro20.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro21 = new JLabel();
        cuadro21.setBackground(new Color(235,235,211));
        cuadro21.setOpaque(true);
        cuadro21.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro22 = new JLabel();
        cuadro22.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro23 = new JLabel();
        cuadro23.setBackground(new Color(235,235,211));
        cuadro23.setOpaque(true);
        cuadro23.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro24 = new JLabel();
        cuadro24.setHorizontalAlignment(JLabel.CENTER);

        //vacio fila 2
        JLabel cuadro25 = new JLabel();
        cuadro25.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro26 = new JLabel();
        cuadro26.setBackground(new Color(235,235,211));
        cuadro26.setOpaque(true);
        cuadro26.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro27 = new JLabel();
        cuadro27.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro28 = new JLabel();
        cuadro28.setBackground(new Color(235,235,211));
        cuadro28.setOpaque(true);
        cuadro28.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro29 = new JLabel();
        cuadro29.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro30 = new JLabel();
        cuadro30.setBackground(new Color(235,235,211));
        cuadro30.setOpaque(true);
        cuadro30.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro31 = new JLabel();
        cuadro31.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro32 = new JLabel();
        cuadro32.setBackground(new Color(235,235,211));
        cuadro32.setOpaque(true);
        cuadro32.setHorizontalAlignment(JLabel.CENTER);

        //vacio fila 3
        JLabel cuadro33 = new JLabel();
        cuadro33.setBackground(new Color(235,235,211));
        cuadro33.setOpaque(true);
        cuadro33.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro34 = new JLabel();
        cuadro34.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro35 = new JLabel();
        cuadro35.setBackground(new Color(235,235,211));
        cuadro35.setOpaque(true);
        cuadro35.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro36 = new JLabel();
        cuadro36.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro37 = new JLabel();
        cuadro37.setBackground(new Color(235,235,211));
        cuadro37.setOpaque(true);
        cuadro37.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro38 = new JLabel();
        cuadro38.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro39 = new JLabel();
        cuadro39.setBackground(new Color(235,235,211));
        cuadro39.setOpaque(true);
        cuadro39.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro40 = new JLabel();
        cuadro40.setHorizontalAlignment(JLabel.CENTER);

        //vacio fila 4
        JLabel cuadro41 = new JLabel();
        cuadro41.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro42 = new JLabel();
        cuadro42.setBackground(new Color(235,235,211));
        cuadro42.setOpaque(true);
        cuadro42.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro43 = new JLabel();
        cuadro43.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro44 = new JLabel();
        cuadro44.setBackground(new Color(235,235,211));
        cuadro44.setOpaque(true);
        cuadro44.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro45 = new JLabel();
        cuadro45.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro46 = new JLabel();
        cuadro46.setBackground(new Color(235,235,211));
        cuadro46.setOpaque(true);
        cuadro46.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro47 = new JLabel();
        cuadro47.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro48 = new JLabel();
        cuadro48.setBackground(new Color(235,235,211));
        cuadro48.setOpaque(true);
        cuadro48.setHorizontalAlignment(JLabel.CENTER);

        //PEONES BLANCOS
        JLabel cuadro49 = new JLabel();
        cuadro49.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro49.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro49.setBackground(new Color(235,235,211));
        cuadro49.setOpaque(true);
        cuadro49.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro50 = new JLabel();
        cuadro50.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro50.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro50.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro51 = new JLabel();
        cuadro51.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro51.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro51.setBackground(new Color(235,235,211));
        cuadro51.setOpaque(true);
        cuadro51.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro52 = new JLabel();
        cuadro52.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro52.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro52.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro53 = new JLabel();
        cuadro53.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro53.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro53.setBackground(new Color(235,235,211));
        cuadro53.setOpaque(true);
        cuadro53.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro54 = new JLabel();
        cuadro54.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro54.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro54.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro55 = new JLabel();
        cuadro55.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro55.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro55.setBackground(new Color(235,235,211));
        cuadro55.setOpaque(true);
        cuadro55.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro56 = new JLabel();
        cuadro56.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro56.setText("<html><p style=\"color: black\">PB</p></html>");
        cuadro56.setHorizontalAlignment(JLabel.CENTER);

        //FICHAS BLANCAS
        JLabel cuadro57 = new JLabel();
        cuadro57.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro57.setText("<html><p style=\"color: black\">TB</p></html>");
        cuadro57.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro58 = new JLabel();
        cuadro58.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro58.setText("<html><p style=\"color: black\">CB</p></html>");
        cuadro58.setBackground(new Color(235,235,211));
        cuadro58.setOpaque(true);
        cuadro58.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro59 = new JLabel();
        cuadro59.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro59.setText("<html><p style=\"color: black\">AB</p></html>");
        cuadro59.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel cuadro60 = new JLabel();
        cuadro60.setFont(new Font("Garamond", Font.BOLD, 30));
        cuadro60.setText("<html><p style=\"color: black\">RNB</p></html>");
        cuadro60.setBackground(new Color(235,235,211));
        cuadro60.setOpaque(true);
        cuadro60.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro61 = new JLabel();
        cuadro61.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro61.setText("<html><p style=\"color: black\">RB</p></html>");
        cuadro61.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro62 = new JLabel();
        cuadro62.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro62.setText("<html><p style=\"color: black\">AB</p></html>");
        cuadro62.setBackground(new Color(235,235,211));
        cuadro62.setOpaque(true);
        cuadro62.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro63 = new JLabel();
        cuadro63.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro63.setText("<html><p style=\"color: black\">CB</p></html>");
        cuadro63.setHorizontalAlignment(JLabel.CENTER);

        JLabel cuadro64 = new JLabel();
        cuadro64.setFont(new Font("Garamond", Font.BOLD, 35));
        cuadro64.setText("<html><p style=\"color: black\">TB</p></html>");
        cuadro64.setBackground(new Color(235,235,211));
        cuadro64.setOpaque(true);
        cuadro64.setHorizontalAlignment(JLabel.CENTER);

        tablero.add(cuadro1);
        tablero.add(cuadro2);
        tablero.add(cuadro3);
        tablero.add(cuadro4);
        tablero.add(cuadro5);
        tablero.add(cuadro6);
        tablero.add(cuadro7);
        tablero.add(cuadro8);
        tablero.add(cuadro9);
        tablero.add(cuadro10);
        tablero.add(cuadro11);
        tablero.add(cuadro12);
        tablero.add(cuadro13);
        tablero.add(cuadro14);
        tablero.add(cuadro15);
        tablero.add(cuadro16);
        tablero.add(cuadro17);
        tablero.add(cuadro18);
        tablero.add(cuadro19);
        tablero.add(cuadro20);
        tablero.add(cuadro21);
        tablero.add(cuadro22);
        tablero.add(cuadro23);
        tablero.add(cuadro24);
        tablero.add(cuadro25);
        tablero.add(cuadro26);
        tablero.add(cuadro27);
        tablero.add(cuadro28);
        tablero.add(cuadro29);
        tablero.add(cuadro30);
        tablero.add(cuadro31);
        tablero.add(cuadro32);
        tablero.add(cuadro33);
        tablero.add(cuadro34);
        tablero.add(cuadro35);
        tablero.add(cuadro36);
        tablero.add(cuadro37);
        tablero.add(cuadro38);
        tablero.add(cuadro39);
        tablero.add(cuadro40);
        tablero.add(cuadro41);
        tablero.add(cuadro42);
        tablero.add(cuadro43);
        tablero.add(cuadro44);
        tablero.add(cuadro45);
        tablero.add(cuadro46);
        tablero.add(cuadro47);
        tablero.add(cuadro48);
        tablero.add(cuadro49);
        tablero.add(cuadro50);
        tablero.add(cuadro51);
        tablero.add(cuadro52);
        tablero.add(cuadro53);
        tablero.add(cuadro54);
        tablero.add(cuadro55);
        tablero.add(cuadro56);
        tablero.add(cuadro57);
        tablero.add(cuadro58);
        tablero.add(cuadro59);
        tablero.add(cuadro60);
        tablero.add(cuadro61);
        tablero.add(cuadro62);
        tablero.add(cuadro63);
        tablero.add(cuadro64);

        ventana.setVisible(true);
    }
}