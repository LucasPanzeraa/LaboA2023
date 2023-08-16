package src.Animales;

import src.Personas.Dueño;

public class Cantor extends Mascotas {

    int alegria;

    public Cantor(String nombre, Dueño dueño) {
        super(nombre, dueño);
        alegria = 0;
    }

    @Override
    public String saludo() {
        String saludo = "";
        for (int i = 0; i < alegria; i++) {
            saludo = saludo + " PioooPumtsks";
        }
        if (alegria > 1){
            alegria --;
        }
        return saludo;
    }

    @Override
    public void alimentar() {
        alegria++;
    }
}
