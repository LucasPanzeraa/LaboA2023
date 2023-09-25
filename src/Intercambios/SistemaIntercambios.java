package src.Intercambios;

import java.util.HashSet;

public class SistemaIntercambios {

    private HashSet<Prestable>listaPrestables;

    public SistemaIntercambios(HashSet<Prestable> listaPrestables) {
        this.listaPrestables = listaPrestables;
    }

    public HashSet<Prestable> getListaPrestables() {
        return listaPrestables;
    }

    public void setListaPrestables(HashSet<Prestable> listaPrestables) {
        this.listaPrestables = listaPrestables;
    }

    public void agregarElemento(Prestable prestable){
        if(prestable.agregarElemento()){
            getListaPrestables().add(prestable);
        }
    }
}
