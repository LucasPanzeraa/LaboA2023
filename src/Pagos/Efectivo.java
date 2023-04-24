package src.Pagos;

public class Efectivo extends MetodoDePago {

    private int cantidadDeEfectivo;

    public Efectivo(String nombre, String apellido, int cecular, int cantidadDeEfectivo) {
        super(nombre, apellido, cecular);
        this.cantidadDeEfectivo = cantidadDeEfectivo;
    }

    public int getCantidadDeEfectivo() {
        return cantidadDeEfectivo;
    }

    public void setCantidadDeEfectivo(int cantidadDeEfectivo) {
        this.cantidadDeEfectivo = cantidadDeEfectivo;
    }
}
