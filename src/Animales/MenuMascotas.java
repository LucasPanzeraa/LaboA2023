package src.Animales;

import src.Personas.Dueño;
import src.Personas.Persona;

import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

public class MenuMascotas {

    private HashSet<Mascotas> listaDeMascotas;

    public MenuMascotas(HashSet<Mascotas> listaDeMascotas) {
        this.listaDeMascotas = listaDeMascotas;
    }

    public HashSet<Mascotas> getListaDeMascotas() {
        return listaDeMascotas;
    }

    public void setListaDeMascotas(HashSet<Mascotas> listaDeMascotas) {
        this.listaDeMascotas = listaDeMascotas;
    }


    public void altaMastcota(String nombre, Dueño dueño, String tipo) {
        if (Objects.equals(tipo, "gato")) {
            listaDeMascotas.add(new Gato(nombre, dueño));
        } else if (Objects.equals(tipo, "perro")) {
            listaDeMascotas.add(new Perro(nombre, dueño));
        } else if (Objects.equals(tipo, "pajaro")) {
            listaDeMascotas.add(new Pajaro(nombre, dueño));
        } else {
            listaDeMascotas.add(new Cantor(nombre, dueño));
        }
    }

    public void eliminarMascota(String nombre) {

        for (Mascotas mascotas : listaDeMascotas) {
            if (Objects.equals(mascotas.getNombre(), nombre)) {
                listaDeMascotas.remove(mascotas);
            }
        }
    }


    public void modificarMascota(Mascotas mascotaOriginal, Mascotas mascotaNueva) {
        listaDeMascotas.remove(mascotaOriginal);
        listaDeMascotas.add(mascotaNueva);
    }


    public Persona buscarDueño(String nombreDueño) {

        Dueño dueño = new Dueño();
        for (Mascotas mascotas : listaDeMascotas) {
            if (Objects.equals(mascotas.getDueño().getNombre(), nombreDueño)) {
                dueño.equals(mascotas.getDueño());
            }
        }
        return dueño;
    }

    public Mascotas buscarMascota(String nombreMascota) {
        Mascotas mascota = null;
        for (Mascotas mascotas : listaDeMascotas) {
            if (Objects.equals(mascotas.getNombre(), nombreMascota)) {
                mascota = mascotas;
            }
        }
        return mascota;

    }

    public void saludar(String nombreDueño, String nombreMascota) {
        Mascotas mascotaElegida = buscarMascota(nombreMascota);
        if (mascotaElegida instanceof Pez){
            if (((Pez) mascotaElegida).getVidaActuales() == 0){
                listaDeMascotas.remove(mascotaElegida);
            }
        }

        if (mascotaElegida.getDueño() == buscarDueño(nombreDueño)) {
            System.out.println(mascotaElegida.saludo());

        } else if (mascotaElegida instanceof Pajaro || mascotaElegida instanceof Cantor) {

        } else if (mascotaElegida instanceof Pez) {
            ((Pez) mascotaElegida).setVidaActuales(0);
            listaDeMascotas.remove(mascotaElegida);
            mascotaElegida = null;
        }
        System.out.println(mascotaElegida.saludo().toUpperCase() + "!");
    }
}
