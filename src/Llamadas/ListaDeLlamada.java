package src.Llamadas;

import src.Personas.Empleado;

import java.util.HashSet;

public class ListaDeLlamada {

    private HashSet<Llamada> listaDeLlamada;
    private HashSet<Empleado> listaDeEmpleados;

    public ListaDeLlamada(HashSet<Llamada> listaDeLlamada) {
        this.listaDeLlamada = listaDeLlamada;
    }

    public HashSet<Llamada> getListaDeLlamada() {
        return listaDeLlamada;
    }

    public void setListaDeLlamada(HashSet<Llamada> listaDeLlamada) {
        this.listaDeLlamada = listaDeLlamada;
    }

    public void hacerLlamada(Llamada llamada){
        listaDeLlamada.add(llamada);
        listaDeEmpleados.add(llamada.getEmpleadoOrigen());
        listaDeEmpleados.add(llamada.getEmpleadoDestino());
    }


    public int sumaDeLlamadas(Empleado empleado){
        int duracionTotal = 0;
        for (Llamada llamada: listaDeLlamada){
            if (llamada.getEmpleadoOrigen() == empleado ){
                duracionTotal = duracionTotal + llamada.getDuracionDeLlamada();
            }
        }
        return duracionTotal;
    }

    public Integer duracionTotal(Empleado empleado){
        int duraciones = 0;

        for ( Llamada lista : listaDeLlamada ){
            if (lista.getEmpleadoOrigen().equals(empleado)){
                duraciones += lista.getDuracionDeLlamada();
            }
        }
        return duraciones;
    }
    public void rankingLlamadas(){

        Empleado primero = new Empleado();
        Empleado segundo = new Empleado();
        Empleado tercero = new Empleado();

        for ( Empleado listaEmpleado : listaDeEmpleados ) {
            for (Llamada lista : listaDeLlamada) {
                if (duracionTotal(listaEmpleado) > duracionTotal(primero)){
                    primero = lista.getEmpleadoOrigen();
                }
                else if(duracionTotal(listaEmpleado) > duracionTotal(segundo)){
                    segundo = lista.getEmpleadoOrigen();
                }
                else if (duracionTotal(listaEmpleado) > duracionTotal(tercero)){
                    tercero = lista.getEmpleadoOrigen();
                }
            }
        }
    }
}
