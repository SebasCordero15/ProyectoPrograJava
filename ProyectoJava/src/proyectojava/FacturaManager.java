package proyectojava;
import javax.swing.JOptionPane;
public class FacturaManager {
private Factura facturas[]=new Factura[10];

    
    public void crearFactura(Factura factura){
        int x;
        for(x=0;x<facturas.length;x++){
            Factura f=new Factura();
            f.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente: "));
            f.setFecha(JOptionPane.showInputDialog(null,"Ingrese la fecha de la compra: "));
            f.setHora(JOptionPane.showInputDialog(null,"Ingrese la hora en que se realizo la compra: "));
            f.setMonto(JOptionPane.showInputDialog(null,"Ingrese el monto de la compra: "));
            f.setArticulo(JOptionPane.showInputDialog(null,"Ingrese la reparacion que se realizo: "));
            facturas[x]=f;
        }
    }
    public void mostrar(){
        int x;
        String s="";
        for(x=0;x<facturas.length;x++){
           s=s+"Nombre: "+facturas[x].getNombre()+"\nFecha: "+facturas[x].getFecha()+"\nHora: "+facturas[x].getHora()+"\nMonto a pagar: "+
                facturas[x].getMonto()+"\nReparacion realizada: "+facturas[x].getArticulo()+"\n\n";
        }
        JOptionPane.showMessageDialog(null,"--------------------\nSu factura es:\n"+s+"\n--------------------");
    }
}
