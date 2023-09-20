package packageMartinBarbieri;

public class Neutra extends Bebida{

    public Neutra(String nombre, int coeficienteNegatividad, int coeficientePositividad) {
        super(nombre, coeficienteNegatividad, coeficientePositividad);
    }

    @Override
    public int calcularCoeficienteNegatividad() {
        return 0;
    }
}
