package src.Personas;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Date fehcaDeNacimiento;
    private String direccion;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFehcaDeNacimiento() {
        return fehcaDeNacimiento;
    }

    public void setFehcaDeNacimiento(Date fehcaDeNacimiento) {
        this.fehcaDeNacimiento = fehcaDeNacimiento;
    }

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
