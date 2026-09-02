package abc;

public class Estudiante {

	 String nombre;
	 String apellido;
	 String cedula;

	public Estudiante(String nombre, String apellido, String cedula) {
	   this.nombre = nombre;
	   this.apellido = apellido;
	   this.cedula = cedula;
 }

	public String mostrarDatos() {
	  return "Cedula: " + cedula +
	  " - Nombre: " + nombre +
	  " - Apellido: " + apellido;
	}
}