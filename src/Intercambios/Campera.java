package src.Intercambios;

public class Campera extends PrendaDeRopa implements Prestable{
    public Campera(String color, Materiales material, String marca, String estado) {
        super(color, material, marca, estado);
    }

    @Override
    public String toString() {
        return "Campera{" +
                "color=" + getMarca() +
                "material=" + getMaterial() +
                "marca=" + getMarca() +
                "estado=" + getEstado() +
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
