package src.Deporte.Futbol;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Portero extends Jugador implements Contrato{

    private HashMap<Partido, Integer> atajadas;
    private double promAtajadas;
    private int golesRecibidos;

    public Portero(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, ArrayList<Equipo> historial, HashMap<Partido, Integer> atajadas, double promAtajadas, int golesRecibidos) {
        super(nombre, nacimiento, provincia, numeroCamiseta, historial);
        this.atajadas = atajadas;
        this.promAtajadas = promAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public void setAtajadas(HashMap<Partido, Integer> atajadas) {
        this.atajadas = atajadas;
    }

    public double getPromAtajadas() {
        return promAtajadas;
    }

    public void setPromAtajadas(double promAtajadas) {
        this.promAtajadas = promAtajadas;
    }

    public double getAtajadas() {
        return promAtajadas;
    }

    public void setAtajadas(double atajadas) {
        this.promAtajadas = atajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }


    @Override
    public void hacerPromedio(int cantidad) {

    }

    @Override
    public void contratar(Equipo equipo, Jugador jugador) throws NoContrato{
        if(!getHistorial().contains(equipo) && promAtajadas < 60 && golesRecibidos > 10){
            getHistorial().add(equipo);
            equipo.getJugadoresDelEquipo().add(jugador);
            System.out.println(this + "se contrato en el " + equipo);
        }
        else {
            throw new NoContrato("no cumple los requisitos para contratar");
        }

    }

    @Override
    public void renovar(Equipo equipo, Jugador jugador) throws NoRenovacion {
        if (!equipo.getJugadoresDelEquipo().contains(jugador) && getNacimiento().getYear() - 35 > 0) {
            equipo.getJugadoresDelEquipo().remove(jugador);
            throw new NoRenovacion("no cumple los requisitos para renovar");
        } else {
            getHistorial().add(equipo);
        }
    }
}
