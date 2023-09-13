package src.Biblioteca;

import java.util.HashSet;

public class SistemaBiblioteca {
    private HashSet<LibroElectronico> listaLibros;

    public SistemaBiblioteca(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public HashSet<LibroElectronico> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }

    
}
