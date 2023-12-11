package proyectojava;

import javax.swing.JOptionPane;

public class CajaManager {
    private Caja caja;

    public CajaManager() {
        this.caja = new Caja();
    }

    public void registrarFactura(Factura factura) {
        caja.registrarFactura(factura);
    }

    public void mostrarIngresosDelDia() {
        JOptionPane.showMessageDialog(null, "Monto Total del Día: $" + caja.obtenerMontoTotal());
    }

    public void mostrarListadoClientes() {
        Factura[] facturas = caja.obtenerListadoFacturas();
        StringBuilder listadoClientes = new StringBuilder("Listado de Clientes:\n");

        for (Factura factura : facturas) {
            if (factura != null) {
                listadoClientes.append(factura.getNombre()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, listadoClientes.toString());
    }
}