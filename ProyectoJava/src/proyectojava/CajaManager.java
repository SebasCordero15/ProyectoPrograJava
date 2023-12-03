package proyectojava;

import javax.swing.JOptionPane;

public class CajaManager {
    private FacturaManager facturaManager;
    private Caja caja;

    public CajaManager() {
        this.facturaManager = new FacturaManager();
        this.caja = new Caja();
    }

    public void registrarFactura(Factura factura) {
        double monto = factura.getMonto();
        caja.sumarIngreso(monto);
    }

    public void mostrarIngresosDelDia() {
        JOptionPane.showMessageDialog(null, "Ingresos del día: ₡" + caja.getIngresosDia());
    }

    public void mostrarListadoClientes() {
        facturaManager.mostrar();
    }

    public void mostrarResumenDia() {
        mostrarIngresosDelDia();
    }
}

