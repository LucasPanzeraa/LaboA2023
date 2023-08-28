package src.Politica;

import src.Lugares.Provincias;
import src.Personas.Persona;

import java.time.LocalDate;

public class Votante extends Persona {
    private boolean votó;
    private static String nacionalidad = "Argentino";
    private Provincias provincia;

    public Votante(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, boolean votó, Provincias provincia) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.votó = votó;
        this.provincia = provincia;
    }

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public boolean isVotó() {
        return votó;
    }

    public void setVotó(boolean votó) {
        this.votó = votó;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }


    public void votar ( PartidoPolitico voto){

        if (!isVotó()){
            voto.getCandidato().getVotosXProvincia().put(getProvincia(), voto.getCandidato().getVotosXProvincia().get(getProvincia()) + 1);
            votó = true;
        }
    }
}
