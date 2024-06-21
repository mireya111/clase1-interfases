import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

    /*String primernumero = JOptionPane.showInputDialog("Ingrese el primer numero entero");
    String segundo = JOptionPane.showInputDialog("Ingrese el segundo entero");
    String tercero = JOptionPane.showInputDialog("Ingrese el segundo entero");
    String cuarto = JOptionPane.showInputDialog("Ingrese el tercero entero");
    int numero1 = Integer.parseInt(primernumero);
    int numero2 = Integer.parseInt(segundo);
    int suma = numero1 + numero2;
    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "sUMA DE DOS ENTEROS", JOptionPane.INFORMATION_MESSAGE);
    int resta = numero1 -  numero2;
    JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resta, "sRESTA DE DOS ENTEROS", JOptionPane.INFORMATION_MESSAGE);
    int multiplicacion = numero1 * numero2;
    JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: "+multiplicacion, "sMULTI DE DOS ENTEROS", JOptionPane.INFORMATION_MESSAGE);
    int division = numero1 / numero2;
    JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division, "sDIV DE DOS ENTEROS", JOptionPane.INFORMATION_MESSAGE);*/

        JFrame frame = new JFrame();
        frame.setContentPane(new form1().mi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.pack();
        frame.setVisible(true);

}
}