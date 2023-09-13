package src.Biblioteca;

import src.Fechas.Fecha;
import src.Personas.Autor;

public class Libro {

    private String titulo;
    private Autor autor;
    private int ISBN;
    private int cantidadDePaginas;
    private String editorial;
    private Fecha fecha;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }


    public Libro(String titulo, Autor autor, int ISBN, int cantidadDePaginas, String editorial, Fecha fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadDePaginas = cantidadDePaginas;
        this.editorial = editorial;
        this.fecha = fecha;
    }



    public Libro(Fecha fecha) {
        this.fecha = fecha;
    }

    public void mostrarInformacion(){

        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El ISBN es: " + ISBN);
        System.out.println("Las cantidad de paginas son: " + cantidadDePaginas);
        System.out.println("La editorial es: " + editorial);
        System.out.println("La fecha de publicacion es: " + fecha);

    }

    public boolean libroAnterior(Libro libro2) {
        boolean anterior;

        anterior = this.fecha.menorQue(libro2.fecha);

        return anterior;
    }


}
