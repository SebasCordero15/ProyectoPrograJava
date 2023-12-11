package proyectojava;
import javax.swing.JOptionPane;
public class Caja {
    private double ingreso;
    private Factura[] facturas;

    public Caja() {
        this.ingreso = 0;
        this.facturas = new Factura[10];
    }

    public void registrarFactura(Factura factura) {
        // Agregar la factura a la lista
        for (int i = 0; i < this.facturas.length; i++) {
            if (this.facturas[i] == null) {
                this.facturas[i] = factura;
                this.ingreso += factura.getMonto();
                JOptionPane.showMessageDialog(null, "Factura registrada en la caja exitosamente");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se pueden agregar más facturas. El límite ha sido alcanzado.");
    }

    public double obtenerMontoTotal() {
        return ingreso;
    }

    public Factura[] obtenerListadoFacturas() {
        return facturas;
    }
}
