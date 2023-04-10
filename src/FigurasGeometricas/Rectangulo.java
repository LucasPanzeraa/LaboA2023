package src.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public double CalcularPerimetro() {
        return base*2 + altura*2;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }
}

