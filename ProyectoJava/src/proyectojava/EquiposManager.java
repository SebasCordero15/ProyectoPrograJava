package proyectojava;

public class EquiposManager {
   private CatalogoEquipos[] equipos;

   public EquiposManager() {
       this.equipos = new CatalogoEquipos[10]; 
   }

   public void agregarEquipo(CatalogoEquipos equipo) {
       for (int i = 0; i < equipos.length; i++) {
           if (equipos[i] == null) {
               equipos[i] = equipo;
               break;
           }
       }
   }

   public CatalogoEquipos consultarEquipo(String nombre) {
       for (CatalogoEquipos catalogo : equipos) {
           if (catalogo != null && catalogo.buscarEquipo(nombre) != null) {
               return catalogo;
           }
       }
       return null;
   }

   public void editarEquipo(String nombre, String nuevaCategoria, String nuevoEmpleado, String nuevaSucursal) {
       CatalogoEquipos catalogo = consultarEquipo(nombre);
       if (catalogo != null) {
           catalogo.editarEquipo(nombre, nuevaCategoria, nuevoEmpleado, nuevaSucursal);
       }
   }

   public void inactivarEquipo(String nombre) {
       CatalogoEquipos catalogo = consultarEquipo(nombre);
       if (catalogo != null) {
           catalogo.inactivarEquipo(nombre);
       }
   }
}