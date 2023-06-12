package src.Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Provincia extends Lugares{

    private HashSet<Ciudad> listaDeCiudades;

    public Provincia(String nombre, int código, ArrayList<Coordenadas> listaDeCoordenadas, HashSet<Ciudad> listaDeCiudades) {
        super(nombre, código, listaDeCoordenadas);
        this.listaDeCiudades = listaDeCiudades;
    }

    public HashSet<Ciudad> getListaDeCiudades() {
        return listaDeCiudades;
    }

    public void setListaDeCiudades(HashSet<Ciudad> listaDeCiudades) {
        this.listaDeCiudades = listaDeCiudades;
    }

    @Override
    public int CantidadDePoblacion (){
        int poblacion = 0;

        for ( Ciudad lista : listaDeCiudades ) {
            poblacion += lista.CantidadDePoblacion();
        }

        return poblacion;
    }
}
