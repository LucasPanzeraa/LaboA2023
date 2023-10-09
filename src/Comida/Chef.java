package src.Comida;

import src.Personas.Persona;

import java.util.HashSet;

public class Chef extends Persona{

    private HashSet<IRestaurante> historialTrabajo;

    public Chef(String nombre, String apellido, int DNI, int edad, HashSet<IRestaurante> historialTrabajo) {
        super(nombre, apellido, DNI, edad);
        this.historialTrabajo = historialTrabajo;
    }

    public HashSet<IRestaurante> getHistorialTrabajo() {
        return historialTrabajo;
    }

    public void setHistorialTrabajo(HashSet<IRestaurante> historialTrabajo) {
        this.historialTrabajo = historialTrabajo;
    }

}
