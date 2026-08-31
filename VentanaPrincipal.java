package TareaV;

import java.awt.Container;

import javax.swing.*;
import javax.swing.JPanel;

public abstract class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
		setTitle("Gestion de Publicaciones");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		JPanel panel1 = new JPanel();
		
		JLabel titulo = new JLabel ("Menu Principal");
		
		JButton boton1 = new JButton("Alumno");
		JButton boton2 = new JButton("Docentes");
		JButton boton3 = new JButton("Consultas");
		
		panel1.add(titulo);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        
        add(panel1);
        
        boton1.addActionListener(e -> { 
        	ventanaAlumno ventana = new ventanaAlumno();
        	ventana.setVisible(true);
        	
          
   });    
        boton2.addActionListener(e -> {
        	vetanaDocentes ventana = new vetanaDocentes();
        	ventana.setVisible(true);
        	
   });

        boton3.addActionListener(e -> {
            VentanaConsultas ventana = new VentanaConsultas();
            ventana.setVisible(true);
   });
}



        
         
	     
