package src.Deporte.Futbol;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Jugador {

    private String nombre;
    private LocalDate nacimiento;
    private Provincias provincia;
    private int numeroCamiseta;
    private ArrayList<Equipo> historial;

    public Jugador(String nombre, LocalDate nacimiento, Provincias provincia, int numeroCamiseta, ArrayList<Equipo> historial) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.provincia = provincia;
        this.numeroCamiseta = numeroCamiseta;
        this.historial = historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public ArrayList<Equipo> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Equipo> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", provincia=" + provincia +
                ", numeroCamiseta=" + numeroCamiseta +
                ", historial=" + historial +
                '}';
    }

}
