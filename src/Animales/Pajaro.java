package src.Animales;

import src.Personas.Dueño;
import src.Personas.Persona;

public class Pajaro extends Mascotas{
    int alegria;

    public Pajaro(String nombre, Dueño dueño) {
        super(nombre, dueño);
        alegria = 0;
    }

    @Override
    public String saludo() {
        String saludo = "";
        for (int i = 0; i< alegria; i++){
            saludo = saludo + " pio";
        }
        if (alegria > 1){
            alegria --;
        }
        return saludo;
    }

    @Override
    public void alimentar() {
        alegria ++;
    }

    @Override
    public void tipoMascota() {
        System.out.println("la mascota elegida es un gato");
    }
}
