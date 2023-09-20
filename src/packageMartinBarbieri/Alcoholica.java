package packageMartinBarbieri;

public class Alcoholica extends Bebida{
    private int cantidadAlcohol;

    public Alcoholica(String nombre, int cantidadAlcohol) {
        super(nombre, 0 );
        this.cantidadAlcohol = cantidadAlcohol;
        super.setCoeficienteNegatividad(calcularCoeficienteNegatividad());
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public int calcularCoeficienteNegatividad() {
        return this.cantidadAlcohol * 20;
    }
}
