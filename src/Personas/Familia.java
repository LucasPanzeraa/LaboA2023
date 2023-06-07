package src.Personas;

import java.util.ArrayList;
import java.util.HashSet;

public class Familia {

    HashSet<Familiar> listaDeFamiliares;

    public Familia(HashSet<Familiar> listaDeFamiliares) {
        this.listaDeFamiliares = listaDeFamiliares;
    }

    public HashSet<Familiar> getListaDeFamiliares() {
        return listaDeFamiliares;
    }

    public void setListaDeFamiliares(HashSet<Familiar> listaDeFamiliares) {
        this.listaDeFamiliares = listaDeFamiliares;
    }

    public int promedioDeCalorias(){
        int promedio = 0;
        int cantidadTotal = 0;

        for (Familiar lista : listaDeFamiliares) {
            cantidadTotal += lista.caloriasConsumidas();
        }
        return cantidadTotal / listaDeFamiliares.size();
    }

    public Familiar masGordito(){
        int masCalorias = 0;
        Familiar familiarGordito = new Familiar();

        for ( Familiar lista : listaDeFamiliares ) {
            if (lista.caloriasConsumidas() > masCalorias){
                masCalorias = lista.caloriasConsumidas();
                familiarGordito = lista;
            }
        }

        return familiarGordito;
    }

    public Familiar menosGordito(){
        int menosCalorias = 0;
        Familiar familiarFlaquito = new Familiar();
        boolean primero = false;

        for ( Familiar lista : listaDeFamiliares ){
            if (lista.caloriasConsumidas() < menosCalorias  primero == false){
                menosCalorias = lista.caloriasConsumidas();
                familiarFlaquito = lista;
            }
        }
        return familiarFlaquito;
    }
}
