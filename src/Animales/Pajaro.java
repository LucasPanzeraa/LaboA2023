package src.Animales;

import src.Personas.Persona;

public class Pajaro extends Mascotas{

    public Pajaro(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    public void saludo() {
        System.out.println("Poi Pio");
    }
}
