package src.Educacion;

import java.util.HashSet;

public class CentroEducativo {
    private HashSet<Alumno> listaDeAlumnos;

    public CentroEducativo(HashSet<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public HashSet<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(HashSet<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public int cantidadDeArobados(){
        int cantidad = 0;
        for (Alumno alumno : listaDeAlumnos){
            if (alumno.aprobado()){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
