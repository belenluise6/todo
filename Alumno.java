package Objetosperdidos;

public class Alumno {

    private String nombre;
    private String apellido;
    private int ci;
    private String salon;

    public Alumno(String nombre, String apellido, int ci, String salon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.salon = salon;
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

    public String getSalon() {
        return salon;
    }

    public void mostrarDatos() {
        System.out.println("ALUMNO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("CI: " + ci);
        System.out.println("Salon: " + salon);
    }
}


