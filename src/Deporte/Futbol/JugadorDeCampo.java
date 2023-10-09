package src.Deporte.Futbol;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.ArrayList;

public class JugadorDeCampo extends Jugador implements Contrato{

    private int tirosTotales;
    private double promGoles;
    private int goles;
    private int asistencias;

    public JugadorDeCampo(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, ArrayList<Equipo> historial, int tirosTotales, int goles, int asistencias) {
        super(nombre, nacimiento, provincia, numeroCamiseta, historial);
        this.tirosTotales = tirosTotales;
        this.goles = goles;
        this.asistencias = asistencias;
    }

    public void setTirosTotales(int tirosTotales) {
        this.tirosTotales = tirosTotales;
    }

    public int getTirosTotales() {
        return tirosTotales;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
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

    public void hacerPorcentaje(int cantidad){

    }

    @Override
    public void contratar (Equipo equipo) throws NoContrato{
        if (!getHistorial().contains(equipo) && promGoles > 30 && asistencias > 10) {
            getHistorial().add(equipo);
            equipo.getJugadoresDelEquipo().add(this);
            System.out.println(this + "se contrato en el " + equipo.getNombre());
        }
        else {
            throw new NoContrato("no cumple los requisitos para contratar");
        }
    }

    @Override
    public void renovar(Equipo equipo) throws NoRenovacion {
        if (!equipo.getJugadoresDelEquipo().contains(this) && getNacimiento().getYear() - 35 > 0) {
            equipo.getJugadoresDelEquipo().remove(this);
            throw new NoRenovacion("no cumple los requisitos para renovar");
        } else {
            getHistorial().add(equipo);
        }
    }

    @Override
    public double hacerPromedio() {
        double promedio = tirosTotales * 100 / goles;
        return promedio;
    }
}
