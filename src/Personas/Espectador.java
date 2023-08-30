package src.Personas;

import src.Cine.Funcion;

import java.time.LocalDate;
import java.util.HashSet;

public class Espectador extends Persona{
    private static int contador = 0;
    private int id;
    private String mail;
    private HashSet<Funcion> historialDeFunciones;


    public Espectador(String nombre, String apellido, LocalDate fechaDeNacimiento, String mail, HashSet<Funcion> historialDeFunciones) {
        super(nombre, apellido, fechaDeNacimiento);
        contador ++;
        id = contador;
        this.mail = mail;
        this.historialDeFunciones = historialDeFunciones;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Espectador.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Funcion> getHistorialDeFunciones() {
        return historialDeFunciones;
    }

    public void setHistorialDeFunciones(HashSet<Funcion> historialDeFunciones) {
        this.historialDeFunciones = historialDeFunciones;
    }
}
