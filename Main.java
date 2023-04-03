import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Materia materia = new Materia();
        Materia materia1 = new Materia();

        materia1.setNombre("Matematicas");
        materia.setNombre("lengua");

        ArrayList<Integer>Lucas = new ArrayList<>();
        Lucas.add(5);
        Lucas.add(7);
        Lucas.add(6);
        Lucas.add(8);
        Lucas.add(9);

        ArrayList<Integer>anni = new ArrayList<>();
        anni.add(2);
        anni.add(9);
        anni.add(3);
        anni.add(7);
        anni.add(5);

        materia.setListaNotas(Lucas);
        materia1.setListaNotas(anni);

        Alumno alumno = new Alumno("Panzera");

        ArrayList<Materia>materias = new ArrayList<>();
        materias.add(materia);
        materias.add(materia1);

        alumno.setMaterias(materias);








    }
}
