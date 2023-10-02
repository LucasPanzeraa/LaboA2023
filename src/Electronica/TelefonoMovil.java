package src.Electronica;

import src.Politica.Mensajeros;
import src.Politica.NombrePartido;
import src.Politica.PartidoPolitico;

public class TelefonoMovil extends Dispositivo implements Mensajeros {
    private Companias compania;
    private int numeroDeCelular;
    private int credito;
    private boolean encendido;

    public TelefonoMovil(int numeroDeSerie, String fabricante, String modelo, Companias compania, int numeroDeCelular, int credito) {
        super(numeroDeSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroDeCelular = numeroDeCelular;
        this.credito = credito;
        encendido = true;
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

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public void enviarMensaje(NombrePartido nombre) {
        if (encendido == true && credito > 0){
            System.out.println("Conectando con la antena más cercana");
            System.out.println("Vote por el partido" + nombre + "para un mejor futuro");
        }
        else {
            System.out.println("el celular no tiene credito o esta apagado");
        }
    }
}
