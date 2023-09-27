package src.Electronica;

public class Dispositivo {
    private int numeroDeSerie;
    private String fabricante;
    private String modelo;

    public Dispositivo(int numeroDeSerie, String fabricante, String modelo) {
        this.numeroDeSerie = numeroDeSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
