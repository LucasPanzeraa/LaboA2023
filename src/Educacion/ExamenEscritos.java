package src.Educacion;

import java.time.LocalDateTime;

public class ExamenEscritos extends Examen implements Aprobado{
    private double nota;
    private int duracion;

    public ExamenEscritos(LocalDateTime fechaDeRealizacion, double nota, int duracion) {
        super(fechaDeRealizacion);
        this.nota = nota;
        this.duracion = duracion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean aprobado() {
        if (duracion < 90 && nota > 5.5){
            return true;
        }
        else {
            return false;
        }
    }
}
