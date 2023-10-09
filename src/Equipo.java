package src;

import java.util.HashSet;

public class Equipo {
    private String nombre;
    private HashSet<Jugador> jugadoresDelEquipo;
    private int partidosGanados;

    public Equipo(String nombre, HashSet<Jugador> jugadoresDelEquipo, int partidosGanados) {
        this.nombre = nombre;
        this.jugadoresDelEquipo = jugadoresDelEquipo;
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
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
