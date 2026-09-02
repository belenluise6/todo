package abc;

public class Main {

	public static void main(String[] args) {
		 GestionEstudiantes gestion = new GestionEstudiantes();
	     Estudiante Estudiante1 =
	      new Estudiante("Belen", "Lopez", "12345678");

	     Estudiante Estudiante2 =
	      new Estudiante("Leandro", "Perez", "45678912");

	     gestion.alta(Estudiante1);
	     gestion.alta(Estudiante2);

	     System.out.println("LISTADO DE ESTUDIANTES:");

	     gestion.listado();
	     gestion.baja("12345678");
	     System.out.println("\nDESPUES DE LA BAJA:");
	     gestion.listado();
	  
	}

}
