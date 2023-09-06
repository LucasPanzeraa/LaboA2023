package src.Empresa;

public class Oficial extends Operario {

    public Oficial(String nombre, String apellido, int DNI, String pais, int numeroDeTelefono) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "src.Empresas.Oficial{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}