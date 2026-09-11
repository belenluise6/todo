package Objetoperdido;

public class Comprobante {
	  int id;
	    String salon;
	    String fecha;
	    String identificador;

	    public Comprobante(int id, String salon, String fecha, String identificador) {
	        this.id = id;
	        this.salon = salon;
	        this.fecha = fecha;
	        this.identificador = identificador;
	    }

	    public void mostrarDatos() {
	        System.out.println("Comprobante: " + id);
	        System.out.println("Salón: " + salon);
	        System.out.println("Fecha: " + fecha);
	        System.out.println("Identificador: " + identificador);
	    }
	}