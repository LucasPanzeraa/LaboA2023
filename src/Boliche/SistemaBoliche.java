package src.Boliche;

import src.ManejoDeExcepciones.BebidaDisponibleExcepcion;
import src.ManejoDeExcepciones.DNIsDistintos;
import src.ManejoDeExcepciones.PersonasExistentesExeption;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaBoliche {

    private HashSet<Boracho> listaDeClientes;
    private HashSet<Bebida> listaDeBebidas;

    public SistemaBoliche(HashSet<Boracho> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public HashSet<Boracho> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(HashSet<Boracho> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public Boracho mejorCeof(){
        try {
            if (listaDeClientes != null) {
                Boracho mayorCoef = new Boracho("nombre", "apellido", 1, new HashMap<>());
                boolean primero = true;

                for (Boracho boracho : listaDeClientes) {
                    if (primero || boracho.coefTotal() > mayorCoef.coefTotal()) {
                        mayorCoef = boracho;
                        primero = false;
                    }
                }
                return mayorCoef;
            }
            else {
                throw new PersonasExistentesExeption("No hay personas registradas");
            }
        }
        catch (PersonasExistentesExeption e) {
        throw new RuntimeException(e);
    }
    }

    public Boracho menorCoef(){
        try {
            if (listaDeClientes != null){
                Boracho menorCoef = new Boracho("nombre", "apellido", 1, new HashMap<>());
                boolean primero = true;

                for (Boracho boracho : listaDeClientes) {
                    if (primero || boracho.coefTotal() < menorCoef.coefTotal()) {
                        menorCoef = boracho;
                        primero = false;
                    }
                }
                return menorCoef;
            }
            else {
                throw new PersonasExistentesExeption("No hay personas registradas");
            }
        } catch (PersonasExistentesExeption e) {
            throw new RuntimeException(e);
        }
    }

    public void bebidaElegida(Bebida bebida, int cantidad, Boracho cliente){

        try {
            if (listaDeBebidas.contains(bebida) && cantidad < bebida.getStock()) {
                cliente.getListaDeBebidas().put(bebida, cantidad);
            }
            else {
                throw new BebidaDisponibleExcepcion("bebida no dispo bro");
            }
        } catch (BebidaDisponibleExcepcion e) {
            System.out.println(e);
        }
    }

    public void agregarCliente(Boracho boracho){

        try {
            for (Boracho boracho1 : listaDeClientes){
                if (boracho1.getDNI() == boracho.getDNI()){
                    throw new DNIsDistintos("Los DNI no pueden ser iguales");
                }
            }
            listaDeClientes.add(boracho);

        } catch (DNIsDistintos e) {
            System.out.println(e);
        }
    }
}
