package src.Llamadas;

import src.Personas.Empleado;

import java.util.ArrayList;

public class ListaDeLlamada {

    private ArrayList<Llamada>listaDeLlamada;

    public ListaDeLlamada(ArrayList<Llamada> listaDeLlamada) {
        this.listaDeLlamada = listaDeLlamada;
    }

    public ArrayList<Llamada> getListaDeLlamada() {
        return listaDeLlamada;
    }

    public void setListaDeLlamada(ArrayList<Llamada> listaDeLlamada) {
        this.listaDeLlamada = listaDeLlamada;
    }


    public int sumaDeLlamadas(Empleado empleado){
        int duracionTotal = 0;
        for (Llamada llamada: listaDeLlamada){
            if (llamada.getEmpleadoOrigen() == empleado ){
                duracionTotal = duracionTotal + llamada.duracionDeLlamada;
            }
        }
        return duracionTotal;
    }

    public void rankingLlamadas(){
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        Empleado primero;
        Empleado segundo;
        Empleado tercero;

        for (Llamada llamada : listaDeLlamada) {

        }
    }

    public static void main(String[] args) {

    }
}
