package src.Personas;

import src.Comida.Pedido;

public class Empleado extends Persona {

    private int DNI;
    private String pais;
    private int numeroDeTelefono;

    public Empleado(String nombre, String apellido, int DNI, String pais, int numeroDeTelefono) {
        super(nombre, apellido);
        this.DNI = DNI;
        this.pais = pais;
        this.numeroDeTelefono = numeroDeTelefono;
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public String toString() {
        return "src.Personas.Empleado{" +
                "nombre='" + super.getNombre()+ '\'' +
                '}';
    }
}



