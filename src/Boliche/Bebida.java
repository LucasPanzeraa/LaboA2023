package src.Boliche;

public abstract class Bebida {
    private String nombre;
    private int coeficienteDePositividad;
    private int coeficientedDeNegatividad;
    private int stock;

    public Bebida(String nombre, int coeficienteDePositividad, int coeficientedDeNegatividad, int stock) {
        this.nombre = nombre;
        this.coeficienteDePositividad = coeficienteDePositividad;
        this.coeficientedDeNegatividad = coeficientedDeNegatividad;
        this.stock = stock;
    }

    public Bebida(String nombre, int coeficienteDePositividad, int coeficientedDeNegatividad) {
        this.nombre = nombre;
        this.coeficienteDePositividad = coeficienteDePositividad;
        this.coeficientedDeNegatividad = coeficientedDeNegatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCoeficienteDePositividad() {
        return coeficienteDePositividad;
    }

    public void setCoeficienteDePositividad(int coeficienteDePositividad) {
        this.coeficienteDePositividad = coeficienteDePositividad;
    }

    public int getCoeficientedDeNegatividad() {
        return coeficientedDeNegatividad;
    }

    public void setCoeficientedDeNegatividad(int coeficientedDeNegatividad) {
        this.coeficientedDeNegatividad = coeficientedDeNegatividad;
    }
}
