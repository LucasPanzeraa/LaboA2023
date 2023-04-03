package src;

public class Cancion {

    public String titulo;
    public String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        titulo = " ";
        autor = " ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {


    }
}
