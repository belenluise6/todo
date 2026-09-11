package Objetoperdido;

public class Gestor {
	 String nombre;
	    String apellido;
	    String CI;

	    public Gestor(String nombre, String apellido, String CI) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.CI = CI;
	    }

	    public void registrarObjeto() {
	        System.out.println("Objeto registrado.");
	    }

	    public void guardarObjeto() {
	        System.out.println("Objeto guardado.");
	    }

	    public void entregarObjeto() {
	        System.out.println("Objeto entregado.");
	    }

	    public void mostrarDatos() {
	        System.out.println("Gestor: " + nombre + " " + apellido);
	        System.out.println("CI: " + CI);
	    }
	}