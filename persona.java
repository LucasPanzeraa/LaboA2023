public class persona {
    private String nombre;
    private int edad;
    private String direccion;

    public void mostrarDatos (String nombre, int edad, String direccion)
    {
        System.out.println("Su persona se llama " + nombre + " tiene " + edad + " años y vive en " + direccion);
    }
}
