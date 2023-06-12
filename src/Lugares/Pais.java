package src.Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugares{

    private HashSet<Provincia> listaDeProvincias;



    public Pais() {
        super("nombre", 1, new HashSet<>());
        listaDeProvincias = new HashSet<>();
    }

    public HashSet<Provincia> getListaDeProvincias() {
        return listaDeProvincias;
    }

    public void setListaDeProvincias(HashSet<Provincia> listaDeProvincias) {
        this.listaDeProvincias = listaDeProvincias;
    }

    @Override
    public int CantidadDePoblacion (){
        int poblacion = 0;

        for ( Provincia lista : listaDeProvincias) {
            poblacion += lista.CantidadDePoblacion();
        }

        return poblacion;
    }
}
