package src.Cine;

import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private LocalDateTime fechaYHora;
    private SalaDeCine sala;
    private int cantidadEsperctadores;


    public Funcion(Pelicula pelicula, LocalDateTime fechaYHora, SalaDeCine sala, int cantidadEsperctadores) {
        this.pelicula = pelicula;
        this.fechaYHora = fechaYHora;
        this.sala = sala;
        this.cantidadEsperctadores = cantidadEsperctadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public SalaDeCine getSala() {
        return sala;
    }

    public void setSala(SalaDeCine sala) {
        this.sala = sala;
    }

    public int getCantidadEsperctadores() {
        return cantidadEsperctadores;
    }

    public void setCantidadEsperctadores(int cantidadEsperctadores) {
        this.cantidadEsperctadores = cantidadEsperctadores;
    }
}
