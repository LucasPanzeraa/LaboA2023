package src.Empresa;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "src.Empresas.Tecnico{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
