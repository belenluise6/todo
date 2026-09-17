package Objetosperdidos;

public class objetoperdido {

    private int objetoId;
    private String descripcion;
    private String fechaEncontrado;
    private String lugarEncontrado;
    private int valor;
    private String identificador;
    private String estado;

    public objetoperdido(int objetoId, String descripcion, String fechaEncontrado,
            String lugarEncontrado, int valor, String identificador, String estado) {

        this.objetoId = objetoId;
        this.descripcion = descripcion;
        this.fechaEncontrado = fechaEncontrado;
        this.lugarEncontrado = lugarEncontrado;
        this.valor = valor;
        this.identificador = identificador;
        this.estado = estado;
    }

    public int getObjetoId() {
        return objetoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEncontrado() {
        return fechaEncontrado;
    }

    public String getLugarEncontrado() {
        return lugarEncontrado;
    }

    public int getValor() {
        return valor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos() {
        System.out.println("OBJETO PERDIDO");
        System.out.println("ID: " + objetoId);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Fecha encontrado: " + fechaEncontrado);
        System.out.println("Lugar encontrado: " + lugarEncontrado);
        System.out.println("Valor: " + valor);
        System.out.println("Identificador: " + identificador);
        System.out.println("Estado: " + estado);
    }
}


