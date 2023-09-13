package src.Musica;

import src.Musica.Cancion;

import java.util.ArrayList;

public class CD {

    private ArrayList<Cancion>canciones;


    public CD() {

        canciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones(){

        int cantidadCanciones = canciones.size();
        return cantidadCanciones;
    }

    public Cancion verCancion(int posicion){

        return canciones.get(posicion);
    }

    public void grabaCancion(int posición, Cancion nuevaCancion){

        Cancion cancionElegida = canciones.get(posición);

        cancionElegida.setTitulo(nuevaCancion.titulo);
        cancionElegida.setAutor(nuevaCancion.autor);
    }

    public void agrega(Cancion cancion){

        canciones.add(cancion);
    }

    public void eliminarCancion (int posición){

        canciones.remove(posición);
    }


}
