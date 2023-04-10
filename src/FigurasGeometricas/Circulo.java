package src.FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo()
    {
        this.radio = 2;
    }

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public double setRadio(double radio)
    {
        this.radio=radio;
        return radio;
    }

    @Override
    public double CalcularArea() {

        return Math.PI * radio * radio;
    }

    @Override
    public double CalcularPerimetro() {

        return Math.PI * 2 * radio;
    }
}
