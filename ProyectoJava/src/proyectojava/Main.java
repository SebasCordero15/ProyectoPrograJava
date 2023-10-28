package proyectojava;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        EmpleadoManager manager = new EmpleadoManager();
        String usuario;
        String nombre, apellido, estado, password;
        int opcion;

        do {
            String mensaje = "1. Agregar empleado\n"
                            + "2. Consultar empleado\n"
                            + "3. Inactivar empleado\n"
                            + "4. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado");
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado");
                    password = JOptionPane.showInputDialog("Ingrese la contraseña del empleado");
                    estado = JOptionPane.showInputDialog("Ingrese el estado del empleado");

                    Empleado empleado1 = new Empleado();
                    empleado1.setNombre(nombre);
                    empleado1.setApellido(apellido);
                    empleado1.setUsuario(usuario);
                    empleado1.setPassword(password);
                    empleado1.setEstado(estado);

                    manager.agregarEmpleado(empleado1);
                    break;
                case 2:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado que desea consultar");
                    Empleado empleadoConsultado = manager.consultarEmpleado(usuario);
                    if (empleadoConsultado != null) {
                        JOptionPane.showMessageDialog(null, empleadoConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;
                case 3:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado que desea inactivar");
                    manager.inactivarEmpleado(usuario);
                    empleadoConsultado = manager.consultarEmpleado(usuario);
                    if (empleadoConsultado != null) {
                        JOptionPane.showMessageDialog(null, empleadoConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (opcion != 4);
    }
}