package abc;
import java.util.ArrayList;

	public class GestionEstudiantes {

	ArrayList<Estudiante> estudiantes = new ArrayList<>();


	public void alta(Estudiante estudiante) {
    estudiantes.add(estudiante);
}


	public void baja(String cedula) {
	for (int i = 0; i < estudiantes.size(); i++) {
		
	if (estudiantes.get(i).cedula.equals(cedula)) {
    estudiantes.remove(i);
     break;
   }
  }
}
	public void listado() {

   for (Estudiante estudiante : estudiantes) {
     System.out.println(estudiante.mostrarDatos());
    }
  }
}
