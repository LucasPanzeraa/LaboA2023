package src.Intercambios;

public class Remera extends PrendaDeRopa implements Prestable{

    private int medidaEspalda;
    private int medidaContorno;
    private int medidaTorso;

    public Remera(String color, Materiales material, String marca, String estado, int medidaEspalda, int medidaContorno, int medidaTorso) {
        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.medidaTorso = medidaTorso;
    }

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public int getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(int medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public int getMedidaTorso() {
        return medidaTorso;
    }

    public void setMedidaTorso(int medidaTorso) {
        this.medidaTorso = medidaTorso;
    }

    @Override
    public String toString() {
        return "Remera{" +
                "color=" + getMarca() +
                "material=" + getMaterial() +
                "marca=" + getMarca() +
                "estado=" + getEstado() +
                "medidaEspalda=" + medidaEspalda +
                ", medidaContorno=" + medidaContorno +
                ", medidaTorso=" + medidaTorso +
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
