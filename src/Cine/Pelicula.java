package src.Cine;

public class Pelicula {
    private static int contador = 0;
    private int id;
    private String titulo;
    private Genero genero;

    public Pelicula(String titulo, Genero genero) {
        contador ++;
        id = contador;
        this.titulo = titulo;
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pelicula.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
