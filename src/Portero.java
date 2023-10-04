package src;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.HashSet;

public class Portero extends Jugador implements Contrato{

    private double promAtajadas;
    private int golesRecibidos;

    public Portero(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, HashSet<Equipo> historial, double promAtajadas, int golesRecibidos) {
        super(nombre, nacimiento, provincia, numeroCamiseta, historial);
        this.promAtajadas = promAtajadas;
        this.golesRecibidos = golesRecibidos;
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
    public void contratar(Equipo equipo) {
        if(!getHistorial().contains(equipo) && promAtajadas < 60 && golesRecibidos > 10){
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
