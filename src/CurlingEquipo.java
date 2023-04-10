package src;

import src.Personas.JugadoresCurling;


import java.util.ArrayList;
import java.util.Scanner;

public class CurlingEquipo {

    public  ArrayList<Boolean> horarioMañana;
    public ArrayList<Boolean> horarioMediodia;
    public ArrayList<Boolean> horarioNoche;
    private ArrayList<JugadoresCurling> jugadores;
    private String nombre;
    private String barrio;

    public CurlingEquipo(ArrayList<JugadoresCurling> jugadores, String nombre, String barrio) {
        this.jugadores = jugadores;
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

    public boolean VerificarNumero(JugadoresCurling jugador1){

        boolean repetido = false;
        for (JugadoresCurling jugador:jugadores) {

            if (jugador1.getNumeroDeCamiseta() == jugador.getNumeroDeCamiseta()){
                return repetido = true;
            }
            repetido = false;
        }
        return repetido;
    }

    public void AgregarJugador(JugadoresCurling jugador){
        jugadores.add(jugador);
        if (VerificarNumero(jugador)){
            System.out.println("No se puede agregar el jugador con ese numero");

        } else if (jugadores.size() == 10) {
            System.out.println("No se puede agregar el jugador porque el equipo esta lleno");
        }
    }

    public void EliminarJugador(JugadoresCurling jugador){

        jugadores.remove(jugador);
        if (jugador.isCapitan() == true){
            System.out.println("Eliga un nuevo capitan");
            Scanner entrada = new Scanner(System.in);
            String nombreJugador;
            nombreJugador = entrada.next();
            for (int i = 0;i < jugadores.size(); i ++){
                if (jugadores.get(i).getNombre() == nombreJugador){
                    jugadores.get(i).setCapitan(true);
                }
            }
        }
    }
}
