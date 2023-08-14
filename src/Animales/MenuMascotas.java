package src.Animales;

import src.Personas.Dueño;
import src.Personas.Persona;

import java.util.HashSet;

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

    public void altaMastcota (String nombre, Persona dueño, String tipo){
        if (tipo == "gato"){
            listaDeMascotas.add(new Gato(nombre,dueño));
        }
        else if (tipo == "perro") {
            listaDeMascotas.add(new Perro(nombre, dueño));
        }
        else if (tipo == "pajaro"){
            listaDeMascotas.add(new Pajaro(nombre, dueño));
        }
        else {
            listaDeMascotas.add(new Cantor(nombre, dueño));
        }
    }

    public void eliminarMascota (String nombre){
        for (Mascotas mascotas:listaDeMascotas) {
            if (mascotas.getNombre() == nombre){
                listaDeMascotas.remove(mascotas);
            }
        }
    }


    public void modificarMascota(Mascotas mascotaOriginal, Mascotas mascotaNueva){
        listaDeMascotas.remove(mascotaOriginal);
        listaDeMascotas.add(mascotaNueva);
    }


    public Persona buscarDueño(String nombreDueño){

        Dueño dueño = new Dueño();
        for (Mascotas mascotas :listaDeMascotas){
            if (mascotas.getDueño().getNombre() == nombreDueño){
                dueño.equals(mascotas.getDueño());
            }
        }
        return dueño;
    }

    public void saludar (String nombreDueño, String nombreMascota  ){


    }
}
