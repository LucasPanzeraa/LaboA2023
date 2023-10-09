package src.Comida;

public interface IRestaurante {
    void contratar(Chef chef) throws NoContratar;
    void agregarPlato(Plato plato) throws NoAgregar;
}
