package src;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.HashSet;

public class Defensores extends Jugador implements Contrato {

    private double promGoles;
    private int asistencias;

    public Defensores(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, HashSet<Equipo> historial, double promGoles, int asistencias) {
        super(nombre, nacimiento, provincia, numeroCamiseta, historial);
        this.promGoles = promGoles;
        this.asistencias = asistencias;
    }

    public double getPromGoles() {
        return promGoles;
    }

    public void setPromGoles(double promGoles) {
        this.promGoles = promGoles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }


    @Override
    public void contratar(Equipo equipo) {
        if (!getHistorial().contains(equipo) && promGoles > 30 && asistencias > 10) {
            getHistorial().add(equipo);
            System.out.println("El " + getNombre() + toString() + "se contrato en el " + equipo);
        }
    }


    @Override
    public void renovar(Equipo equipo) throws NoRenovacion {
        if (!getHistorial().contains(equipo) && getNacimiento().getYear() - 35 > 0) {
            throw new NoRenovacion("no se pudo renovar");
        } else {
            getHistorial().add(equipo);
        }
    }
}
