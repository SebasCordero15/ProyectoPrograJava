package proyectojava;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        EmpleadoManager empleadoManager = new EmpleadoManager();
        ClienteManager clienteManager = new ClienteManager();
        SucursalManager sucursalManager = new SucursalManager();
        String usuario;
        String nombre, apellido, estado, password;
        String nsucursal, lugar, horario, telefono, correo;
        int opcion;

        do {
            String mensaje = "1. Agregar empleado\n"
                    + "2. Consultar empleado\n"
                    + "3. Inactivar empleado\n"
                    + "4. Agregar cliente\n"
                    + "5. Consultar cliente\n"
                    + "6. Agregar sucursal al catalogo\n"
                    + "7. Inactivar cliente\n"
                    + "8. Salir";
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
                    nsucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal");
                    lugar = JOptionPane.showInputDialog("Ingrese el lugar de la sucursal");
                    horario = JOptionPane.showInputDialog("Ingrese el horario de la sucursal");
                    telefono = JOptionPane.showInputDialog("Ingrese el telefono de l sucursal");
                    correo = JOptionPane.showInputDialog("Ingrese el correo de la sucursal");
                    estado = JOptionPane.showInputDialog("Ingrese el estado de la sucursal");

                    CatalogoSucursal sucursal = new CatalogoSucursal();
                    sucursal.setNombreSucursal(nsucursal);
                    sucursal.setLugar(lugar);
                    sucursal.setHorario(horario);
                    sucursal.setTelefono(telefono);
                    sucursal.setCorreo(correo);
                    sucursal.setEstado(estado);
                    
                    sucursalManager.agregarSucursal(sucursal);
                    break;
                case 7:
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del cliente que desea inactivar");
                    clienteManager.inactivarCliente(usuario);
                    Cliente clienteInactivado = clienteManager.consultarCliente(usuario);
                    if (clienteInactivado != null) {
                        JOptionPane.showMessageDialog(null, "Cliente inactivado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (opcion != 7);
    }
}
