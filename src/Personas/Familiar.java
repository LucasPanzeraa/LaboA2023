package src.Personas;

import src.Comida.Plato;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Familiar extends Persona{

    ArrayList<Plato> listaDePlatos;

    public Familiar() {
        super("nombre", "apellido", LocalDate.of(1900,05,10));
        this.listaDePlatos = listaDePlatos;
    }

    public ArrayList<Plato> getListaDePlatos() {
        return listaDePlatos;
    }

    public void setListaDePlatos(ArrayList<Plato> listaDePlatos) {
        this.listaDePlatos = listaDePlatos;
    }

    public Integer caloriasConsumidas(){

        int cantidadTotal = 0;
        for (Plato lista : listaDePlatos) {
            cantidadTotal += lista.getCalorias();
        }
        return cantidadTotal;
    }
}

