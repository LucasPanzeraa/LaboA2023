package src.Animales;

import src.Personas.Persona;

public class Gato extends Mascotas{

    public Gato(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    public void saludo() {
        System.out.println("Miau");
    }
}
