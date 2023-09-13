package src.ManejoDeExcepciones;

public class LimiteDePrestamosAlcanzadoException extends Exception{
    public LimiteDePrestamosAlcanzadoException(String mensaje){
        super(mensaje);
    }
}
