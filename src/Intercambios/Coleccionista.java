package src.Intercambios;

import src.Personas.Persona;

import java.util.HashSet;

public class Coleccionista extends Persona {
    private HashSet<Prestable> listaDePrestables;

    public Coleccionista(String nombre, HashSet<Prestable> listaDePrestables) {
        super(nombre);
        this.listaDePrestables = listaDePrestables;
    }

    public HashSet<Prestable> getListaDePrestables() {
        return listaDePrestables;
    }

    public void setListaDePrestables(HashSet<Prestable> listaDePrestables) {
        this.listaDePrestables = listaDePrestables;
    }


    public boolean verificarElemento(Prestable prestable) {
        if (listaDePrestables.contains(prestable)){
            return true;
        }
        else {
            return false;
        }
    }
}
