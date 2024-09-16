import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Calculadora UAM");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(366, 600);
        ventana.setLayout(null);

        JLabel etiqueta = new JLabel("Mi calculadora");
        etiqueta.setBounds(130, 10, 150, 30);
        ventana.add(etiqueta);

        JLabel etiqueta1 = new JLabel("Numero 1");
        etiqueta1.setBounds(40, 50, 150, 30);
        ventana.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Numero 2");
        etiqueta2.setBounds(230, 50, 150, 30);
        ventana.add(etiqueta2);

        JTextField numero1 = new JTextField();
        numero1.setBounds(40, 80, 90, 30);
        ventana.add(numero1);

        JTextField numero2 = new JTextField();
        numero2.setBounds(230, 80, 90, 30);
        ventana.add(numero2);

        String[] operaciones = new String[4];
        operaciones[0] = "SUMAR";
        operaciones[1] = "RESTAR";
        operaciones[2] = "MULTIPLICAR";
        operaciones[3] = "DIVIDIR";
        JComboBox combo1 = new JComboBox(operaciones);
        combo1.setBounds(133, 135, 90, 30);
        ventana.add(combo1);

        JButton n1 = new JButton("1");
        n1.setBounds(40,190,50,50);
        ventana.add(n1);
        n1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num1 = "1";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num1);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num1);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n2 = new JButton("2");
        n2.setBounds(150, 190,50,50);
        ventana.add(n2);
        n2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num2 = "2";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num2);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num2);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n3 = new JButton("3");
        n3.setBounds(260, 190,50,50);
        ventana.add(n3);
        n3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num3 = "3";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num3);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num3);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n4 = new JButton("4");
        n4.setBounds(40, 260,50,50);
        ventana.add(n4);
        n4.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num4 = "4";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num4);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num4);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n5 = new JButton("5");
        n5.setBounds(150, 260,50,50);
        ventana.add(n5);
        n5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num5 = "5";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num5);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num5);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n6 = new JButton("6");
        n6.setBounds(260, 260,50,50);
        ventana.add(n6);
        n6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num6 = "6";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num6);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num6);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });


        JButton n7 = new JButton("7");
        n7.setBounds(40, 340,50,50);
        ventana.add(n7);
        n7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num7 = "7";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num7);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num7);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n8 = new JButton("8");
        n8.setBounds(150, 340,50,50);
        ventana.add(n8);
        n8.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num8 = "8";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num8);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num8);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n9 = new JButton("9");
        n9.setBounds(260, 340,50,50);
        ventana.add(n9);
        n9.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num9 = "9";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num9);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num9);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton n0 = new JButton("0");
        n0.setBounds(150, 430,50,50);
        ventana.add(n0);
        n0.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String Num0 = "0";
                String primerNumero = numero1.getText();
                String segundoNumero = numero2.getText();
                if(primerNumero.equals("")){
                    numero1.setText(Num0);
                } else if (segundoNumero.equals("")) {
                    numero2.setText(Num0);

                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS","INFO",JOptionPane.INFORMATION_MESSAGE);
                }


            }

        });

        JButton resultado = new JButton("Resultado");
        resultado.setBounds(120, 500,100,50);
        ventana.add(resultado);
        resultado.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                double num1 = Double.parseDouble(numero1.getText());
                double num2 = Double.parseDouble(numero2.getText());
                double resu = 0;

                String operacion = (String) combo1.getSelectedItem();

                if(operacion.equals("SUMAR")){
                   resu = num1 + num2;
               }else if(operacion.equals("RESTAR")){
                   resu = num1 - num2;
               }else if(operacion.equals("MULTIPLICAR")){
                   resu = num1 * num2;
               }else if(operacion.equals("DIVIDIR")){
                   resu = num1 / num2;
               }
                JOptionPane.showMessageDialog(null,"El resultado es: "+resu,"INFO",JOptionPane.INFORMATION_MESSAGE);
                numero1.setText("");
                numero2.setText("");

            }

        });






        ventana.setLayout(null);
        ventana.setVisible(true);
    }
}