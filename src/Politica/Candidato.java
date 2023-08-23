package src.Politica;

import src.Lugares.Provincia;
import src.Personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Candidato extends Persona {
    private HashMap<TemasPropuestas, HashSet<String>> propuestas;
    private NombrePartido partidoPolitico;
    private HashMap<Provincia, Integer> votosXProvincia;

    public Candidato(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, HashMap<TemasPropuestas, HashSet<String>> propuestas, NombrePartido partidoPolitico, HashMap<Provincia, Integer> votosXProvincia) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.propuestas = propuestas;
        this.partidoPolitico = partidoPolitico;
        this.votosXProvincia = votosXProvincia;
    }

    public HashMap<Provincia, Integer> getVotosXProvincia() {
        return votosXProvincia;
    }

    public void setVotosXProvincia(HashMap<Provincia, Integer> votosXProvincia) {
        this.votosXProvincia = votosXProvincia;
    }

    public HashMap<TemasPropuestas, HashSet<String>> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<TemasPropuestas, HashSet<String>> propuestas) {
        this.propuestas = propuestas;
    }

    public NombrePartido getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(NombrePartido partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
}
