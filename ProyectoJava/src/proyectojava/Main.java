package proyectojava;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        EmpleadoManager empleadoManager = new EmpleadoManager();
        ClienteManager clienteManager = new ClienteManager();
        SucursalManager sucursalManager = new SucursalManager();
        CatalogoEquipos catalogoEquipos = new CatalogoEquipos();
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
                    + "6. Inactivar cliente\n"
                    + "7. Agregar sucursal al catalogo\n"
                    + "8. Consultar sucursales\n"
                    + "9. Editar sucursal\n"
                    + "10. Inactivar sucursal\n"
                    + "11. Agregar equipo\n"
                    + "12. Editar equipo\n"
                    + "13. Inactivar equipo\n"
                    + "14. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            switch (opcion) {
                // Agregar empleado
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
                    // Consultar empleado
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado que desea consultar");
                    Empleado empleadoConsultado = empleadoManager.consultarEmpleado(usuario);
                    if (empleadoConsultado != null) {
                        JOptionPane.showMessageDialog(null, empleadoConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;
                case 3:
                    // inactivar empleado
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
                    // agregar cliente
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
                    // consultar cliente
                    usuario = JOptionPane.showInputDialog("Ingrese el usuario del cliente que desea consultar");
                    Cliente clienteConsultado = clienteManager.consultarCliente(usuario);
                    if (clienteConsultado != null) {
                        JOptionPane.showMessageDialog(null, clienteConsultado.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    }
                    break;
                case 6:
                    // inactivar cliente
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
                    // agregar sucursal
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
                case 8:
                    // Consultar sucursal
                    nsucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal que desea consultar");
                    CatalogoSucursal sucrusalConsultada = sucursalManager.consultarSucursal(nsucursal);
                    if (sucrusalConsultada != null) {
                        JOptionPane.showMessageDialog(null, sucrusalConsultada.informacion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Sucursal no encontrado");
                    }
                    break;
                case 9:
                    // editar sucursal
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal que desea editar");
                    lugar = JOptionPane.showInputDialog("Ingrese el nuevo lugar de la sucursal");
                    horario = JOptionPane.showInputDialog("Ingrese el nuevo horario de la sucursal");
                    telefono = JOptionPane.showInputDialog("Ingrese el nuevo telefono de la sucursal");
                    correo = JOptionPane.showInputDialog("Ingrese el nuevo correo de la sucursal");
                    sucursalManager.editarSucursal(nombre, lugar, horario, telefono, correo);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
                case 10:
                    // inactivar sucursal
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal que desea inactivar");
                    sucursalManager.inactivarSucursal(nombre);
                    JOptionPane.showMessageDialog(null, "La sucursal ha sido desactivada exitosamente");
                    break;
                case 11:
                    // agragar equipo
                    String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo");
                    String categoria = JOptionPane.showInputDialog("Ingrese la categoría del equipo");
                    String empleadoACargo = JOptionPane.showInputDialog("Ingrese el empleado a cargo del equipo");
                    String sucursalEquipo = JOptionPane.showInputDialog("Ingrese la sucursal del equipo");

                    catalogoEquipos.agregarEquipo(nombreEquipo, categoria, empleadoACargo, sucursalEquipo);
                    break;
                case 12:
                    // editar equipo
                    String nombreEquipoEditar = JOptionPane
                            .showInputDialog("Ingrese el nombre del equipo que desea editar");
                    String nuevaCategoria = JOptionPane.showInputDialog("Ingrese la nueva categoría del equipo");
                    String nuevoEmpleadoACargo = JOptionPane
                            .showInputDialog("Ingrese el nuevo empleado a cargo del equipo");
                    String nuevaSucursalEquipo = JOptionPane.showInputDialog("Ingrese la nueva sucursal del equipo");

                    catalogoEquipos.editarEquipo(nombreEquipoEditar, nuevaCategoria, nuevoEmpleadoACargo,
                            nuevaSucursalEquipo);
                    break;
                case 13:
                    // inactivar equipo
                    String nombreEquipoInactivar = JOptionPane
                            .showInputDialog("Ingrese el nombre del equipo que desea inactivar");

                    catalogoEquipos.inactivarEquipo(nombreEquipoInactivar);
                    break;
                case 14:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                    break;
            }
        } while (opcion != 14);
    }
}
