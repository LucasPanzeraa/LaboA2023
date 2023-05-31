package src.Empresas;

import src.Personas.Empleado;
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
}
