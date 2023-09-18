package src.Biblioteca;

import org.omg.CORBA.PRIVATE_MEMBER;
import src.Personas.Autor;

public class LibroElectronico{

    private String titulo;
    private String nombrePDF;
    private Autor autor;
    private Genero genero;
    private static int descargasDisponoibles = 10;
    private int descargasActuales;

    public LibroElectronico(String titulo, String nombrePDF, Autor autor, Genero genero, int descargasActuales) {
        this.titulo = titulo;
        this.nombrePDF = nombrePDF;
        this.autor = autor;
        this.genero = genero;
        this.descargasActuales = descargasActuales;
    }

    public int getDescargasActuales() {
        return descargasActuales;
    }

    public void setDescargasActuales(int descargasActuales) {
        this.descargasActuales = descargasActuales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static int getDescargasDisponoibles() {
        return descargasDisponoibles;
    }

    public static void setDescargasDisponoibles(int descargasDisponoibles) {
        LibroElectronico.descargasDisponoibles = descargasDisponoibles;
    }
}
