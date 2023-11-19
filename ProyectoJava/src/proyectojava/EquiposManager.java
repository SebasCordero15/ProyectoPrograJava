package proyectojava;

import java.util.ArrayList;

public class EquiposManager {
    private ArrayList<CatalogoEquipos> equipos;

    public EquiposManager() {
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(CatalogoEquipos equipo) {
        this.equipos.add(equipo);
    }

    public CatalogoEquipos consultarEquipo(String nombre) {
        for (CatalogoEquipos catalogo : this.equipos) {
            Equipo equipoEnCatalogo = catalogo.buscarEquipo(nombre);
            if (equipoEnCatalogo != null) {
                return catalogo;
            }
        }
        return null;
    }

    public void editarEquipo(String nombre, String nuevaCategoria, String nuevoEmpleado, String nuevaSucursal) {
        CatalogoEquipos catalogo = this.consultarEquipo(nombre);
        if (catalogo != null) {
            catalogo.editarEquipo(nombre, nuevaCategoria, nuevoEmpleado, nuevaSucursal);
            System.out.println("Equipo editado correctamente.");
        } else {
            System.out.println("El equipo no se encontró, no se pudo editar.");
        }
    }

    public void inactivarEquipo(String nombre) {
        CatalogoEquipos catalogo = this.consultarEquipo(nombre);
        if (catalogo != null) {
            catalogo.inactivarEquipo(nombre);
            System.out.println("Equipo inactivado correctamente.");
        } else {
            System.out.println("El equipo no se encontró, no se pudo inactivar.");
        }
    }
}