package proyectojava;

import java.util.ArrayList;

public class ClienteManager {
    private ArrayList<Cliente> clientes;

    public ClienteManager() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

public Cliente consultarCliente(String usuario) {
    for (Cliente cliente : this.clientes) {
        if (cliente.getUsuario().equals(usuario)) {
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
