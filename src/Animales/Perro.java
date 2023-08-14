package src.Animales;

import src.Personas.Persona;

public class Perro extends Mascotas{

    public Perro(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    public void saludo() {
        System.out.println("Guau");
    }
}
