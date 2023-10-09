package src.Deporte.Futbol;

import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Partido> listaPartidos;

    private HashSet<Equipo> listaEquipos;

    public Sistema(HashSet<Partido> listaPartidos, HashSet<Equipo> listaEquipos) {
        this.listaPartidos = listaPartidos;
        this.listaEquipos = listaEquipos;
    }

    public HashSet<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public HashSet<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(HashSet<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public void cargarGoles(Partido partido){
        for (Map.Entry<Jugador, Integer> jugador : partido.getGoles().entrySet()){
            if (jugador instanceof Portero){
                ((Portero) jugador).setAtajadas(((Portero) jugador).getAtajadas() + jugador.getValue());
                ((Portero) jugador).setPromAtajadas(((Portero) jugador).hacerPromedio());
            }
            else{
                ((JugadorDeCampo)jugador).setGoles(((JugadorDeCampo) jugador).getGoles() + jugador.getValue());
                ((JugadorDeCampo) jugador).setPromGoles(((JugadorDeCampo) jugador).hacerPromedio());
            }
        }
    }

    public void cargarAsistencias(Partido partido){
        for (Map.Entry<Jugador, Integer> jugador : partido.getGoles().entrySet()){
            if (jugador instanceof JugadorDeCampo){

                ((JugadorDeCampo)jugador).setAsistencias(((JugadorDeCampo) jugador).getAsistencias() + jugador.getValue());
            }
        }
    }

    public void modificarPartidos(Partido partido){
        if (partido.getGolLocal() > partido.getGolVisitante()){
            partido.getLocal().getPartidosJugados().put(partido, true);
            partido.getVisitante().getPartidosJugados().put(partido, false);
        }
        else {
            partido.getLocal().getPartidosJugados().put(partido, false);
            partido.getVisitante().getPartidosJugados().put(partido, true);
        }
    }

    public void jugarPartido(Partido partido){
        listaPartidos.add(partido);
        cargarGoles(partido);
        cargarAsistencias(partido);
        modificarPartidos(partido);
    }
}
