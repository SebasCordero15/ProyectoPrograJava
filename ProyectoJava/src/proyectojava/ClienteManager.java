package proyectojava;

import javax.swing.JOptionPane;

public class ClienteManager {
    private Cliente[] clientes;
    private int indice;

    public ClienteManager() {
        this.clientes = new Cliente[10];
        this.indice = 0;
    }

    public void agregarCliente(Cliente cliente) {
        if (this.indice < this.clientes.length) {
            this.clientes[this.indice++] = cliente;
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más clientes. El límite ha sido alcanzado.");
        }
    }

    public void mostrarListadoClientes() {
        StringBuilder mensajeClientes = new StringBuilder("Listado de clientes:\n");

        for (int i = 0; i < this.indice; i++) {
            if (this.clientes[i] != null) {
                mensajeClientes.append(this.clientes[i].informacion()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensajeClientes.toString());
    }

    public Cliente consultarCliente(String usuario) {
        for (int i = 0; i < this.indice; i++) {
            if (this.clientes[i] != null && this.clientes[i].getUsuario().equals(usuario)) {
                return this.clientes[i];
            }
        }
        return null;
    }
     // Agrega el método obtenerListadoClientes()
    public Cliente[] obtenerListadoClientes() {
        int cantidadClientes = 0;

        // Contar la cantidad de clientes no nulos
        for (Cliente cliente : this.clientes) {
            if (cliente != null) {
                cantidadClientes++;
            }
        }

        // Crear un nuevo array con la cantidad exacta de clientes no nulos
        Cliente[] listadoClientes = new Cliente[cantidadClientes];

        // Copiar los clientes no nulos al nuevo array
        int index = 0;
        for (Cliente cliente : this.clientes) {
            if (cliente != null) {
                listadoClientes[index++] = cliente;
            }
        }

        return listadoClientes;
    }

    public void inactivarCliente(String usuario) {
        for (int i = 0; i < this.indice; i++) {
            if (this.clientes[i] != null && this.clientes[i].getUsuario().equals(usuario)) {
                this.clientes[i].setEstado("Inactivo");
                JOptionPane.showMessageDialog(null, "Cliente inactivado exitosamente");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
    }
}
