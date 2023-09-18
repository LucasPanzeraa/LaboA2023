package src.Boliche;

import src.Personas.Persona;

import java.util.HashMap;
import java.util.Map;

public class Boracho extends Persona {

    private HashMap<Bebida, Integer> listaDeBebidas;

    public Boracho(String nombre, String apellido, int DNI, HashMap<Bebida, Integer> listaDeBebidas) {
        super(nombre, apellido, DNI);
        this.listaDeBebidas = listaDeBebidas;
    }

    public HashMap<Bebida, Integer> getListaDeBebidas() {
        return listaDeBebidas;
    }

    public void setListaDeBebidas(HashMap<Bebida, Integer> listaDeBebidas) {
        this.listaDeBebidas = listaDeBebidas;
    }

    public void coeficionteDeHidratacion() {
        int coefTotal = 0;

        for (Map.Entry<Bebida, Integer> bebida : listaDeBebidas.entrySet()) {
            System.out.println("Coeficiente resultante para " + bebida.getValue() + " " + bebida.getKey().getNombre() + " = " + (bebida.getKey().getCoeficienteDePositividad() - bebida.getKey().getCoeficientedDeNegatividad()) * bebida.getValue());
            coefTotal += (bebida.getKey().getCoeficienteDePositividad() - bebida.getKey().getCoeficientedDeNegatividad()) * bebida.getValue();
        }
        System.out.println("El coeficiente total es de: " + coefTotal);
    }

    public int coefTotal(){
        int coefTotal = 0;

        for (Map.Entry<Bebida, Integer> bebida : listaDeBebidas.entrySet()) {
            coefTotal += (bebida.getKey().getCoeficienteDePositividad() - bebida.getKey().getCoeficientedDeNegatividad()) * bebida.getValue();
        }

        return coefTotal;
    }
}