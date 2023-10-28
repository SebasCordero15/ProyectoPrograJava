package proyectojava;

public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Password;
    private String Estado;
    
    public Empleado(){
        this.Nombre="";
        this.Apellido="";
        this.Usuario="";
        this.Password="";
        this.Estado="";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    public String informacion() {
        return "Nombre: " + Nombre + "\nApellidos: " + Apellido + "\nUsuario: " + Usuario + "\nPassword: " + Password + "\nEstado: " + Estado;
    }
}

