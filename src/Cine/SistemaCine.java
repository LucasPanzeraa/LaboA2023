package src.Cine;

import src.Personas.Espectador;

import java.util.HashSet;

public class SistemaCine {
    private HashSet<Funcion> listaDeFunciones;
    private HashSet<Espectador> listaDePersonas;

    public void cantidaDeUsuario(){
        System.out.println(Espectador.getContador());
    }

    public void cantidaDePeliculas(){
        System.out.println(Pelicula.getContador());
    }

    public void agregarFuncion(){

    }
}
