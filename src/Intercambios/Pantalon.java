package src.Intercambios;

public class Pantalon extends PrendaDeRopa implements Prestable{

    private int medidaCintura;
    private int medidaCadera;
    private int medidaLargo;

    public Pantalon(String color, Materiales material, String marca, String estado, int medidaCintura, int medidaCadera, int medidaLargo) {
        super(color, material, marca, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.medidaLargo = medidaLargo;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public int getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(int medidaLargo) {
        this.medidaLargo = medidaLargo;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "color=" + getMarca() +
                "material=" + getMaterial() +
                "marca=" + getMarca() +
                "estado=" + getEstado() +
                "medidaCintura=" + medidaCintura +
                ", medidaCadera=" + medidaCadera +
                ", medidaLargo=" + medidaLargo +
                '}';
    }

    @Override
    public boolean prestar() {
        if(getEstado().equals("buen estado")){
            System.out.println("La prenda se dara prestado");
            return true;
        }
        else{
            System.out.println("La prenda no se dara prestada");
            return false;
        }
    }

    @Override
    public boolean agregarElemento() {
        if(prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}
