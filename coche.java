public class coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int acelerar()
    {
        return (int) velocidad + 1;
    }

    public int frenar()
    {
        return (int) velocidad -1;
    }

    public void mostrarVelocidad(int velocidad)
    {
        System.out.println(velocidad);
    }
}
