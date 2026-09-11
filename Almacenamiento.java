package Objetoperdido;

public class Almacenamiento {
	  String tipo;
	    String ubicacion;

	    public Almacenamiento(String tipo, String ubicacion) {
	        this.tipo = tipo;
	        this.ubicacion = ubicacion;
	    }

	    public void guardar() {
	        System.out.println("Objeto guardado en: " + ubicacion);
	    }

	    public void retirar() {
	        System.out.println("Objeto retirado.");
	    }

	    public void mostrarDatos() {
	        System.out.println("Tipo: " + tipo);
	        System.out.println("Ubicación: " + ubicacion);
	    }
	}