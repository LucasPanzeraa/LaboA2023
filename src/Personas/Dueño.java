package src.Personas;

import java.time.LocalDate;

public class Dueño extends Persona{

    public Dueño() {
        super("nombre", "apellido", LocalDate.now());
    }

}
