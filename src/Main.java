import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*JLabel etiqueta = new JLabel("Hola, autistas");
        etiqueta.setBounds(350, 10, 150, 50);
        ventana.add(etiqueta);
        ventana.setVisible(true);
        ventana.setLayout(null);*/


        JOptionPane.showMessageDialog(null, "BIENVENIDO A LA CALCULADORA");
        String nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE");
        System.out.println(nombre);
        JOptionPane.showMessageDialog(null, "HOLA " + nombre + " ESTAS EN LA CALCULADORA");
        int opcion = JOptionPane.showConfirmDialog(null, "DESEA CONTINUAR");
        if (opcion == JOptionPane.YES_OPTION) {
            System.out.println("EL USUARIO QUIERE CONTINUAR");
        }
        if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("EL USUARIO NO DESEA CONTINUAR");
        }
        if (opcion == JOptionPane.CANCEL_OPTION) {
            System.out.println("EL USUARIO CANCELADO");

        }
        String operacion = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar: 1:Sumar || 2:Restar || 3:Multiplicar || 4:Dividir");
        float num1;
        float num2;
        float resultado;
        switch (operacion) {
            case "1":
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                JOptionPane.showMessageDialog(null, "los numeros a operar son: " + num1 + " y " + num2);
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
                break;
            case "2":
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                JOptionPane.showMessageDialog(null, "los numeros a operar son: " + num1 + " y " + num2);
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
                break;
            case "3":
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                JOptionPane.showMessageDialog(null, "los numeros a operar son: " + num1 + " y " + num2);
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
                break;
            case "4":
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                JOptionPane.showMessageDialog(null, "los numeros a operar son: " + num1 + " y " + num2);
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
                break;



        }


        }
    }
