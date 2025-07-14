public class Principal {
    public static void main(String[] args) {
        // Creacion de objeto con constructor por defecto
        Persona persona1 = new Persona();
        persona1.mostrarInformacion();
        System.out.println();

        // Creacion de objeto con constructor parametrizado
        Persona persona2 = new Persona("Carlos", 25);
        persona2.mostrarInformacion();
        System.out.println();

        // Creacion de objeto con constructor sobrecargado
        Persona persona3 = new Persona("Ana");
        persona3.mostrarInformacion();
    }
}
