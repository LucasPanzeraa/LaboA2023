public class Libro {

    String titulo;
    String autor;
    int ISBN;
    int cantidadDePaginas;
    String editorial;
    Fecha fecha;


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


    public Libro(String titulo, String autor, int ISBN, int cantidadDePaginas, String editorial, Fecha fecha) {
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

        if (anterior) {
            System.out.println("El primer libro es anterior a el otro ingresado");

        } else {
            System.out.println("El otro libro es anteror a ");
        }
        return anterior;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(1,2,2004);
        Fecha fecha2 = new Fecha(2,3,2005);


        Libro libro = new Libro(fecha);
        Libro libro2 = new Libro(fecha2);


        libro.libroAnterior(libro2);

    }
}
