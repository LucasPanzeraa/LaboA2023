package src;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Integer> listaNotas;

    public Materia() {
        this.nombre = "Lucas";
        this.listaNotas = new ArrayList<>();
    }

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

    public void AgregarMateria(Materia materiaAAgregar) {

        Materia materiaNueva = materiaAAgregar;
    }

    public double promedioNotasMateria(){

        double promedio =0;
        for (int notas: listaNotas) {
            promedio = promedio + notas;
        }

        promedio = promedio / listaNotas.size();
        return promedio;
    }




}
