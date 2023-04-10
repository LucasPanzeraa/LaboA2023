package src.Empresas;

import src.Empresas.Operario;

public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "src.Empresas.Oficial{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}