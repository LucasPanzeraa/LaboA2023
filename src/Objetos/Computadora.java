package src.Objetos;

import src.Objetos.Componentes;

import java.util.ArrayList;

public class Computadora {

    private ArrayList<Componentes>listaDeComponentes;

    public Computadora(ArrayList<Componentes> listaDeComponentes) {
        this.listaDeComponentes = listaDeComponentes;
    }


    public ArrayList<Componentes> getListaDeComponentes() {
        return listaDeComponentes;
    }

    public void setListaDeComponentes(ArrayList<Componentes> listaDeComponentes) {
        this.listaDeComponentes = listaDeComponentes;
    }
}
