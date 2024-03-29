package src.Personas;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private int peso;
    private int altura;
    private int edad;
    private int teléfono;
    private LocalDate fechaDeNacimiento;
    private String direccion;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, LocalDate fehcaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fehcaDeNacimiento;
    }


    public Persona() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.fechaDeNacimiento = LocalDate.now();
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public Persona(String nombre, String apellido, int DNI, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String nombre, String apellido, int DNI, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int peso, int altura, int edad, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void mostrarDatos (String nombre, int edad, String direccion)
    {
        System.out.println("Su persona se llama " + nombre + " tiene " + edad + " años y vive en " + direccion);
    }
}
