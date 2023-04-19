package src.Personas;

import java.util.ArrayList;
import src.Educacion.Materia;

public class Alumno extends Persona{
    private ArrayList<Materia>materias;
    private  String divicion;

    public Alumno() {
        super("cooki", "breindon");
        divicion = "3°A";
    }

    public Alumno(String nombre, String apellido, String divicion) {
        super(nombre, apellido);
        this.divicion = divicion;
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
