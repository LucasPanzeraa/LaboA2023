package src.Personas;

import src.Biblioteca.Libro;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int DNI;
    private HashSet<Libro> bibliografía;

    public Autor(String nombre, LocalDate fechaDeNacimiento, int DNI, HashSet<Libro> bibliografía) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.DNI = DNI;
        this.bibliografía = bibliografía;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public HashSet<Libro> getBibliografía() {
        return bibliografía;
    }

    public void setBibliografía(HashSet<Libro> bibliografía) {
        this.bibliografía = bibliografía;
    }
}
