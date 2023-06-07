package src.Llamadas;

import src.Personas.Empleado;

import java.util.Date;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private Date fechaLlamada;
    private int duracionDeLlamada;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, Date fechaLlamada, int duracionDeLlamada) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracionDeLlamada = duracionDeLlamada;
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public Date getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Date fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracionDeLlamada() {
        return duracionDeLlamada;
    }

    public void setDuracionDeLlamada(int duracionDeLlamada) {
        this.duracionDeLlamada = duracionDeLlamada;
    }


}
