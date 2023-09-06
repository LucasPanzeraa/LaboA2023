package src.Empresa;

import src.Personas.Empleado;
import src.Vehiculos.Camioneta;
import src.Vehiculos.Coche;
import src.Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
    private ArrayList<Vehiculo> listaDeVehiculo;
    private HashSet<Empleado> listaDeEmpleados;


    public Empresa(HashSet<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }

    public Empresa(ArrayList<Vehiculo> listaDeVehiculo) {

        this.listaDeVehiculo = listaDeVehiculo;
    }

    public ArrayList<Vehiculo> getListaDeVehiculo() {
        return listaDeVehiculo;
    }
    public void setListaDeVehiculo(ArrayList<Vehiculo> listaDeVehiculo) {
        this.listaDeVehiculo = listaDeVehiculo;
    }

    public HashSet<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void setListaDeEmpleados(HashSet<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }

    public HashSet<Empleado> asistenciaAlta(int mes){
        HashSet<Empleado> asistenciaAlta = new HashSet<>();
        for (Empleado lista: asistenciaAlta) {
            if (lista.porcentajeAsistencia(mes) > 80){
                asistenciaAlta.add(lista);
            }
        }
        return asistenciaAlta;
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


    public double porcentajeDescapotable(){

        int autosDescapotables = 0;
        int autosNoDescapotables = 0;
        double porcentajeDeDescapotables;

        for (Vehiculo lista: getListaDeVehiculo()) {

            if (lista instanceof Coche){
                if (((Coche) lista).isDescapotable()){
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
