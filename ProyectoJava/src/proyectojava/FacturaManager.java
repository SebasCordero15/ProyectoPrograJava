package proyectojava;

import javax.swing.JOptionPane;

public class FacturaManager {

    private Factura facturas[] = new Factura[10];

    public void crearFactura(Factura factura) {
        factura.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: "));
        factura.setFecha(JOptionPane.showInputDialog(null, "Ingrese la fecha de la compra: "));
        factura.setHora(JOptionPane.showInputDialog(null, "Ingrese la hora en que se realizo la compra: "));
        double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto de la compra: "));
        factura.setMonto(monto);
        factura.setArticulo(JOptionPane.showInputDialog(null, "Ingrese la reparacion que se realizo: "));
        for (int x = 0; x < facturas.length; x++) {
            if (facturas[x] == null) {
                facturas[x] = factura;
                break;
            }
        }
    }

    public void mostrar() {
        int x;
        String nombre = "";
        String s = "";
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la factura que desea ver: ");
        for (x = 0; x < facturas.length; x++) {
            if (facturas[x] != null) {
                if (nombre.equals(facturas[x].getNombre())) {
                    s = s + "Nombre: " + facturas[x].getNombre() + "\nFecha: " + facturas[x].getFecha() + "\nHora: "
                            + facturas[x].getHora() + "\nMonto a pagar: " + facturas[x].getMonto()
                            + "\nReparacion realizada: " + facturas[x].getArticulo() + "\n\n";
                }
            }

        }
        JOptionPane.showMessageDialog(null,
                "--------------------\n Su factura es:\n" + s + "\n--------------------");
    }
}
