package src.Objetos;

public class Componentes {


    private String tipoDeComponente;
    private String nombreDelFabricante;
    private String modelo;
    private int precioDeVenta;
    private int aumentoSegunInflación;
    private int stock;


    public Componentes(String tipoDeComponente, String nombreDelFabricante, String modelo, int precioDeVenta, int aumentoSegunInflación, int stock) {
        this.tipoDeComponente = tipoDeComponente;
        this.nombreDelFabricante = nombreDelFabricante;
        this.modelo = modelo;
        this.precioDeVenta = precioDeVenta;
        this.aumentoSegunInflación = aumentoSegunInflación;
        this.stock = stock;
    }


    public String getTipoDeComponente() {
        return tipoDeComponente;
    }

    public void setTipoDeComponente(String tipoDeComponente) {
        this.tipoDeComponente = tipoDeComponente;
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

    public int getAumentoSegunInflación() {
        return aumentoSegunInflación;
    }

    public void setAumentoSegunInflación(int aumentoSegunInflación) {
        this.aumentoSegunInflación = aumentoSegunInflación;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
