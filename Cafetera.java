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
        this.cantidadActual = cantidadMaxima;

        if(cantidadActual > cantidadMaxima){
            cantidadMaxima = cantidadActual;
        }
    }

}
