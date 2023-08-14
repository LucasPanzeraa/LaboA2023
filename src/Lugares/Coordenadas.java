package src.Lugares;

public class Coordenadas {
    private int latitud;
    private int altitud;

    public Coordenadas(int latitud, int altitud) {
        this.latitud = latitud;
        this.altitud = altitud;
    }


    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }
}
