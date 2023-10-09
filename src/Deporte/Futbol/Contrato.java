package src.Deporte.Futbol;

public interface Contrato {

    void contratar(Equipo equipo) throws NoContrato;
    void renovar(Equipo equipo) throws NoRenovacion;
    double hacerPromedio();
}
