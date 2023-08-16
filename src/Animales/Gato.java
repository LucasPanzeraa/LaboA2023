package src.Animales;

import src.Personas.Dueño;
import src.Personas.Persona;

public class Gato extends Mascotas{

    private int alegria;

    public Gato(String nombre, Dueño dueño) {
        super(nombre, dueño);
        alegria = 0;
    }

    @Override
    public String saludo() {
        String saludo = "";
        for (int i = 0; i< alegria; i++){
            saludo = saludo + " miau";
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
    public Mascotas tipoMascota() {
        Gato gato = new Gato("nombre", new Dueño());
        return gato;
    }
}
