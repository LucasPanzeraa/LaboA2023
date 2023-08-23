package src.Politica;

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


    public void votar (Votante votante, PartidoPolitico voto){


    }
}
