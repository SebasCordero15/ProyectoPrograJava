package proyectojava;

public class CatalogoSucursal {
    private String NombreSucursal;
    private String Lugar;
    private String Horario;
    private String Telefono;
    private String Correo;
    
    public CatalogoSucursal(){
        this.NombreSucursal = "";
        this.Lugar = "";
        this.Horario = "";
        this.Telefono = "";
        this.Correo = "";
    }

    public String getNombreSucursal() {
        return NombreSucursal;
    }

    public void setNombreSucursal(String NombreSucursal) {
        this.NombreSucursal = NombreSucursal;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public String informacion(){
        return "Nombre: " + NombreSucursal + "\nLugar: " + Lugar + "\nHorario: " + Horario + "\nTelefono: " + Telefono + "\nCorreo: " + Correo;
    }
    
}
