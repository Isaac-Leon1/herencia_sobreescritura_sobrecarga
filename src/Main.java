// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Herencia");
        System.out.println("Persona:");
        Persona persona1 = new Persona(25,"Edgar");
        persona1.saludo();
        System.out.println("Carpintero:");
        Carpintero carpintero1 = new Carpintero(20, "Isaac","Carpintero");
        carpintero1.saludo();
        carpintero1.imprimirEdad();
        carpintero1.imprimirEdad(2024);
    }
}