package src.Vehiculos;

import java.util.ArrayList;
import java.util.Date;

public class Camioneta extends Vehiculo {

    private String patente;
    private int capacidadDeCarga;


    public Camioneta(String modelo, String marca, String color, int cantidadDeRuedas, Date añoDeFabricacion, String patente, int capacidadDeCarga) {
        super(modelo, marca, color, cantidadDeRuedas, añoDeFabricacion);
        this.patente = patente;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }
}
