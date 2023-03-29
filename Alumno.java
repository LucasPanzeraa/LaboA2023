import java.util.ArrayList;

public class Alumno {
    private ArrayList<Materia>materias;
    private String apellido;
    private Fecha fechaNacimiento;


    public Alumno(ArrayList<Materia> materias, String apellido, Fecha fechaNacimiento) {
        this.materias = materias;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
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

    public void AgregarMateria(Materia materiaAAgregar) {

        materias.add(materiaAAgregar);
    }



}
