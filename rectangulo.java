public class rectangulo {
    private int base;
    private int altura;

    public rectangulo(int base, int altura) {
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
        return (int) base*2 + altura*2;
    }

    public int aera()
    {
        return (int) base * altura;
    }
}
