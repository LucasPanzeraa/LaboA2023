package src.Animales;

import src.Politica.Mensajeros;
import src.Politica.NombrePartido;

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
    public void enviarMensaje(NombrePartido nombre) {
        if (vuelaSola){
            System.out.println("Lanzando un papelito que dice: Vote por el partido" + nombre + "para un mejor futuro");
        }else {
            System.out.println("La paloma no aprendió a volar sola todavía");
        }
    }
}
