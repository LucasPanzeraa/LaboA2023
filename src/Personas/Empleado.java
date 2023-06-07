package src.Personas;

import src.Fechas.DiaHabiles;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona {

    private int DNI;
    private String pais;
    private int numeroDeTelefono;
    private HashSet<DiaHabiles> diasPresente;
    private HashSet<LocalDateTime> listaDeAsistencia;

    public Empleado(String nombre, String apellido, int teléfono, Date fehcaDeNacimiento, HashSet<DiaHabiles> diasPresente, HashSet<LocalDateTime> listaDeAsistencia) {
        super(nombre, apellido, teléfono, fehcaDeNacimiento);
        this.diasPresente = diasPresente;
        this.listaDeAsistencia = listaDeAsistencia;
    }

    public Empleado() {
        super("nombre", 1);
        DNI = 35476890;
        pais = "pais";
        numeroDeTelefono = 1123456789;
    }

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

    public HashSet<DiaHabiles> getDiasPresente() {
        return diasPresente;
    }

    public void setDiasPresente(HashSet<DiaHabiles> diasPresente) {
        this.diasPresente = diasPresente;
    }

    public HashSet<LocalDateTime> getListaDeAsistencia() {
        return listaDeAsistencia;
    }

    public void setListaDeAsistencia(HashSet<LocalDateTime> listaDeAsistencia) {
        this.listaDeAsistencia = listaDeAsistencia;
    }

    public int porcentajeAsistencia(int mesElegido) {

        int diasPresente = 0;
        for (LocalDateTime lista:listaDeAsistencia) {
            if (lista.getMonthValue() == mesElegido){
                diasPresente ++;
            }
        }

        return diasPresente * 100 / 20;
    }
}



