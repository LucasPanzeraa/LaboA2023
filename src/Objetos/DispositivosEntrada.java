package src.Objetos;

public class DispositivosEntrada extends Componentes{

    private String tipoDeConector;
    private int puertoDeEntrada;

    public DispositivosEntrada(String tipoDeComponente, String nombreDelFabricante, String modelo, int precioDeVenta, int aumentoSegunInflación, int stock, String tipoDeConector, int puertoDeEntrada) {
        super(tipoDeComponente, nombreDelFabricante, modelo, precioDeVenta, aumentoSegunInflación, stock);
        this.tipoDeConector = tipoDeConector;
        this.puertoDeEntrada = puertoDeEntrada;
    }

    public String getTipoDeConector() {
        return tipoDeConector;
    }

    public void setTipoDeConector(String tipoDeConector) {
        this.tipoDeConector = tipoDeConector;
    }

    public int getPuertoDeEntrada() {
        return puertoDeEntrada;
    }

    public void setPuertoDeEntrada(int puertoDeEntrada) {
        this.puertoDeEntrada = puertoDeEntrada;
    }
}
