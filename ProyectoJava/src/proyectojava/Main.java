package proyectojava;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        EmpleadoManager empleadoManager = new EmpleadoManager();
        ClienteManager clienteManager = new ClienteManager();
        String usuario;
        String nombre, apellido, estado, password;
        int opcion;

        do {
            String mensaje = "1. Agregar empleado\n"
                    + "2. Consultar empleado\n"
                    + "3. Inactivar empleado\n"
                    + "4. Agregar cliente\n"
                    + "5. Consultar cliente\n"
                    + "6. Inactivar cliente\n"
                    + "7. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado");
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado");
                    password = JOptionPane.showInputDialog("Ingrese la contraseña del empleado");
                    estado = JOptionPane.showInputDialog("Ingrese el estado del empleado");

                    Empleado empleado = new Empleado();
                    empleado.setNombre(nombre);
                    empleado.setApellido(apellido);
                    empleado.setUsuario(usuario);
                    empleado.setPassword(password);
                    empleado.setEstado(estado);

                    empleadoManager.agregarEmpleado(empleado);
                    break;
                case 2:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado que desea consultar");
                    Empleado empleadoConsultado = empleadoManager.consultarEmpleado(usuario);
                    if (empleadoConsultado != null) {
                        JOptionPane.showMessageDialog(null, empleadoConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;
                case 3:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado que desea inactivar");
                    empleadoManager.inactivarEmpleado(usuario);
                    empleadoConsultado = empleadoManager.consultarEmpleado(usuario);
                    if (empleadoConsultado != null) {
                        JOptionPane.showMessageDialog(null, empleadoConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;
                case 4:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del cliente");
                    password = JOptionPane.showInputDialog("Ingrese la contraseña del cliente");
                    estado = JOptionPane.showInputDialog("Ingrese el estado del cliente");

                    Cliente nuevoCliente = new Cliente();
                    nuevoCliente.setNombre(nombre);
                    nuevoCliente.setApellido(apellido);
                    nuevoCliente.setUsuario(usuario);
                    nuevoCliente.setPassword(password);
                    nuevoCliente.setEstado(estado);

                    clienteManager.agregarCliente(nuevoCliente);
                    break;
                case 5:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del cliente que desea consultar");
                    Cliente clienteConsultado = clienteManager.consultarCliente(usuario);
                    if (clienteConsultado != null) {
                        JOptionPane.showMessageDialog(null, clienteConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    }
                    break;
                case 6:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del cliente que desea inactivar");
                    clienteManager.inactivarCliente(usuario);
                    Cliente clienteInactivado = clienteManager.consultarCliente(usuario);
                    if (clienteInactivado != null) {
                        JOptionPane.showMessageDialog(null, "Cliente inactivado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (opcion != 7);
    }
}
