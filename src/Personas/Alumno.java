package src.Personas;

import java.util.ArrayList;

import src.Tiempo.Fecha;
import src.Educacion.Materia;

public class Alumno extends Persona{
    private ArrayList<Materia>materias;
    private String apellido;
    private Fecha fechaNacimiento;


    public Alumno(String nombre, int edad, ArrayList<Materia> materias, String apellido, Fecha fechaNacimiento) {
        super(nombre, edad);
        this.materias = materias;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Alumno(String nombre, int edad, ArrayList<Materia> materias, String apellido) {
        super(nombre, edad);
        this.materias = materias;
        this.apellido = apellido;
    }

    public Alumno(String apellido, String nombre, int edad) {
        super(nombre,edad);
        this.apellido = apellido;
        this.materias = new ArrayList<>();
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }


    public double promedioNotasAlumno(){

        double promedio = 0;
        for (Materia materia: materias) {

            promedio = promedio + materia.promedioNotasMateria();
        }
        promedio = promedio / materias.size();
        return promedio;
    }



}
