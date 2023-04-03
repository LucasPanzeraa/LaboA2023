package src.Personas;

import java.util.ArrayList;

import src.Fecha;
import src.Materia;

public class Alumno {
    private ArrayList<Materia>materias;
    private String apellido;
    private Fecha fechaNacimiento;


    public Alumno(ArrayList<Materia> materias, String apellido, Fecha fechaNacimiento) {
        this.materias = materias;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Alumno(String apellido) {
        this.apellido = apellido;
        this.materias = new ArrayList<>();
    }

    public Alumno(String apellido, Fecha fechaNacimiento) {
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
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

    public Alumno(ArrayList<Materia> materias) {
        this.materias = materias;
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
