package src.Sistemas;

import src.Pagos.MetodoDePago;
import src.Pagos.Targeta;
import src.Personas.Cliente;

import java.util.ArrayList;

public class Compra{
    private ArrayList<Componente>listaDeComponentes;
    Cliente cliente;
    private MetodoDePago metodoDePago;
    private int precioTotal;

    public Compra(ArrayList<Componente> listaDeComponentes, Cliente cliente, MetodoDePago metodoDePago) {
        if (verificarCompraMinima() && verificarStock(listaDeComponentes)){

            this.listaDeComponentes = listaDeComponentes;
            this.cliente = cliente;
            this.metodoDePago = metodoDePago;
            precioTotal = calcularPrecio(metodoDePago, listaDeComponentes);
        }
    }

    public ArrayList<Componente> getListaDeComponentes() {
        return listaDeComponentes;
    }

    public void setListaDeComponentes(ArrayList<Componente> listaDeComponentes) {
        this.listaDeComponentes = listaDeComponentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean verificarCompraMinima(){
        boolean cpu = false;
        boolean dispEntrada = false;
        boolean dispSalida = false;
        boolean compraMinima = false;

        for ( Componente lista: listaDeComponentes){

            if (lista instanceof CPU){
                cpu = true;

            } else if (lista instanceof DispositivosEntrada) {
                dispEntrada = true;

            }else {
                dispSalida = true;
            }
        }
        if (cpu && dispEntrada && dispSalida){
            compraMinima = true;
        }
        return compraMinima;
    }

    public boolean verificarStock(ArrayList<Componente> listaDeComponente){
        boolean stockDispo = true;
        for (Componente lista: listaDeComponente) {
            if (lista.getStock() == 0){
                stockDispo = false;
            }
        }
        return stockDispo;
    }

    public int cantEntrada(){
        int contador = 0;
        for (Componente lista:listaDeComponentes) {
            if (lista instanceof DispositivosEntrada){
                contador ++;
            }
        }
        return contador;
    }

    public int cantSalida(){
        int contador = 0;
        for (Componente lista:listaDeComponentes) {
            if (lista instanceof DispositivosSalida){
                contador ++;
            }
        }
        return contador;
    }
    public int calcularPrecio(MetodoDePago metodoDePago, ArrayList<Componente> listaDeComponentes){
        int precioTotal = 0;
        for (Componente lista: listaDeComponentes) {
            precioTotal =+ lista.getPrecioDeVenta();
        }
        if (metodoDePago instanceof Targeta){
            precioTotal = precioTotal - precioTotal/100*5;
        }
        return precioTotal;
    }
}
