package Objetosperdidos;

public class gestor {
	    String nombre;
	    String apellido;
	    int ci;

	    public gestor(String nombre, String apellido, int ci) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.ci = ci;
	    }

	    public void registrarObjeto(objetoperdido objeto) {
	        System.out.println("Objeto registrado: " + objeto.getDescripcion());
	    }

	    public void revisarObjeto(objetoperdido objeto) {
	        System.out.println("Objeto revisado: " + objeto.getDescripcion());
	    }

	    public void retirarObjeto(objetoperdido objeto) {
	        objeto.setEstado("Retirado");
	        System.out.println("Objeto retirado: " + objeto.getDescripcion());
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public int getCi() {
	        return ci;
	    }
}
