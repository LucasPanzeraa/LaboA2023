package src.Fechas;

public enum Dia {

    LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
    private int dia;

    private Dia( int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}
