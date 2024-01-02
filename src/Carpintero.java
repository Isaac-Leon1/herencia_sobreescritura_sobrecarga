public class Carpintero extends Persona{
    public String profesion;
    public Carpintero(int edad, String nombre, String profesion) {
        super(edad, nombre);
        this.profesion = profesion;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    @Override
    public void saludo() {
        System.out.println("Saludos, soy un carpintero!");
    }
    public void imprimirEdad(){
        System.out.println("Mi edad es "+this.edad);
    }
    public void imprimirEdad(int anio){
        System.out.println("Mi edad es "+this.edad);
        System.out.println("Y estamos en el año "+anio);
    }
}
