package src.Biblioteca;

import src.ManejoDeExcepciones.LimiteDePrestamosAlcanzadoException;
import src.Personas.UsuarioBiblioteca;

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

    public void PrestamoDeLibro(UsuarioBiblioteca usuario, LibroElectronico libro){

        if (libro.getDescargasActuales() < LibroElectronico.getDescargasDisponoibles()){
            if (usuario.getMembresia() == Membresia.BRONCE){
                if (usuario.getListaDePrestamos().size() < 5){
                    usuario.getListaDePrestamos().add(libro);
                    libro.setDescargasActuales(libro.getDescargasActuales()+1);
                }
                else{
                    try {
                        throw  new LimiteDePrestamosAlcanzadoException("Los bronce no pueden tener mas de 5 libros prestdos");
                    } catch (LimiteDePrestamosAlcanzadoException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            else if (usuario.getMembresia() == Membresia.PLATA) {
                if (usuario.getListaDePrestamos().size() < 15){
                    usuario.getListaDePrestamos().add(libro);
                    libro.setDescargasActuales(libro.getDescargasActuales()+1);
                }
                else {
                    try {
                        throw new LimiteDePrestamosAlcanzadoException("Los plata no pueden tener mas de 15 libros prestdos");
                    } catch (LimiteDePrestamosAlcanzadoException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            else if (usuario.getMembresia() == Membresia.ORO) {
                if (usuario.getListaDePrestamos().size() < 50){
                    usuario.getListaDePrestamos().add(libro);
                    libro.setDescargasActuales(libro.getDescargasActuales()+1);
                }
                else {
                    try {
                        throw new LimiteDePrestamosAlcanzadoException("Los oro no pueden tener mas de 50 libros prestdos");
                    } catch (LimiteDePrestamosAlcanzadoException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        else {
            try {
                throw new LimiteDePrestamosAlcanzadoException("Este libro ya alcanzo el maxioma de prestamos permitidos");
            }catch (LimiteDePrestamosAlcanzadoException e){
                throw new RuntimeException(e);
            }
        }
    }

    public void devolucionDeLibro(UsuarioBiblioteca usuario, LibroElectronico libro){
        libro.setDescargasActuales(libro.getDescargasActuales() -1);
        usuario.getListaDePrestamos().remove(libro);
    }

    public void agregarLibro(LibroElectronico libro){
        listaLibros.add(libro);
    }

    public void modificarLibro(LibroElectronico nuevo, LibroElectronico viejo){
        listaLibros.remove(viejo);
        listaLibros.add(nuevo);
    }

    public void eliminarLibro(LibroElectronico libro){
        listaLibros.remove(libro);
    }
}
