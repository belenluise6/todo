package TareaV;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaConsultas extends JFrame {

    public VentanaConsultas() {

        setTitle("Consultas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel texto = new JLabel("VENTANA DE CONSULTAS");

        add(texto);
    }
}