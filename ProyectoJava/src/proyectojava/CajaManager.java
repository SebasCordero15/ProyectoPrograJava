package proyectojava;

import javax.swing.JOptionPane;

public class CajaManager {
    private FacturaManager facturaManager;
    private ClienteManager clienteManager;
    private Caja caja;

    public CajaManager() {
        this.facturaManager = new FacturaManager();
        this.clienteManager = new ClienteManager();
    }

    public void registrarFactura(Factura factura) {
        if (this.caja == null) {
            this.caja = new Caja();
        }
        double monto = factura.getMonto();
        caja.sumarIngreso(monto);
    }

    public void mostrarIngresosDelDia() {
        JOptionPane.showMessageDialog(null, "Ingresos del día: ₡" + caja.getIngresosDia());
    }

    public void mostrarListadoClientes() {
        Cliente[] listadoClientes = clienteManager.obtenerListadoClientes();
        StringBuilder mensajeClientes = new StringBuilder("Listado de clientes:\n");

        for (Cliente cliente : listadoClientes) {
            if (cliente != null) {
                mensajeClientes.append(cliente.informacion()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensajeClientes.toString());
    }
}
