package src.Empresas;

import src.Empresas.Operario;

public class Oficial extends Operario {

    public Oficial(String nombre, String apellido, int DNI, String pais, int numeroDeTelefono) {
        super(nombre, apellido, DNI, pais, numeroDeTelefono);
    }

    @Override
    public String toString() {
        return "src.Empresas.Oficial{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}