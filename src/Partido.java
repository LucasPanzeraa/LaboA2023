package src;

import java.util.HashMap;
import java.util.HashSet;

public class Partido {

    private String Local;
    private int golLocal;
    private String Visitante;
    private int golVisitante;
    private HashMap<Jugador,Integer> goles;
    private HashMap<Jugador,Integer> asistencia;

    public Partido(String local, int golLocal, String visitante, int golVisitante, HashMap<Jugador, Integer> goles, HashMap<Jugador, Integer> asistencia) {
        Local = local;
        this.golLocal = golLocal;
        Visitante = visitante;
        this.golVisitante = golVisitante;
        this.goles = goles;
        this.asistencia = asistencia;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public String getVisitante() {
        return Visitante;
    }

    public void setVisitante(String visitante) {
        Visitante = visitante;
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
