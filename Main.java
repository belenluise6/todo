package Objetoperdido;

public class Main {

	 public static void main(String[] args) {

	 Gestor gestor = new Gestor("Belen", "Luise", "12345678");

	   Alumno alumno = new Alumno(
	                "Juan",
	                "Perez",
	                "98765432",
	                "2 de Informática"
);

	   Objetosperdidos objeto = new Objetosperdidos(
	                1,
	                "Celular negro",
	                "10/09/2026",
	                "Salón de informática",
	                5000,
	                "2INFO-01",
	                "Guardado"
	        );

	        Comprobante comprobante = new Comprobante(
	                1,
	                "2 de Informática",
	                "10/09/2026",
	                "2INFO-01"
	        );

	        Almacenamiento almacenamiento = new Almacenamiento(
	                "Locker",
	                "Dirección"
	        );

	        TipoObjeto tipo = new TipoObjeto(
	                "Celular",
	                5000,
	                "Celular negro encontrado en informática"
	        );

	        System.out.println("===== OBJETOS PERDIDOS =====");

	        System.out.println("\n--- GESTOR ---");
	        gestor.mostrarDatos();

	        System.out.println("\n--- ALUMNO ---");
	        alumno.mostrarDatos();

	        System.out.println("\n--- OBJETO PERDIDO ---");
	        objeto.mostrarDatos();

	        System.out.println("\n--- COMPROBANTE ---");
	        comprobante.mostrarDatos();

	        System.out.println("\n--- ALMACENAMIENTO ---");
	        almacenamiento.mostrarDatos();

	        System.out.println("\n--- TIPO DE OBJETO ---");
	        tipo.mostrarDatos();

	        System.out.println("\n--- ACCIONES ---");
	        gestor.registrarObjeto();
	        gestor.guardarObjeto();
	        almacenamiento.guardar();
	    }
	}