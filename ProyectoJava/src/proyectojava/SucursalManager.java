package proyectojava;
public class SucursalManager {
    private CatalogoSucursal[] sucursales;
    private int numSucursales;
  
    public SucursalManager() {
        this.sucursales = new CatalogoSucursal[10]; 
        this.numSucursales = 0;
    }
  
    public void agregarSucursal(CatalogoSucursal sucursal) {
        this.sucursales[this.numSucursales] = sucursal;
        this.numSucursales++;
    }
  
    public CatalogoSucursal consultarSucursal(String Nombre) {
        for (int i = 0; i < this.numSucursales; i++) {
            if (this.sucursales[i].getNombreSucursal().equals(Nombre)) {
                return this.sucursales[i];
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
