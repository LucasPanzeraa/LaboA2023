package src.Fechas;

public enum Turno {

    MAÑANA ("Mañana"),TARDE ("tarde"),NOCHE ("noche");
    private String horarioPartido;

    private Turno (String horarioPartido) {
        this.horarioPartido = horarioPartido;
    }

    public String getHorarioPartido() {
        return horarioPartido;
    }
}
