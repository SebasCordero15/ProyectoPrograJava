package proyectojava;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String estado;
    private boolean habilitado;

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.estado = "";
        this.habilitado = true;
    }

    public Cliente(String nombre, String apellidos, String estado, boolean habilitado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
        this.habilitado = habilitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Estado: " + estado);
        System.out.println("Habilitado: " + habilitado);
    }

    public void consultarCliente() {
        System.out.println("Información del Cliente:");
        mostrarInformacion();
    }
}