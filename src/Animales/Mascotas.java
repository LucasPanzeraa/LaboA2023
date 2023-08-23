package src.Animales;

import src.Personas.Dueño;

public abstract class Mascotas {

    private String nombre;
    private Dueño dueño;

    public Mascotas(String nombre, Dueño dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }


    public abstract String saludo();
    public abstract void alimentar();
    public abstract void tipoMascota();
}
