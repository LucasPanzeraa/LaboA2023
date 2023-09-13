package src.Personas;

import src.Biblioteca.LibroElectronico;
import src.Biblioteca.Membresia;

import java.time.LocalDate;
import java.util.HashSet;

public class UsuarioBiblioteca extends Persona{

    private String mail;
    private HashSet<LibroElectronico> listaDePrestamos;
    private Membresia membresia;

    public UsuarioBiblioteca(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento, String mail, HashSet<LibroElectronico> listaDePrestamos, Membresia membresia) {
        super(nombre, apellido, DNI, fechaDeNacimiento);
        this.mail = mail;
        this.listaDePrestamos = listaDePrestamos;
        this.membresia = membresia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<LibroElectronico> getListaDePrestamos() {
        return listaDePrestamos;
    }

    public void setListaDePrestamos(HashSet<LibroElectronico> listaDePrestamos) {
        this.listaDePrestamos = listaDePrestamos;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }



}
