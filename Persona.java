public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarDatos (String nombre, int edad, String direccion)
    {
        System.out.println("Su persona se llama " + nombre + " tiene " + edad + " años y vive en " + direccion);
    }
}
