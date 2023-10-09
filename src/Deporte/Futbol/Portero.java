package src.Deporte.Futbol;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.ArrayList;

public class Portero extends Jugador implements Contrato{

    private int tiros;
    private int atajadas;
    private double promAtajadas;
    private int golesRecibidos;

    public Portero(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, ArrayList<Equipo> historial, int tiros, int atajadas, double promAtajadas, int golesRecibidos) {
        super(nombre, nacimiento, provincia, numeroCamiseta, historial);
        this.tiros = tiros;
        this.atajadas = atajadas;
        this.promAtajadas = hacerPromedio();
        this.golesRecibidos = golesRecibidos;
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public void setAtajadas(int atajadas) {
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
    public double hacerPromedio() {
        double promedio = tiros * 100 / atajadas;
        return promedio;
    }

    @Override
    public void contratar(Equipo equipo) throws NoContrato{
        if(!getHistorial().contains(equipo) && promAtajadas < 60 && golesRecibidos > 10){
            getHistorial().add(equipo);
            equipo.getJugadoresDelEquipo().add(this);
            System.out.println(this + "se contrato en el " + equipo);
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
}
