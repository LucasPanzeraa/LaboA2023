package src.Animales;

import src.Personas.Persona;

public class Cantor extends Mascotas{

    public Cantor(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    public void saludo() {
        System.out.println("PioooPumtsks");
    }
}
