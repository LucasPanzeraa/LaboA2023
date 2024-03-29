package src.Sistemas;

import src.Pagos.MetodoDePago;
import src.Personas.Cliente;

import java.util.ArrayList;

public class PaginaWeb {

    private ArrayList<Componente>listaDeComponentes;
    private ArrayList<Compra>listaDeCompras;


    public PaginaWeb(ArrayList<Componente> listaDeComponentes, ArrayList<Compra> listaDeCompras) {
        this.listaDeComponentes = listaDeComponentes;
        this.listaDeCompras = listaDeCompras;
    }

    public ArrayList<Componente> getListaDeComponentes() {
        return listaDeComponentes;
    }

    public void setListaDeComponentes(ArrayList<Componente> listaDeComponentes) {
        this.listaDeComponentes = listaDeComponentes;
    }

    public ArrayList<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(ArrayList<Compra> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public void sumarComponente(){
        listaDeComponentes.add(new Componente());
    }

    public void bajarComponente(){
        listaDeComponentes.remove(0);
    }

    public void hacerCompra(ArrayList<Componente> listaDeComponentes, Cliente cliente, MetodoDePago metodoDePago){
        Compra compra = new Compra(listaDeComponentes, cliente, metodoDePago);
        try{
            for (Componente lista:listaDeComponentes) {
                lista.setStock(lista.getStock() - 1);

                if (lista.getStock() < 0) {
                    throw new NullPointerException("Stock insuficiente");
                }
                System.out.println("Hay stock");
            }
            listaDeCompras.add(compra);
        }catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
    }
}
