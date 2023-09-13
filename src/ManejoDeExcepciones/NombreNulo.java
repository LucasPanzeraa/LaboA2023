package src.ManejoDeExcepciones;

public class NombreNulo extends Exception{

    public NombreNulo(String mensaje){
        super(mensaje);
    }

    @Override
    public String toString() {
        return "nombreNulo";
    }
}