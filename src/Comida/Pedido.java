package src.Comida;

import src.Comida.Plato;
import src.Personas.Persona;
import src.Personas.Profesor;

import java.sql.Time;
import java.util.Date;

public class Pedido {
    private Date fechaDeCreacion;
    private Plato plato;
    private Persona personaQuePidio;
    private Time horaDeEntrega;
    private boolean entrgado;


    public Pedido() {
        fechaDeCreacion = new Date(04,05,2006);
        plato = new Plato();
        personaQuePidio = new Profesor();
        horaDeEntrega = new Time(20,12,8);
        entrgado = false;
    }

    public Pedido(Date fechaDeCreacion, Plato plato, Persona personaQuePidio, Time horaDeEntrega, boolean entrgado) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.plato = plato;
        this.personaQuePidio = personaQuePidio;
        this.horaDeEntrega = horaDeEntrega;
        this.entrgado = entrgado;
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

    public Time getHoraDeEntrega() {
        return horaDeEntrega;
    }

    public void setHoraDeEntrega(Time horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    public boolean isEntrgado() {
        return entrgado;
    }

    public void setEntrgado(boolean entrgado) {
        this.entrgado = entrgado;
    }
}
