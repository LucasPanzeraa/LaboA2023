
public class Cafetera {

    int cantidadMaxima;
    int cantidadActual;


    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int cantidadActual) {
        this.cantidadMaxima = 1000;
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;

        if(cantidadActual > cantidadMaxima){
            cantidadMaxima = cantidadActual;
        }
    }


    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){

        cantidadActual = cantidadMaxima;

    }

    public void servirTaza(int capacidad){

        if(cantidadActual - capacidad < 0){
            cantidadActual = 0;

        }else {
            cantidadActual = cantidadActual - capacidad;
        }

    }

    public void vaciarCafetera(){

        cantidadActual = 0;

    }

    public void agregarCafe (int cantidad){

        if (cantidadActual + cantidad > cantidadMaxima){
            cantidadActual = cantidadMaxima;

        } else {
            cantidadActual = cantidadActual + cantidad;
        }
    }
}
