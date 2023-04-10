package src.Empresas;

import src.Personas.Empleado;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    public Directivo() {
    }

    @Override
    public String toString() {
        return "src.Empresas.Directivo{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}