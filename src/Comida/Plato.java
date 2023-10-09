package src.Comida;

public class Plato {

    private String nombre;
    private String descripcion;
    private int precio;
    private int calorias;
    private TipoPlato tipoPlato;
    private Chef chefACargo;


    public Plato() {
        nombre = "CheguMila";
        precio = 600;
    }

    public Plato(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public Plato(String nombre, String descripcion, int precio, TipoPlato tipoPlato, Chef chefACargo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoPlato = tipoPlato;
        this.chefACargo = chefACargo;
    }

    public Chef getChefACargo() {
        return chefACargo;
    }

    public void setChefACargo(Chef chefACargo) {
        this.chefACargo = chefACargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoPlato getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(TipoPlato tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
