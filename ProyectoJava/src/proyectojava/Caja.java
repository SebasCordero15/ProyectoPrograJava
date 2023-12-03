package proyectojava;

public class Caja {
    private double ingresosDia;

    public Caja() {
        this.ingresosDia = 0.0;
    }

    public double getIngresosDia() {
        return ingresosDia;
    }

    public void sumarIngreso(double monto) {
        ingresosDia += monto;
    }
}

