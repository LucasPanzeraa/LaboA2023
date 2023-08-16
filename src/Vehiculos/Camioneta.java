package src.Vehiculos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Camioneta extends Vehiculo {

    private String patente;
    private int capacidadDeCarga;
    private int cargaActual;


    public Camioneta(String modelo, String marca, String color, int cantidadDeRuedas, Date añoDeFabricacion, String patente, int capacidadDeCarga, int cargaActual) {
        super(modelo, marca, color, cantidadDeRuedas, añoDeFabricacion);
        this.patente = patente;
        this.capacidadDeCarga = capacidadDeCarga;
        this.cargaActual = cargaActual;
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

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void AñadirCarga(){
        Scanner entrada = new Scanner(System.in);
        int argregarCarga = entrada.nextInt();

        if (argregarCarga + cargaActual > capacidadDeCarga){
            System.out.println("El peso exederia el maximo no se puede agregar");
        }else {
            System.out.println("Peso añadido");
            cargaActual = argregarCarga + cargaActual;
        }
    }
}
