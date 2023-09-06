package src.Lugares;

import src.Lugares.Continente;
import src.Lugares.Lugares;

import java.util.HashSet;

public class SistemaLugares {

    HashSet <Lugares> listaDeLugares;

    public SistemaLugares(HashSet<Lugares> listaDeLugares) {
        this.listaDeLugares = listaDeLugares;
    }

    public HashSet<Lugares> getListaDeLugares() {
        return listaDeLugares;
    }

    public void setListaDeLugares(HashSet<Lugares> listaDeLugares) {
        this.listaDeLugares = listaDeLugares;
    }


    public void añadirLugar (Lugares lugar){
        listaDeLugares.add(lugar);
    }

    public void eliminarLugar (Lugares lugar){
        listaDeLugares.remove(lugar);
    }

    public void modificarLugar (Lugares lugarNuevo, Lugares lugarViejo){
        listaDeLugares.remove(lugarViejo);
        listaDeLugares.add(lugarNuevo);
    }

    public int poblacionPorCodigo (int codigo){
        int poblacion = 0;
        for ( Lugares lista : listaDeLugares ) {
            if (lista.getCódigo() == codigo){
                poblacion = lista.CantidadDePoblacion();

            }
        }

        return poblacion;
    }

    public Lugares contineneMasPersonas (){
        Lugares elegido = new Continente();
        int mayorPoblacion = 0;

        for ( Lugares lista : listaDeLugares ) {
            if (lista instanceof Continente){
                if (lista.CantidadDePoblacion() > mayorPoblacion){
                    mayorPoblacion = lista.CantidadDePoblacion();
                    elegido = lista;
                }
            }
        }
        return elegido;
    }

    public Lugares contineneMenosPersonas (){
        Lugares elegido = new Continente();
        int menorPoblacion = 0;
        boolean primero = false;

        for ( Lugares lista : listaDeLugares ) {
            if (lista instanceof Continente){
                if (primero = false || lista.CantidadDePoblacion() < menorPoblacion){
                    menorPoblacion = lista.CantidadDePoblacion();
                    elegido = lista;
                    primero = true;
                }
            }
        }
        return elegido;
    }
}
