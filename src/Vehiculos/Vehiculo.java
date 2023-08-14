package src.Vehiculos;

import java.util.Date;

public class Vehiculo {

    private String modelo;
    private String marca;
    private String color;
    private int cantidadDeRuedas;
    private Date añoDeFabricacion;

    public Vehiculo(String modelo, String marca, String color, int cantidadDeRuedas, Date añoDeFabricacion) {
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
}
