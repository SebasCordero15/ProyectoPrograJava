package proyectojava;
public class Factura {
    private String nombre;
    private String fecha;
    private String hora;
    private double monto;
    private String articulo;
    
    public Factura(){
        this.nombre = "";
        this.fecha = "";
        this.hora = "";
        this.monto = monto;
        this.articulo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getMonto() {
        return monto = monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}