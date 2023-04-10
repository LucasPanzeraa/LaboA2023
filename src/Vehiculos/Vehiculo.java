package src.Vehiculos;

import src.Empresas.Empresa;

import java.util.ArrayList;
import java.util.Date;

public class Vehiculo extends Empresa {

    private String modelo;
    private String marca;
    private String color;
    private int cantidadDeRuedas;
    private Date añoDeFabricacion;

    public Vehiculo(ArrayList<Vehiculo> listaDeVehiculo, String modelo, String marca, String color, int cantidadDeRuedas, Date añoDeFabricacion) {
        super(listaDeVehiculo);
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public Date getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(Date añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }



    public String MayorCantidad() {

        String mayorCantidad;
        int cantidadAutos = 0;
        int cantidadCamiones = 0;
        for (int i = 0; i < getListaDeVehiculo().size(); i ++){

            if (getListaDeVehiculo().get(i) instanceof Coche){
                cantidadAutos ++;
            } else if (getListaDeVehiculo().get(i) instanceof Camioneta){
                cantidadCamiones ++;
            }
        }
        if (cantidadAutos > cantidadCamiones){
            mayorCantidad = "Hay más autos";
        }else{
            mayorCantidad = "Hay más camiones";
        }
        return mayorCantidad;
    }



}
