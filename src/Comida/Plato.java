package src.Comida;

public class Plato {

    private String nombre;
    private int precio;


    public Plato() {
        nombre = "CheguMila";
        precio = 600;
    }
    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
