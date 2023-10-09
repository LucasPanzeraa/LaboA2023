package src;

public interface Contrato {

    void contratar(Equipo equipo, Jugador jugador) throws NoContrato;
    void renovar(Equipo equipo, Jugador jugador) throws NoRenovacion;
    void hacerPromedio(int cantidad);
}
