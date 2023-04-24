package src.SistemaDeComputadoras;

public class Perisfericos extends Componente{
    private int puertosValidos;


    public Perisfericos(int puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public int getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(int puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}
