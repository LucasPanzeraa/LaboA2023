package src.Deporte.Futbol;

import java.util.HashMap;
import java.util.HashSet;

public class Equipo {
    private String nombre;
    private HashSet<Jugador> jugadoresDelEquipo;
    private HashMap<Partido, Boolean> partidosJugados;

    public Equipo(String nombre, HashSet<Jugador> jugadoresDelEquipo, HashMap<Partido, Boolean> partidosJugados) {
        this.nombre = nombre;
        this.jugadoresDelEquipo = jugadoresDelEquipo;
        this.partidosJugados = partidosJugados;
    }

    public HashMap<Partido, Boolean> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(HashMap<Partido, Boolean> partidosJugados) {
        this.partidosJugados = partidosJugados;
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
