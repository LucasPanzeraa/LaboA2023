package src.Educacion;

import java.time.LocalDateTime;

public class ExamenOral extends Examen implements Aprobado{
    private Satisfaccion satisfaccion;

    public ExamenOral(LocalDateTime fechaDeRealizacion, Satisfaccion satisfaccion) {
        super(fechaDeRealizacion);
        this.satisfaccion = satisfaccion;
        super.setAprobado(aprobado());
    }

    public Satisfaccion getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    @Override
    public boolean aprobado() {
        if (satisfaccion == Satisfaccion.EXCELENTE || satisfaccion == Satisfaccion.SUFICIENTE){
            return true;
        }
        else {
            return false;
        }
    }
}
