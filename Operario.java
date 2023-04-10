import src.Personas.Empleado;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    public Operario() {
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
