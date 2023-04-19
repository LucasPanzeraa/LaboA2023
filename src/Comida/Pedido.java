package src.Comida;

import src.Personas.Persona;
import src.Personas.Profesor;

import java.util.Calendar;
import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date fechaDeCreacion;
    private Plato plato;
    private Persona personaQuePidio;
    private double horaDeEntrega;
    private boolean entrgado;
    private int precioFinal;


    public Pedido() {
        fechaDeCreacion = new Date(4, Calendar.JUNE,2006);
        plato = new Plato();
        personaQuePidio = new Profesor();
        horaDeEntrega = 20.30;
        entrgado = false;
        idPedido = 1;
    }

    public Pedido(int idPedido, Date fechaDeCreacion, Plato plato, Persona personaQuePidio, double horaDeEntrega, boolean entrgado) {
        this.idPedido = idPedido;
        this.fechaDeCreacion = fechaDeCreacion;
        this.plato = plato;
        this.personaQuePidio = personaQuePidio;
        this.horaDeEntrega = horaDeEntrega;
        this.entrgado = entrgado;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersonaQuePidio() {
        return personaQuePidio;
    }

    public void setPersonaQuePidio(Persona personaQuePidio) {
        this.personaQuePidio = personaQuePidio;
    }

    public double getHoraDeEntrega() {
        return horaDeEntrega;
    }

    public void setHoraDeEntrega(double horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    public boolean isEntrgado() {
        return entrgado;
    }

    public void setEntrgado(boolean entrgado) {
        this.entrgado = entrgado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    void aplicarDescuento(){
        if (personaQuePidio instanceof Profesor){
            int precioADescontar= plato.getPrecio()* ((Profesor) personaQuePidio).getPorcentajeDeDescuento()/100;
            setPrecioFinal(plato.getPrecio()-precioADescontar);
        }
        else {
            setPrecioFinal(plato.getPrecio());
        }
    }
}