package src.Empresas;

import src.Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> listaDeVehiculo;


    public Empresa(ArrayList<Vehiculo> listaDeVehiculo) {

        this.listaDeVehiculo = listaDeVehiculo;
    }

    public ArrayList<Vehiculo> getListaDeVehiculo() {
        return listaDeVehiculo;
    }
    public void setListaDeVehiculo(ArrayList<Vehiculo> listaDeVehiculo) {
        this.listaDeVehiculo = listaDeVehiculo;
    }
}
