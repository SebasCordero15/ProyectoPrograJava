package proyectojava;
import java.util.ArrayList;

public class SucursalManager {
    private ArrayList<CatalogoSucursal> sucursales;

    public SucursalManager() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(CatalogoSucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public CatalogoSucursal consultarSucursal(String Nombre) {
        for (CatalogoSucursal sucursal : this.sucursales) {
            if (sucursal.getNombreSucursal().equals(Nombre)) {
                return sucursal;
            }
        }
        return null;
    }
    
    public void editarSucursal(String nombre, String lugar, String horario, String telefono, String correo) {
   CatalogoSucursal sucursal = this.consultarSucursal(nombre);
   if (sucursal != null) {
       sucursal.setLugar(lugar);
       sucursal.setHorario(horario);
       sucursal.setTelefono(telefono);
       sucursal.setCorreo(correo);
   }
}

    public void inactivarSucursal(String Nombre) {
        CatalogoSucursal sucursal = this.consultarSucursal(Nombre);
        if (sucursal != null) {
            sucursal.setEstado("Inactivo");
        }
    }
}
