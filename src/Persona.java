public class Persona {
    public int edad;
    public String nombre;
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void saludo(){
        System.out.println("Saludos soy una persona!");
    }
}
