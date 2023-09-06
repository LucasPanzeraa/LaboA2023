package src.Sistemas;

public class DispositivosEntrada extends Perisfericos {

    private String tipoDeConector;

    public DispositivosEntrada(int puertosValidos, String tipoDeConector) {
        super(puertosValidos);
        this.tipoDeConector = tipoDeConector;
    }

    public String getTipoDeConector() {
        return tipoDeConector;
    }

    public void setTipoDeConector(String tipoDeConector) {
        this.tipoDeConector = tipoDeConector;
    }
}