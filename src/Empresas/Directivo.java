package src.Empresas;

import src.Personas.Empleado;

public class Directivo extends Empleado {

    public Directivo(String nombre, String apellido, int DNI, String pais, int numeroDeTelefono) {
        super(nombre, apellido, DNI, pais, numeroDeTelefono);
    }

    @Override
    public String toString() {
        return "src.Empresas.Directivo{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}