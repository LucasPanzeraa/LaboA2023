package src.Deporte.Futbol;

import java.util.HashMap;

public class Partido {

    private Equipo Local;
    private int golLocal;
    private Equipo Visitante;
    private int golVisitante;
    private HashMap<Jugador,Integer> goles;
    private HashMap<Jugador,Integer> asistencia;

    public Partido(Equipo local, int golLocal, Equipo visitante, int golVisitante, HashMap<Jugador, Integer> goles, HashMap<Jugador, Integer> asistencia) {
        Local = local;
        this.golLocal = golLocal;
        Visitante = visitante;
        this.golVisitante = golVisitante;
        this.goles = goles;
        this.asistencia = asistencia;
    }

    public Equipo getVisitante() {
        return Visitante;
    }

    public Equipo getLocal() {
        return Local;
    }

    public void setLocal(Equipo local) {
        Local = local;
    }

    public void setVisitante(Equipo visitante) {
        Visitante = visitante;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public HashMap<Jugador, Integer> getGoles() {
        return goles;
    }

    public void setGoles(HashMap<Jugador, Integer> goles) {
        this.goles = goles;
    }

    public HashMap<Jugador, Integer> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashMap<Jugador, Integer> asistencia) {
        this.asistencia = asistencia;
    }
}
