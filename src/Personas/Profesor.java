package src.Personas;

public class Profesor extends Persona{

    private int porcentajeDeDescuento;

    public Profesor(String nombre, String apellido, int porcentajeDeDescuento) {
        super(nombre, apellido);
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    public Profesor() {
        super("Pach", "Pandom");
        porcentajeDeDescuento = 30;
    }

    public int getPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }

    public void setPorcentajeDeDescuento(int porcentajeDeDescuento) {
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }
}
