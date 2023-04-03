import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Materia materia = new Materia();
        Materia materia1 = new Materia();

        materia1.setNombre("Matematicas");
        materia.setNombre("lengua");

        ArrayList<Integer>notas1 = new ArrayList<>();
        notas1.add(5);
        notas1.add(7);
        notas1.add(6);
        notas1.add(8);
        notas1.add(9);

        ArrayList<Integer>notas = new ArrayList<>();
        notas.add(2);
        notas.add(9);
        notas.add(3);
        notas.add(7);
        notas.add(5);

        materia.setListaNotas(notas);
        materia1.setListaNotas(notas1);

        System.out.println();



        Alumno alumno = new Alumno("Panzera");

        ArrayList<Materia>materias = new ArrayList<>();
        materias.add(materia);
        materias.add(materia1);

        alumno.setMaterias(materias);





        System.out.println(alumno.promedioNotasAlumno());



    }
}
