package src.Vehiculos;

import java.util.ArrayList;
import java.util.Date;

public class Coche extends Vehiculo{

    private String patente;
    private boolean descapotable;
    private int velocidad;

    public Coche(ArrayList<Vehiculo> listaDeVehiculo, String modelo, String marca, String color, int cantidadDeRuedas, Date añoDeFabricacion, String patente, boolean descapotable, int velocidad) {
        super(listaDeVehiculo, modelo, marca, color, cantidadDeRuedas, añoDeFabricacion);
        this.patente = patente;
        this.descapotable = descapotable;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }



    public int acelerar()
    {
        return velocidad + 1;
    }

    public int frenar()
    {
        return velocidad -1;
    }

    public void mostrarVelocidad(int velocidad)
    {
        System.out.println(velocidad);
    }



    public double porcentajeDescapotable(){

        int autosDescapotables = 0;
        int autosNoDescapotables = 0;
        double porcentajeDeDescapotables;

        for (Vehiculo autos: getListaDeVehiculo()) {

            if (autos instanceof Coche){
                if (((Coche) autos).descapotable){
                    autosDescapotables ++;
                }
                else {
                    autosNoDescapotables ++;
                }
            }
        }
        int totalAutos = autosDescapotables + autosNoDescapotables;
        porcentajeDeDescapotables = autosDescapotables * 100 / totalAutos;
        return porcentajeDeDescapotables;
    }
}
