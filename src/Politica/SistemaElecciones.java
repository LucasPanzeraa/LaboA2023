package src.Politica;

import src.Lugares.Provincias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaElecciones {
    private HashSet<Votante>listaDeVotantes;
    private HashSet<PartidoPolitico> listaDePartidosPoliticos;


    public SistemaElecciones(HashSet<Votante> listaDeVotantes, HashSet<PartidoPolitico> listaDePartidosPoliticos) {
        this.listaDeVotantes = listaDeVotantes;
        this.listaDePartidosPoliticos = listaDePartidosPoliticos;
    }

    public HashSet<Votante> getListaDeVotantes() {
        return listaDeVotantes;
    }

    public void setListaDeVotantes(HashSet<Votante> listaDeVotantes) {
        this.listaDeVotantes = listaDeVotantes;
    }

    public HashSet<PartidoPolitico> getListaDePartidosPoliticos() {
        return listaDePartidosPoliticos;
    }

    public void setListaDePartidosPoliticos(HashSet<PartidoPolitico> listaDePartidosPoliticos) {
        this.listaDePartidosPoliticos = listaDePartidosPoliticos;
    }

    public int personasVotaron() {
        int votaron = 0;

        for (Votante votante : listaDeVotantes) {
            if (votante.isVotó()) {
                votaron ++;
            }
        }
        return votaron;
    }

    public void porcentaejeXCandidato (){
        SistemaElecciones sistema = new SistemaElecciones(listaDeVotantes, listaDePartidosPoliticos);
        for (PartidoPolitico partidoPolitico : listaDePartidosPoliticos){

                int votosTotales = partidoPolitico.getCandidato().votosTotales(partidoPolitico.getCandidato());
                int porcentaje = votosTotales * 100 / sistema.personasVotaron();

                System.out.println(partidoPolitico.getCandidato().getApellido() + ": ");
                System.out.println("votos totales: " + votosTotales);
                System.out.println("porcentaje: " + porcentaje);
                System.out.println(" ");
        }
    }


    public Candidato candidatoGanador (){
        Candidato candidatoGanador = new Candidato();
        boolean primero = true;

        for (PartidoPolitico partidoPolitico: listaDePartidosPoliticos){
            if (primero || partidoPolitico.getCandidato().votosTotales(partidoPolitico.getCandidato()) > candidatoGanador.votosTotales(candidatoGanador)){
                candidatoGanador = partidoPolitico.getCandidato();
                primero = false;
            }
        }
        return candidatoGanador;
    }



    public Integer personasNoVotaron (){
        int noVotaron = 0;
        for (Votante votante : listaDeVotantes){
            if (!votante.isVotó()) {
                noVotaron ++;
            }
        }
        return noVotaron;
    }


    public static void main(String[] args) {
        SistemaElecciones sistema = new SistemaElecciones(new HashSet<>(), new HashSet<>());

        HashMap<TemasPropuestas, HashSet<String>> propuestas = new HashMap<>();
        HashMap<TemasPropuestas, HashSet<String>> propuestas2 = new HashMap<>();

        Candidato candidato1 = new Candidato("Ian", "Brandon", 47232443, LocalDate.now(), propuestas2, NombrePartido.JUNTOSPORELPOLI);
        Candidato candidato2 = new Candidato("Lucas", "Panzera", 47234833, LocalDate.now(), propuestas, NombrePartido.ELPOLIAVANZA);

        PartidoPolitico partidoPolitico1 = new PartidoPolitico(candidato2);
        PartidoPolitico partidoPolitico2 = new PartidoPolitico(candidato1);

        Votante votante1 = new Votante("Ciro", "Cetutti", 47896543, LocalDate.now(), false, Provincias.BUENOSAIRES);
        Votante votante2 = new Votante("Juan", "Sampieri", 47234534, LocalDate.now(), false, Provincias.CHACO);
        Votante votante3 = new Votante("Tiago", "Carone", 47263434, LocalDate.now(), false, Provincias.CATAMARCA );
        Votante votante4 = new Votante("Ian", "Bupha", 47236443, LocalDate.now(), false, Provincias.BUENOSAIRES);

        votante1.votar(partidoPolitico1);
        votante2.votar(partidoPolitico1);
        votante3.votar(partidoPolitico2);

        sistema.listaDeVotantes.add(votante1);
        sistema.listaDeVotantes.add(votante2);
        sistema.listaDeVotantes.add(votante3);
        sistema.listaDeVotantes.add(votante4);

        sistema.listaDePartidosPoliticos.add(partidoPolitico1);
        sistema.listaDePartidosPoliticos.add(partidoPolitico2);

        sistema.porcentaejeXCandidato();

        int noVotaron = sistema.personasNoVotaron();
        System.out.println(noVotaron + " personas no votaron");

        Candidato candidatoGandor = sistema.candidatoGanador();
        System.out.println("el nuevo presidente sera " + candidatoGandor.getApellido());
    }
}
