package src.Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Ciudad extends Lugares{

    private HashSet<Barrio> listaDeBarrios;

    public Ciudad(String nombre, int código, HashSet<Coordenadas> listaDeCoordenadas, HashSet<Barrio> listaDeBarrios) {
        super(nombre, código, listaDeCoordenadas);
        this.listaDeBarrios = listaDeBarrios;
    }

    public HashSet<Barrio> getListaDeBarrios() {
        return listaDeBarrios;
    }

    public void setListaDeBarrios(HashSet<Barrio> listaDeBarrios) {
        this.listaDeBarrios = listaDeBarrios;
    }

    @Override
    public int CantidadDePoblacion (){

        int poblacion = 0;
        for ( Barrio lista : listaDeBarrios ) {
            poblacion += lista.getPoblacion();
        }

        return poblacion;
    }
}
