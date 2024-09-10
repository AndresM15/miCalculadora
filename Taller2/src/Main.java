import javax.swing.*;

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
        JButton n2 = new JButton("2");
        n2.setBounds(150, 190,50,50);
        ventana.add(n2);
        JButton n3 = new JButton("3");
        n3.setBounds(260, 190,50,50);
        ventana.add(n3);
        JButton n4 = new JButton("4");
        n4.setBounds(40, 260,50,50);
        ventana.add(n4);
        JButton n5 = new JButton("5");
        n5.setBounds(150, 260,50,50);
        ventana.add(n5);
        JButton n6 = new JButton("6");
        n6.setBounds(260, 260,50,50);
        ventana.add(n6);
        JButton n7 = new JButton("7");
        n7.setBounds(40, 340,50,50);
        ventana.add(n7);
        JButton n8 = new JButton("8");
        n8.setBounds(150, 340,50,50);
        ventana.add(n8);
        JButton n9 = new JButton("9");
        n9.setBounds(260, 340,50,50);
        ventana.add(n9);
        JButton n0 = new JButton("0");
        n0.setBounds(150, 430,50,50);
        ventana.add(n0);
        JButton resultado = new JButton("Resultado");
        resultado.setBounds(120, 500,100,50);
        ventana.add(resultado);






        ventana.setVisible(true);
    }
}