package src.Empresas;

import src.Personas.Empleado;

public class Operario extends Empleado {

    public Operario(String nombre, String apellido, int DNI, String pais, int numeroDeTelefono) {
        super(nombre, apellido, DNI, pais, numeroDeTelefono);
    }

    @Override
    public String toString() {
        return "src.Empresas.Operario{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
