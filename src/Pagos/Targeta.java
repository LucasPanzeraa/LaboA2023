package src.Pagos;

import src.Pagos.MetodoDePago;

public class Targeta extends MetodoDePago {

    private int numeroDeTargeta;
    private String banco;
    private boolean Credito;

    public Targeta(String nombre, String apellido, int cecular, int numeroDeTargeta, String banco, boolean credito) {
        super(nombre, apellido, cecular);
        this.numeroDeTargeta = numeroDeTargeta;
        this.banco = banco;
        Credito = credito;
    }

    public int getNumeroDeTargeta() {
        return numeroDeTargeta;
    }

    public void setNumeroDeTargeta(int numeroDeTargeta) {
        this.numeroDeTargeta = numeroDeTargeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isCredito() {
        return Credito;
    }

    public void setCredito(boolean credito) {
        Credito = credito;
    }
}
