package src.Lugares;

import java.util.HashSet;

public class Continente extends Lugares{

    private HashSet <Pais> listaDePaises;

    public Continente() {

        super("nombre", 1, new HashSet<>());
        listaDePaises = new HashSet<>();
    }

    public HashSet<Pais> getListaDePaises() {
        return listaDePaises;
    }

    public void setListaDePaises(HashSet<Pais> listaDePaises) {
        this.listaDePaises = listaDePaises;
    }

    @Override
    public int CantidadDePoblacion (){
        int poblacion = 0;

        for ( Pais lista : listaDePaises ) {
            poblacion += lista.CantidadDePoblacion();
        }

        return poblacion;
    }

    public Pais paisConMasPersonas(){
        int poblacionMayor = 0;
        Pais paisEleguido = new Pais();

        for ( Pais lista : listaDePaises ) {
            if (lista.CantidadDePoblacion() > poblacionMayor){
                poblacionMayor = lista.CantidadDePoblacion();
                paisEleguido = lista;
            }
        }

        return paisEleguido;
    }

    public Pais paisConMenosPersonas(){
        boolean primero = false;
        int poblacionMenor = 0;
        Pais paisEleguido = new Pais();

        for ( Pais lista : listaDePaises) {
            if (primero = false || lista.CantidadDePoblacion() < poblacionMenor ){
                poblacionMenor = lista.CantidadDePoblacion();
                paisEleguido = lista;
                primero = true;
            }
        }

        return paisEleguido;
    }
}
