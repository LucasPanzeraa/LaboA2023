package src.ManejoDeExcepciones;

public class PersonasExistentesExeption extends Exception{
    public PersonasExistentesExeption(String mensaje) {
        super(mensaje);
    }
}
