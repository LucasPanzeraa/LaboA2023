import java.sql.Time;
import java.util.ArrayList;

public class CurlingEquipo {

    ArrayList<JugadoresCurling> jugadores;
    ArrayList<Time>horariosMañana;
    ArrayList<Time>horariosMediodia;
    ArrayList<Time>horariosNoche;
    String nombre;
    String barrio;

    public CurlingEquipo(ArrayList<JugadoresCurling> jugadores, ArrayList<Time> horariosMañana, ArrayList<Time> horariosMediodia, ArrayList<Time> horariosNoche, String nombre, String barrio) {
        this.jugadores = jugadores;
        this.horariosMañana = horariosMañana;
        this.horariosMediodia = horariosMediodia;
        this.horariosNoche = horariosNoche;
        this.nombre = nombre;
        this.barrio = barrio;
    }

    public ArrayList<JugadoresCurling> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadoresCurling> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Time> getHorariosMañana() {
        return horariosMañana;
    }

    public void setHorariosMañana(ArrayList<Time> horariosMañana) {
        this.horariosMañana = horariosMañana;
    }

    public ArrayList<Time> getHorariosMediodia() {
        return horariosMediodia;
    }

    public void setHorariosMediodia(ArrayList<Time> horariosMediodia) {
        this.horariosMediodia = horariosMediodia;
    }

    public ArrayList<Time> getHorariosNoche() {
        return horariosNoche;
    }

    public void setHorariosNoche(ArrayList<Time> horariosNoche) {
        this.horariosNoche = horariosNoche;
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
