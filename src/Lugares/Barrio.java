package src.Lugares;

import java.util.ArrayList;

public class Barrio extends Lugares {

    private int poblacion;

    public Barrio(String nombre, int código, ArrayList<Coordenadas> listaDeCoordenadas, int poblacion) {
        super(nombre, código, listaDeCoordenadas);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int CantidadDePoblacion (){
        return poblacion;
    }
}
