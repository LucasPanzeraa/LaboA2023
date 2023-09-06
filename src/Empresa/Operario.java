package src.Empresa;

import src.Personas.Empleado;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "src.Empresas.Operario{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
