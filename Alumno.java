import java.util.ArrayList;

public class Alumno {
    private String apellido;
    private Fecha fechaNacimiento;
    ArrayList<Integer> notas;

    public Alumno(String apellido, Fecha fechaNacimiento, ArrayList<Integer> notas) {
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = notas;
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

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void Agregar(int nota){

        notas.add(nota);
    }

    public void MenorNota(){

        double menorNota = 10;
        for (int nota : notas){
            if (nota < menorNota){
                menorNota = nota;
            }
        }
    }

    public void MayorNota(){

        double mayorNota = 0;
        for (int nota:notas) {
            if (nota > mayorNota){
                mayorNota = nota;
            }
        }
    }
}
