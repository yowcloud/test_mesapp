package abp.project.v2Videojuegos.m03uf4.personaje;

public class PersonajePlataforma extends Personaje{

    public PersonajePlataforma(String nombre, int year) {
        super(nombre, year);
    }
    @Override
    //Cuando habla() dice: Soy Plataforma
    public void habla(){
        System.out.println("Soy Plataforma");
       // mostrarMensaje("Soy Plataforma. yow");
    }
    @Override
    //cuenado juega() imprime ---___--_-_-
    public void juega(){
        System.out.println("---___--_-_-");
    }

    @Override
    public String toString() {
        return "Personaje Plataforma{" + "nombre=" + nombre + ", year=" + year + '}';
    }

}
