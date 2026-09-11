package Objetoperdido;

public class TipoObjeto {

    String nombre;
    int valor;
    String descripcion;

    public TipoObjeto(String nombre, int valor, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public void mostrarDatos() {
        System.out.println("Tipo de objeto: " + nombre);
        System.out.println("Valor: " + valor);
        System.out.println("Descripción: " + descripcion);
    }
}

