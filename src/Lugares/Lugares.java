package src.Lugares;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Lugares {
    private String nombre;
    private int código;
    private HashSet<Coordenadas> listaDeCoordenadas;

    public Lugares(String nombre, int código, HashSet <Coordenadas> listaDeCoordenadas) {
        this.nombre = nombre;
        this.código = código;
        this.listaDeCoordenadas = listaDeCoordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public HashSet<Coordenadas> getListaDeCoordenadas() {
        return listaDeCoordenadas;
    }

    public void setListaDeCoordenadas(HashSet<Coordenadas> listaDeCoordenadas) {
        this.listaDeCoordenadas = listaDeCoordenadas;
    }

    public abstract int CantidadDePoblacion();
}
