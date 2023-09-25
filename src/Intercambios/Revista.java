package src.Intercambios;

import java.time.LocalDateTime;

public class Revista extends Escrito implements Prestable {

    private LocalDateTime fechaPublicacion;

    public Revista(int codigo, String titulo, int añoPublicacion, LocalDateTime fechaPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "codigo=" + getCodigo() +
                "titulo=" + getTitulo() +
                "añoPublicacion=" + getAñoPublicacion() +
                "fechaPublicacion=" + fechaPublicacion +
                '}';

    }

    @Override
    public boolean prestar() {
        if(getFechaPublicacion().isBefore(LocalDateTime.now().minusMonths(3))){
            System.out.println("La revista se dara prestado");
            return true;
        }
        else{
            System.out.println("La revista no se dara prestada");
            return false;
        }

    }

    @Override
    public boolean agregarElemento() {
        if(prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}
