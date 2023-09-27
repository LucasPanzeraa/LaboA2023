package src.Animales;

import src.Politica.Mensajeros;

public class PalomaMensajera extends Ave implements Mensajeros {

    private boolean vuelaSola;

    public PalomaMensajera(String color, String nombre, String especie, boolean vuelaSola) {
        super(color, nombre, especie);
        this.vuelaSola = vuelaSola;
    }

    public boolean isVuelaSola() {
        return vuelaSola;
    }

    public void setVuelaSola(boolean vuelaSola) {
        this.vuelaSola = vuelaSola;
    }

    @Override
    public void enviarMensaje() {

    }
}
