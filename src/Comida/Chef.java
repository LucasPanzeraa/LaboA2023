package src.Comida;

import src.Personas.Persona;

import java.util.HashSet;

public class Chef extends Persona{

    private HashSet<Restaurante> historialTrabajo;

    public Chef(String nombre, String apellido, int DNI, int edad, HashSet<Restaurante> historialTrabajo) {
        super(nombre, apellido, DNI, edad);
        this.historialTrabajo = historialTrabajo;
    }

    public HashSet<Restaurante> getHistorialTrabajo() {
        return historialTrabajo;
    }

    public void setHistorialTrabajo(HashSet<Restaurante> historialTrabajo) {
        this.historialTrabajo = historialTrabajo;
    }

}
