package src;

import java.util.HashSet;

public class Equipo {
    private String nombre;
    private HashSet<Jugador> jugadoresDelEquipo;

    public Equipo(String nombre, HashSet<Jugador> jugadoresDelEquipo) {
        this.nombre = nombre;
        this.jugadoresDelEquipo = jugadoresDelEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getJugadoresDelEquipo() {
        return jugadoresDelEquipo;
    }

    public void setJugadoresDelEquipo(HashSet<Jugador> jugadoresDelEquipo) {
        this.jugadoresDelEquipo = jugadoresDelEquipo;
    }
}
