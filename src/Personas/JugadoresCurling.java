package src.Personas;

import java.util.Date;

public class JugadoresCurling extends Persona{

    String nombre;
    private Date fechaDeNacimiento;
    private int numeroDeCamiseta;
    private boolean capitan;


    public JugadoresCurling(String nombre, int edad, String nombre1, Date fechaDeNacimiento, int numeroDeCamiseta, boolean capitan) {
        super(nombre);
        this.nombre = nombre1;
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
