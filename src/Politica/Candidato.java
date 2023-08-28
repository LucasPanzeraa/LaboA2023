package src.Politica;

import src.Lugares.Provincias;
import src.Personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Candidato extends Persona {
    private HashMap<TemasPropuestas, HashSet<String>> propuestas;
    private NombrePartido partidoPolitico;
    private HashMap<Provincias, Integer> votosXProvincia;


    public Candidato(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, HashMap<TemasPropuestas, HashSet<String>> propuestas, NombrePartido partidoPolitico) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.propuestas = propuestas;
        this.partidoPolitico = partidoPolitico;
        this.votosXProvincia = votos0();
    }

    public Candidato() {
        super("nombre", "apellido", 235324545, LocalDate.now());
        propuestas = new HashMap<>();
        partidoPolitico = NombrePartido.JUNTOSPORELPOLI;
        this.votosXProvincia = votos0();
    }

    public HashMap<Provincias, Integer> getVotosXProvincia() {
        return votosXProvincia;
    }

    public void setVotosXProvincia(HashMap<Provincias, Integer> votosXProvincia) {
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

    public HashMap<Provincias, Integer> votos0(){

        HashMap<Provincias, Integer> votoXProvincia = new HashMap<>();
        for (Provincias provincia : Provincias.values()){
            votoXProvincia.put(provincia, 0);
        }
        return votoXProvincia;
    }

    public int votosTotales(Candidato candidato){
        int votos = 0;

        for (Map.Entry<Provincias, Integer> lista : candidato.votosXProvincia.entrySet()) {
            votos = votos + lista.getValue();
        }

        return votos;
    }
}
