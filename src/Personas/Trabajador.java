package src.Personas;

import src.Politica.Mensajeros;

import java.time.LocalDate;
import java.util.Map;

public class Trabajador extends Persona implements Mensajeros {
    private int cuil;
    private int sueldo;
    private String residencia;

    public Trabajador(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, int cuil, int sueldo, String residencia) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.residencia = residencia;
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
    public void enviarMensaje() {

    }
}
