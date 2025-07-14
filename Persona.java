public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        System.out.println("Constructor por defecto llamado.");
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor parametrizado llamado.");
    }

    // Sobrecarga de constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18; // edad por defecto
        System.out.println("Constructor sobrecargado (solo nombre) llamado.");
    }

    // Mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
