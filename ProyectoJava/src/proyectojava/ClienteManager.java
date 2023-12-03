package proyectojava;

public class ClienteManager {
    private Cliente[] clientes;

    public ClienteManager() {
        this.clientes = new Cliente[10];
    }

    public void agregarCliente(Cliente cliente) {
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] == null) {
                this.clientes[i] = cliente;
                break;
            }
        }
    }

    public Cliente[] obtenerListadoClientes() {
        return this.clientes;
    }

    public Cliente consultarCliente(String usuario) {
        for (Cliente cliente : this.clientes) {
            if (cliente != null && cliente.getUsuario().equals(usuario)) {
                return cliente;
            }
        }
        return null;
    }

    public void inactivarCliente(String usuario) {
        Cliente cliente = this.consultarCliente(usuario);
        if (cliente != null) {
            cliente.setEstado("Inactivo");
        }
    }
}
