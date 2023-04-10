package src.Personas;

public class Empleado {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado() {
        nombre = "Cooker";
    }


    @Override
    public String toString() {
        return "src.Personas.Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}



