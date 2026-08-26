package abc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiCalculadora extends JFrame {

    JTextField txtNumero1;
    JTextField txtNumero2;
    JLabel lblResultado;

    public MiCalculadora() {

        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        JLabel lblNumero1 = new JLabel("Número 1:");
        txtNumero1 = new JTextField(10);

        JLabel lblNumero2 = new JLabel("Número 2:");
        txtNumero2 = new JTextField(10);

        lblResultado = new JLabel("El resultado es: ");

        JButton btnSuma = new JButton("+");
        JButton btnResta = new JButton("-");
        JButton btnMultiplicacion = new JButton("x");
        JButton btnDivision = new JButton("/");

        add(lblNumero1);
        add(txtNumero1);

        add(lblNumero2);
        add(txtNumero2);

        add(lblResultado);

        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);

        // SUMA
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                double resultado = numero1 + numero2;

                lblResultado.setText("El resultado es: " + resultado);
            }
        });

        // RESTA
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                double resultado = numero1 - numero2;

                lblResultado.setText("El resultado es: " + resultado);
            }
        });

        // MULTIPLICACIÓN
        btnMultiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                double resultado = numero1 * numero2;

                lblResultado.setText("El resultado es: " + resultado);
            }
        });

        // DIVISIÓN
        btnDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                if (numero2 != 0) {
                    double resultado = numero1 / numero2;

                    lblResultado.setText("El resultado es: " + resultado);
                } else {
                    lblResultado.setText("No se puede dividir entre 0");
                }
            }
        });
    }
}