package src;

import src.Personas.JugadoresCurling;


import java.util.ArrayList;

public class CurlingEquipo {

    ArrayList<JugadoresCurling> jugadores;
    ArrayList<Boolean>horarioMañana;
    ArrayList<Boolean>horarioMediodia;
    ArrayList<Boolean>horarioNoche;
    String nombre;
    String barrio;

    public CurlingEquipo(ArrayList<JugadoresCurling> jugadores, ArrayList<Boolean> horariosMañana, ArrayList<Boolean> horariosMediodia, ArrayList<Boolean> horariosNoche, String nombre, String barrio) {
        this.jugadores = jugadores;
        this.horarioMañana = horariosMañana;
        this.horarioMediodia = horariosMediodia;
        this.horarioNoche = horariosNoche;
        this.nombre = nombre;
        this.barrio = barrio;
    }

    public ArrayList<JugadoresCurling> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadoresCurling> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Boolean> getHorariosMañana() {
        return horarioMañana;
    }

    public void setHorariosMañana(ArrayList<Boolean> horariosMañana) {
        this.horarioMañana = horariosMañana;
    }

    public ArrayList<Boolean> getHorariosMediodia() {
        return horarioMediodia;
    }

    public void setHorariosMediodia(ArrayList<Boolean> horariosMediodia) {
        this.horarioMediodia = horariosMediodia;
    }

    public ArrayList<Boolean> getHorariosNoche() {
        return horarioNoche;
    }

    public void setHorariosNoche(ArrayList<Boolean> horariosNoche) {
        this.horarioNoche = horariosNoche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
