package proyectojava;

import java.util.ArrayList;

public class EmpleadoManager {
    private ArrayList<Empleado> empleados;

    public EmpleadoManager() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public Empleado consultarEmpleado(String usuario) {
        for (Empleado empleado : this.empleados) {
            if (empleado.getUsuario().equals(usuario)) {
                return empleado;
            }
        }
        return null;
    }

    public void inactivarEmpleado(String usuario) {
        Empleado empleado = this.consultarEmpleado(usuario);
        if (empleado != null) {
            empleado.setEstado("Inactivo");
        }
    }
}
