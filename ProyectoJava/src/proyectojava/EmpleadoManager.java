package proyectojava;

public class EmpleadoManager {
 private Empleado[] empleados;

 public EmpleadoManager() {
     this.empleados = new Empleado[10]; 
 }

 public void agregarEmpleado(Empleado empleado) {
     for (int i = 0; i < this.empleados.length; i++) {
         if (this.empleados[i] == null) {
             this.empleados[i] = empleado;
             break;
         }
     }
 }

 public Empleado consultarEmpleado(String usuario) {
     for (Empleado empleado : this.empleados) {
         if (empleado != null && empleado.getUsuario().equals(usuario)) {
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