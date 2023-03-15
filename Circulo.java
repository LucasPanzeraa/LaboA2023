
public class Circulo {
    private double radio;

    public Circulo(){
        this.radio = 2;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double setRadio(double radio){
        this.radio=radio;
        return radio;
    }
    public double calcularArea() {
        return (double) Math.PI * radio * radio;
    }
    public double calcularPerimetro() {
        return (double) Math.PI * 2 * radio;
    }

}
