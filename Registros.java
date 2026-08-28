package abc;
import java.awt.*;
import javax.swing.*;

public class Registros extends JFrame{
	
	    public Registros() {
		this.setLayout( new FlowLayout());
		this.setTitle("Registrarse");
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		JPanel panel1= new JPanel();
		
		 panel1.setLayout(new GridLayout(6,2));
		 String[] Genero = {"Masculino","Femenino","No quiero decirlo"};
		 JLabel etiqueta1= new JLabel("Nombre:");
		 JTextField txt1 = new  JTextField();
		 JLabel etiqueta2= new JLabel("Apellido:");
		 JTextField txt2 = new  JTextField();
		 JLabel etiqueta3= new JLabel("Cedula:");
		 JTextField txt3 = new  JTextField();
		 JLabel etiqueta4= new JLabel("Dierccion:");
		 JTextField txt4 = new  JTextField();
		 JLabel etiqueta5= new JLabel("Genero:");
		 JComboBox cbGenero = new JComboBox(Genero);
		 JButton boton1 = new JButton("Registrarse"); 
			 
			 
		panel1.add(etiqueta1);
		panel1.add(txt1);
		panel1.add(etiqueta2);
		panel1.add(txt2);
		panel1.add(etiqueta3);
		panel1.add(txt3);
		panel1.add(etiqueta4);
		panel1.add(txt4);
		panel1.add(etiqueta5);
		panel1.add(cbGenero);
		panel1.add(boton1);
		
         this.add(panel1);
        
		 }
	    
}




