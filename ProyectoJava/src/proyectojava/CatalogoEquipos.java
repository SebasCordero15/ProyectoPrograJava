package proyectojava;

public class CatalogoEquipos {
    private java.util.List<Equipo> equipos;

    public CatalogoEquipos() {
        this.equipos = new java.util.ArrayList<>();
    }

    public void agregarEquipo(String nombre, String categoria, String empleado, String sucursal) {
        if (buscarEquipo(nombre) != null) {
            System.out.println("El equipo ya está registrado.");
            return;
        }

        Equipo nuevoEquipo = new Equipo(nombre, categoria, empleado, sucursal);
        equipos.add(nuevoEquipo);
        System.out.println("Equipo agregado correctamente.");
    }

    private Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombreEquipo().equals(nombre)) {
                return equipo;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        CatalogoEquipos catalogo = new CatalogoEquipos();

        catalogo.agregarEquipo("Laptop1", "Laptops", "Juan Perez", "Sucursal A");
        catalogo.agregarEquipo("Laptop1", "Laptops", "Juan Perez", "Sucursal A");
    }
}

class Equipo {
    private String nombreEquipo;
    private String categoria;
    private String empleadoACargo;
    private String NombreSucursal;

    public Equipo(String nombre, String categoria, String empleado, String sucursal) {
        this.nombreEquipo = nombre;
        this.categoria = categoria;
        this.empleadoACargo = empleado;
        this.NombreSucursal = sucursal;
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

    public String getSucursal() {
        return NombreSucursal;
    }
}