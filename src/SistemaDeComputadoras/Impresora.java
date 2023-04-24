package src.SistemaDeComputadoras;

public class Impresora extends DispositivosSalida {

    private String metodoDeimpresion;

    public Impresora(int cantidadDePuertos, String metodoDeimpresion) {
        super(cantidadDePuertos);
        this.metodoDeimpresion = metodoDeimpresion;
    }

    public String getMetodoDeimpresion() {
        return metodoDeimpresion;
    }

    public void setMetodoDeimpresion(String metodoDeimpresion) {
        this.metodoDeimpresion = metodoDeimpresion;
    }
}
