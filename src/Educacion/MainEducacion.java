package src.Educacion;

import java.time.LocalDateTime;
import java.util.HashSet;

public class MainEducacion {
    public static void main(String[] args) {
        Examen examen = new ExamenEscrito(LocalDateTime.now(), 10, 30);
        Examen examen1 = new ExamenOral(LocalDateTime.now(), Satisfaccion.EXCELENTE);
        Examen examen2 = new ExamenEscrito(LocalDateTime.now(), 6, 50);

        HashSet<Examen> listaDeExamen = new HashSet<>();
        listaDeExamen.add(examen);
        listaDeExamen.add(examen1);
        listaDeExamen.add(examen2);

        Examen examen3 = new ExamenEscrito(LocalDateTime.now(), 4, 60);
        HashSet<Examen> listaDeExamen1 = new HashSet<>();
        listaDeExamen1.add(examen3);


        Alumno alumno = new Alumno("Ian", "panzera", 473203, listaDeExamen);
        Alumno alumno1 = new Alumno("Santi", "Brandon", 4352365, listaDeExamen1);

        HashSet<Alumno> listaDeAlumno = new HashSet<>();
        listaDeAlumno.add(alumno);
        listaDeAlumno.add(alumno1);

        CentroEducativo centroEducativo = new CentroEducativo(listaDeAlumno);

        int cant = centroEducativo.cantidadDeArobados();
        System.out.println("La cantidad de alumnos aprovados son: " + cant);

    }
}
