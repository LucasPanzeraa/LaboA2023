package src.Intercambios;

import java.util.HashMap;

public class LibroEscrito extends Escrito implements Prestable {

    private HashMap<Integer,Integer> paginasXCapitulo;

    public LibroEscrito(int codigo, String titulo, int añoPublicacion, HashMap<Integer, Integer> paginasXCapitulo) {
        super(codigo, titulo, añoPublicacion);
        this.paginasXCapitulo = paginasXCapitulo;
    }

    public HashMap<Integer, Integer> getPaginasXCapitulo() {
        return paginasXCapitulo;
    }

    public void setPaginasXCapitulo(HashMap<Integer, Integer> paginasXCapitulo) {
        this.paginasXCapitulo = paginasXCapitulo;
    }

    @Override
    public String toString() {
        return "LibroEscrito{" +
                "codigo=" + getCodigo() +
                "titulo=" + getTitulo() +
                "añoPublicacion=" + getAñoPublicacion() +
                "paginasXCapitulo=" + paginasXCapitulo +
                '}';
    }

    @Override
    public boolean prestar() {
        if(getPaginasXCapitulo().size()%2 == 1){
            System.out.println("El libro se dara prestado");
            return true;
        }
        else{
            System.out.println("El libro no sera prestara");
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
