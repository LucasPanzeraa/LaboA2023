package src.Personas;

import src.Fechas.Fecha;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonaPesoAltura extends Persona{

    private HashMap <Fecha, Integer > fechaPeso;
    private HashMap <Fecha, Integer >fechaAltura;
    public PersonaPesoAltura(String nombre, String apellido, int edad, LocalDate fechaDeNacimiento) {
        super(nombre, apellido, edad, fechaDeNacimiento);
    }

    public void pesoYFecha (Fecha fecha){

        System.out.println(fechaPeso.get(fecha));
        System.out.println(fechaAltura.get(fecha));

    }


    public int  promedioDePeso(int año){

        int peso = 0;

        int contadorPeso = 0;


        for(Map.Entry <Fecha, Integer> entrada: fechaPeso.entrySet() ){
            if ((año == (entrada.getKey().getAnio()) )){
                peso = peso + entrada.getValue();
                contadorPeso ++;
            }
        }
        return peso / contadorPeso;
    }

    public int promedioDeAltura(int año){
        int altura = 0;
        int contadorAltura = 0;

        for(Map.Entry <Fecha, Integer> entrada: fechaAltura.entrySet() ) {
            if (año == (entrada.getKey().getAnio())) {
                altura = altura + entrada.getValue();
                contadorAltura ++;
            }
        }
        return altura / contadorAltura;
    }

    public void diferenciaDeAltura (int año, int añoAComparar){

        double mayorAltura = 0;
        double menorAltura = 1000;

        for(Map.Entry <Fecha, Integer> entrada: fechaAltura.entrySet() ) {
            if (año == (entrada.getKey().getAnio())) {
                if (entrada.getValue() > mayorAltura){
                    mayorAltura = entrada.getValue();

                } else if (entrada.getValue() <menorAltura) {
                    menorAltura = entrada.getValue();
                }
            }

        }

    }
}
