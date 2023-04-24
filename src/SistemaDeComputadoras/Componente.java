package src.SistemaDeComputadoras;

public class Componente {

    private String Nombre;
    private String nombreDelFabricante;
    private String modelo;
    private int precioDeVenta;
    private int stock;


    public Componente(String nombre, String nombreDelFabricante, String modelo, int precioDeVenta, int stock) {
        Nombre = nombre;
        this.nombreDelFabricante = nombreDelFabricante;
        this.modelo = modelo;
        this.precioDeVenta = precioDeVenta;
        this.stock = stock;
    }

    public Componente(){

    }

    public Componente(int stock){
        this.stock = stock;
    }


    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }

    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
