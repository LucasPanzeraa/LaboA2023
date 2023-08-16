package src.Animales;

import src.Personas.Dueño;

public class Pez extends Mascotas{
    private int vidaActuales;
    private static int vidainicial = 10;

    public Pez(String nombre, Dueño dueño) {
        super(nombre, dueño);
        vidaActuales = vidainicial;
    }

    public int getVidaActuales() {
        return vidaActuales;
    }

    public void setVidaActuales(int vidaActuales) {
        this.vidaActuales = vidaActuales;
    }

    public static int getVidainicial() {
        return vidainicial;
    }

    public static void setVidainicial(int vidainicial) {
        Pez.vidainicial = vidainicial;
    }

    @Override
    public String saludo() {
        vidaActuales = vidaActuales-1;
        return null;
    }


    public void alimentar (){
        setVidaActuales(vidaActuales ++);
    }
}
