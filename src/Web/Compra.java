package src.Web;

import src.Objetos.Componentes;
import src.Objetos.Computadora;

public class Compra {
    private boolean compraMinima;
    private String metodoDePago;

    private Computadora computadora;

    public Compra(boolean compraMinima, String metodoDePago) {
        this.compraMinima = compraMinima;
        this.metodoDePago = metodoDePago;
    }

    public boolean isCompraMinima() {
        return compraMinima;
    }

    public void setCompraMinima(boolean compraMinima) {
        this.compraMinima = compraMinima;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }


    public void realizarCompra(){
        boolean cpu;
        boolean dispEntrada;
        boolean dispSalida;

        for ( Componentes lista:computadora.getListaDeComponentes()) {

            if (lista.getTipoDeComponente()== "CPU"){
                cpu = true;

            } else if (lista.getTipoDeComponente()== "dispositivoEntrada") {
                dispEntrada = true;

            }else {
                dispSalida = true;
            }
        }

    }
}
