package src.Animales;

import src.Personas.Dueño;
public class Perro extends Mascotas{

    private int alegria;

    public Perro(String nombre, Dueño dueño) {
        super(nombre, dueño);
        alegria = 0;
    }

    @Override
    public String saludo() {
        String saludo = "";
        for (int i = 0; i< alegria; i++){
            saludo = saludo + " guau";
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
