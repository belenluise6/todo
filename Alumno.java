package Objetoperdido;

public class Alumno {

	  String nombre;
	  String apellido;
	  String CI;
	  String salon;

	public Alumno(String nombre, String apellido, String CI, String salon) {
	  this.nombre = nombre;
	  this.apellido = apellido;
	  this.CI = CI;
	  this.salon = salon;
}

	public void mostrarDatos() {
	   System.out.println("Nombre: " + nombre);
	   System.out.println("Apellido: " + apellido);
	   System.out.println("CI: " + CI);
	   System.out.println("Salón: " + salon);
  }
}