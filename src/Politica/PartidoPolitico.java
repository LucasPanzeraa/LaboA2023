package src.Politica;

public class PartidoPolitico {

    private NombrePartido nombre;
    private Candidato candidato;

    public PartidoPolitico( Candidato candidato) {
        this.nombre = candidato.getPartidoPolitico();
        this.candidato = candidato;
    }


    public PartidoPolitico() {
        nombre = NombrePartido.ELPOLIAVANZA;
        candidato = new Candidato();
    }

    public NombrePartido getNombre() {
        return nombre;
    }

    public void setNombre(NombrePartido nombre) {
        nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
