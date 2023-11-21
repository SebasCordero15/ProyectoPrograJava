package proyectojava;

public class EquiposManager {
 private CatalogoEquipos[] equipos;
 private int numEquipos;

 public EquiposManager() {
     this.equipos = new CatalogoEquipos[10]; 
     this.numEquipos = 0;
 }

 public void agregarEquipo(CatalogoEquipos equipo) {
     this.equipos[this.numEquipos] = equipo;
     this.numEquipos++;
 }

 public CatalogoEquipos consultarEquipo(String nombre) {
     for (int i = 0; i < this.numEquipos; i++) {
         Equipo equipoEnCatalogo = this.equipos[i].buscarEquipo(nombre);
         if (equipoEnCatalogo != null) {
             return this.equipos[i];
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