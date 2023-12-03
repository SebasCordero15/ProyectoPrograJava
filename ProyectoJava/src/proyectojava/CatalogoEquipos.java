package proyectojava;

public class CatalogoEquipos {
    private Equipo[] equipos;
    private int cantidadEquipos;

    public CatalogoEquipos(int capacidadMaxima) {
        this.equipos = new Equipo[capacidadMaxima];
        this.cantidadEquipos = 0;
    }

    public void agregarEquipo(String nombre, String categoria, String empleado, String sucursal) {
        if (buscarEquipo(nombre) != null) {
            System.out.println("El equipo ya está registrado.");
            return;
        }

        if (cantidadEquipos < equipos.length) {
            Equipo nuevoEquipo = new Equipo(nombre, categoria, empleado, sucursal);
            equipos[cantidadEquipos] = nuevoEquipo;
            cantidadEquipos++;
            System.out.println("Equipo agregado correctamente.");
        } else {
            System.out.println("No se puede agregar más equipos. Capacidad máxima alcanzada.");
        }
    }

    public void editarEquipo(String nombre, String nuevaCategoria, String nuevoEmpleado, String nuevaSucursal) {
        Equipo equipo = buscarEquipo(nombre);
        if (equipo != null) {
            equipo.setCategoria(nuevaCategoria);
            equipo.setEmpleadoACargo(nuevoEmpleado);
            equipo.setSucursal(nuevaSucursal);
            System.out.println("Equipo editado correctamente.");
        } else {
            System.out.println("El equipo no se encontró, no se pudo editar.");
        }
    }

    public void inactivarEquipo(String nombre) {
        Equipo equipo = buscarEquipo(nombre);
        if (equipo != null) {
            equipos[cantidadEquipos] = null;
            cantidadEquipos--;
            System.out.println("Equipo inactivado correctamente.");
        } else {
            System.out.println("El equipo no se encontró, no se pudo inactivar.");
        }
    }

    public boolean existeEquipo(String nombre) {
        return buscarEquipo(nombre) != null;
    }

    public Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo != null && equipo.getNombreEquipo().equals(nombre)) {
                return equipo;
            }
        }
        return null;
    }

    private static class Equipo {
        private String nombreEquipo;
        private String categoria;
        private String empleadoACargo;
        private String nombreSucursal;

        public Equipo(String nombre, String categoria, String empleado, String sucursal) {
            this.nombreEquipo = nombre;
            this.categoria = categoria;
            this.empleadoACargo = empleado;
            this.nombreSucursal = sucursal;
        }

        public String getNombreEquipo() {
            return nombreEquipo;
        }

        public String getCategoria() {
            return categoria;
        }

        public String getEmpleadoACargo() {
            return empleadoACargo;
        }

        public String getNombreSucursal() {
            return nombreSucursal;
        }

        public void setCategoria(String nuevaCategoria) {
            this.categoria = nuevaCategoria;
        }

        public void setEmpleadoACargo(String nuevoEmpleado) {
            this.empleadoACargo = nuevoEmpleado;
        }

        public void setSucursal(String nuevaSucursal) {
            this.nombreSucursal = nuevaSucursal;
        }
    }
}
