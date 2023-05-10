package src.Repaso2;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{

    private ArrayList <Cheque> listDeCheques;

    public CuentaCorriente(Cliente titular, int CBU, int numeroCuenta, String alias, int saldo, ArrayList<Cheque> listDeCheques) {
        super(titular, CBU, numeroCuenta, alias, saldo);
        this.listDeCheques = listDeCheques;
    }

    public ArrayList<Cheque> getListDeCheques() {
        return listDeCheques;
    }

    public void setListDeCheques(ArrayList<Cheque> listDeCheques) {
        this.listDeCheques = listDeCheques;
    }
}
