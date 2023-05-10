package src.Repaso2;

public class Cheque {

    private Cliente clienteDestino;
    private Cliente clienteOrgien;
    private int monto;

    public Cheque(Cliente clienteDestino, Cliente clienteOrigen, int monto) {
        this.clienteDestino = clienteDestino;
        this.clienteOrgien = clienteOrigen;
        this.monto = monto;
    }

    public Cliente getClienteDestino() {
        return clienteDestino;
    }

    public void setClienteDestino(Cliente clienteDestino) {
        this.clienteDestino = clienteDestino;
    }

    public Cliente getClienteOrgien() {
        return clienteOrgien;
    }

    public void setClienteOrgien(Cliente clienteOrgien) {
        this.clienteOrgien = clienteOrgien;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
