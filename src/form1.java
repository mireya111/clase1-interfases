import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton nombre;
    private JButton borrar;
    public JPanel mi;
    private JTextArea saludos;
    private JButton imprimir;
    private JTextField ingreso;
    private JLabel labiel2;
    private JLabel label1;

    public form1(){
        nombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labiel2.setText("Mireya Prueba");
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labiel2.setText(" ");
            }
        });
        imprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labiel2.setText(saludos.getText());
            }
        });
        imprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labiel2.setText(ingreso.getText());
            }
        });
    }
}
