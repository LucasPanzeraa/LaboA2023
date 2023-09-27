package src.Electronica;

import src.Politica.Mensajeros;

public class TelefonoMovil extends Dispositivo implements Mensajeros {
    private Companias compania;
    private int numeroDeCelular;

    public TelefonoMovil(int numeroDeSerie, String fabricante, String modelo, Companias compania, int numeroDeCelular) {
        super(numeroDeSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroDeCelular = numeroDeCelular;
    }

    public Companias getCompania() {
        return compania;
    }

    public void setCompania(Companias compania) {
        this.compania = compania;
    }

    public int getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(int numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }

    @Override
    public void enviarMensaje() {

    }
}
