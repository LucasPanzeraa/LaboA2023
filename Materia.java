import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Integer> listaNotas;

    public Materia(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void MayorNota(){

        double mayorNota = 0;
        for (int nota:listaNotas) {
            if (nota > mayorNota){
                mayorNota = nota;
            }
        }
    }


    public void MenorNota(){

        double menorNota = 10;
        for (int nota : listaNotas){
            if (nota < menorNota){
                menorNota = nota;
            }
        }
    }

    public void Agregar(int nota){

        listaNotas.add(nota);
    }



}
