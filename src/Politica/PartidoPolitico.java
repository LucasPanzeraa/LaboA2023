package src.Politica;

public class PartidoPolitico {

    private NombrePartido Nombre;
    private Candidato candidato;

    public PartidoPolitico(NombrePartido nombre, Candidato candidato) {
        Nombre = nombre;
        this.candidato = candidato;
    }

    public NombrePartido getNombre() {
        return Nombre;
    }

    public void setNombre(NombrePartido nombre) {
        Nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
