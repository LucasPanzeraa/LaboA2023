package src.Repaso2;

public class CuentaBancaria {
    private Cliente titular;
    private int CBU;
    private int numeroCuenta;
    private String alias;
    private int saldo;

    public CuentaBancaria(Cliente titular, int CBU, int numeroCuenta, String alias, int saldo) {
        this.titular = titular;
        this.CBU = CBU;
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getCBU() {
        return CBU;
    }

    public void setCBU(int CBU) {
        this.CBU = CBU;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void DepositarPlata(int plataADepositar) {
        saldo = saldo + plataADepositar;
    }

    public void RetirarPlata(int plataARetirar) {
        saldo = saldo - plataARetirar;
    }
}
