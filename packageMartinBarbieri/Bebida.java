package packageMartinBarbieri;

public abstract class Bebida {

    private String nombre;
    private int coeficienteNegatividad;
    private int coeficientePositividad;

    public Bebida(String nombre, int coeficienteNegatividad, int coeficientePositividad) {
        this.nombre = nombre;
        this.coeficienteNegatividad = coeficienteNegatividad;
        this.coeficientePositividad = coeficientePositividad;
    }

    public Bebida(String nombre, int coeficientePositividad) {
        this.nombre = nombre;
        this.coeficienteNegatividad = coeficienteNegatividad;
        this.coeficientePositividad = coeficientePositividad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }
    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public int diferenciaCoeficientes(){
        return coeficientePositividad-coeficienteNegatividad;
    }
    public abstract int calcularCoeficienteNegatividad();
}
