package src.Politica;

import src.Lugares.Provincia;
import src.Personas.Persona;

import java.time.LocalDate;

public class Votante extends Persona {
    private boolean votó;
    private static String nacionalidad = "Argentino";
    private Provincia provincia;

    public Votante(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, boolean votó, Provincia provincia) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.votó = votó;
        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
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
}
