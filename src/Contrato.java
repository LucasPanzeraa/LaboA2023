package src;

public interface Contrato {

    public void contratar(Equipo equipo);
    public void renovar(Equipo equipo) throws NoRenovacion;
}
