package src.Personas;

import src.Fechas.Dia;
import src.Politica.Mensajeros;
import src.Politica.NombrePartido;
import src.Politica.PartidoPolitico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Trabajador extends Persona implements Mensajeros {
    private int cuil;
    private int sueldo;
    private String residencia;
    private LocalTime horarioDeEntrada;
    private LocalTime horarioDeSalida;

    public Trabajador(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, int cuil, int sueldo, String residencia, LocalTime horarioDeEntrada, LocalTime horarioDeSalida) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.residencia = residencia;
        this.horarioDeEntrada = horarioDeEntrada;
        this.horarioDeSalida = horarioDeSalida;
    }

    public LocalTime getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    public void setHorarioDeEntrada(LocalTime horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }

    public LocalTime getHorarioDeSalida() {
        return horarioDeSalida;
    }

    public void setHorarioDeSalida(LocalTime horarioDeSalida) {
        this.horarioDeSalida = horarioDeSalida;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }


    @Override
    public void enviarMensaje(NombrePartido nombre) {
        if (horarioDeEntrada.isAfter(LocalTime.now()) && horarioDeSalida.isBefore(LocalTime.now()) && LocalDate.now().getDayOfWeek().getValue()>=1 && LocalDate.now().getDayOfWeek().getValue()<=5){
            System.out.println("Yo, CookerPro te invito a que votes por el partido" + nombre + "para un mejor futuro");
        }
        else {
            System.out.println("El trabajador no esta en horario de trabajo");
        }
    }
}
