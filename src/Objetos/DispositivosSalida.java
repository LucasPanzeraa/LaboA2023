package src.Web;

import src.Objetos.Componentes;

public class DispositivosSalida extends Componentes {

    private int cantidadDePuertos;


    public DispositivosSalida(String tipoDeComponente, String nombreDelFabricante, String modelo, int precioDeVenta, int aumentoSegunInflación, int stock, int cantidadDePuertos) {
        super(tipoDeComponente, nombreDelFabricante, modelo, precioDeVenta, aumentoSegunInflación, stock);
        this.cantidadDePuertos = cantidadDePuertos;
    }

    public int getCantidadDePuertos() {
        return cantidadDePuertos;
    }

    public void setCantidadDePuertos(int cantidadDePuertos) {
        this.cantidadDePuertos = cantidadDePuertos;
    }
}
