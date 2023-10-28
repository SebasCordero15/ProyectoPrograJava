package proyectojava;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String usuario;
    private boolean habilitado;

    // Lista de clientes
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    // Constructor
    public Cliente(String nombre, String apellidos, String usuario, boolean habilitado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.habilitado = habilitado;
    }

    // Getters y setters

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    // agregar
    public static void agregarCliente(Cliente nuevoCliente) {
        listaClientes.add(nuevoCliente);
    }

    // consultar por usuario
    public static Cliente consultarClientePorUsuario(String usuario) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario)) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el cliente
    }

    // inactivar
    public static void inactivarUsuario(String usuario) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario)) {
                cliente.setHabilitado(false);
                return;
            }
        }
    }

    // mostrar
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Usuario: " + usuario);
        System.out.println("Habilitado: " + (habilitado ? "Sí" : "No"));
    }

    public static void mostrarTodosLosClientes() {
        for (Cliente cliente : listaClientes) {
            cliente.mostrarInformacion();
        }
    }
}