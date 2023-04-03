package src.Personas;

import java.util.Date;

public class JugadoresCurling {

    String nombre;
    Date fechaDeNacimiento;
    int numeroDeCamiseta;
    boolean capitan;


    public JugadoresCurling(String nombre, Date fechaDeNacimiento, int numeroDeCamiseta, boolean capitan) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.capitan = capitan;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
