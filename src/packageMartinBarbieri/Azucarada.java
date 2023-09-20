package packageMartinBarbieri;

public class Azucarada extends Bebida{
    private int cantidadAzucar;

    public Azucarada(String nombre, int cantidadAzucar) {
        super(nombre, 1);
        this.cantidadAzucar = cantidadAzucar;
        super.setCoeficienteNegatividad(calcularCoeficienteNegatividad());
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    @Override
    public int calcularCoeficienteNegatividad(){
        return this.cantidadAzucar*10;
    }
}
