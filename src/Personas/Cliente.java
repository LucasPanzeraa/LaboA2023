package src.Personas;

public class Cliente extends Persona{
    private int cecular;

    public Cliente(String nombre, String apellido, int cecular) {
        super(nombre, apellido);
        this.cecular = cecular;
    }

    public int getCecular() {
        return cecular;
    }

    public void setCecular(int cecular) {
        this.cecular = cecular;
    }
}