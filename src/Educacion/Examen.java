package src.Educacion;

import java.time.LocalDateTime;

public class Examen{
    private LocalDateTime fechaDeRealizacion;
    private boolean aprobado;

    public Examen(LocalDateTime fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public LocalDateTime getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(LocalDateTime fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
}
