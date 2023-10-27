package proyectojava;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo Edu");
        // Project inicializado

        //ejemplo
        Cliente nuevoCliente = new Cliente("Juan", "Pérez", "Activo", true);

        nuevoCliente.consultarCliente();
    }
}
