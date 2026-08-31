package TareaV;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventanaAlumno extends JFrame{

    public void VentanaAlumno() {

        this.setTitle("Alumno");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JLabel texto = new JLabel("VENTANA DE ALUMNO");

        this.add(texto);
    }
}


