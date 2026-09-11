package Objetoperdido;

public class Objetosperdidos {
	  int id;
	    String descripcion;
	    String fechaEncontrado;
	    String lugarEncontrado;
	    int valor;
	    String identificador;
	    String estado;

	    public Objetosperdidos(int id, String descripcion, String fechaEncontrado,
	            String lugarEncontrado, int valor, String identificador, String estado) {

	        this.id = id;
	        this.descripcion = descripcion;
	        this.fechaEncontrado = fechaEncontrado;
	        this.lugarEncontrado = lugarEncontrado;
	        this.valor = valor;
	        this.identificador = identificador;
	        this.estado = estado;
	    }

	    public void mostrarDatos() {
	        System.out.println("ID: " + id);
	        System.out.println("Descripción: " + descripcion);
	        System.out.println("Fecha encontrado: " + fechaEncontrado);
	        System.out.println("Lugar encontrado: " + lugarEncontrado);
	        System.out.println("Valor: " + valor);
	        System.out.println("Identificador: " + identificador);
	        System.out.println("Estado: " + estado);
	    }
	}