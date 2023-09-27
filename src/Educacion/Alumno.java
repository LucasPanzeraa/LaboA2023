package src.Educacion;

import src.Personas.Persona;

import java.util.ArrayList;
import java.util.HashSet;

public class Alumno extends Persona implements Aprobado{

    private HashSet<Examen> listaDeExamenes;
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

    public Alumno(String nombre, String apellido, int DNI, HashSet<Examen> listaDeExamenes) {
        super(nombre, apellido, DNI);
        this.listaDeExamenes = listaDeExamenes;
    }


    public HashSet<Examen> getListaDeExamenes() {
        return listaDeExamenes;
    }

    public void setListaDeExamenes(HashSet<Examen> listaDeExamenes) {
        this.listaDeExamenes = listaDeExamenes;
    }

    public String getDivicion() {
        return divicion;
    }

    public void setDivicion(String divicion) {
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

    @Override
    public boolean aprobado() {
        for (Examen examen: listaDeExamenes){
            if (!examen.isAprobado()){
                System.out.println(getNombre() + " desaprobado");
                return false;
            }
        }
        System.out.println(getNombre() + " aprobado");
        return true;
    }
}
