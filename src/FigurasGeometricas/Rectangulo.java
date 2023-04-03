package src.FigurasGeometricas;

public class Rectangulo {
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

    public int  parametro()
    {
        return base*2 + altura*2;
    }

    public int aera()
    {
        return base * altura;
    }

    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo(3, 8);
        System.out.println (rec1.aera());
    }
}

