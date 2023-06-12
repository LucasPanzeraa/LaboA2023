package src.Lugares;

import java.util.ArrayList;

public class Coordenadas extends Lugares {
    private int latitud;
    private int altitud;

    public Coordenadas(String nombre, int código, ArrayList<Coordenadas> listaDeCoordenadas, int latitud, int altitud) {
        super(nombre, código, listaDeCoordenadas);
        this.latitud = latitud;
        this.altitud = altitud;
    }


    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }
}
