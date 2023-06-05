package src.Personas;

import java.util.ArrayList;

public class Familia {

    ArrayList<Persona> listaDePersonas;

    public Familia(ArrayList<Persona> listaDePersonas) {
        this.listaDePersonas = listaDePersonas;
    }

    public ArrayList<Persona> getListaDePersonas() {
        return listaDePersonas;
    }

    public void setListaDePersonas(ArrayList<Persona> listaDePersonas) {
        this.listaDePersonas = listaDePersonas;
    }
}
