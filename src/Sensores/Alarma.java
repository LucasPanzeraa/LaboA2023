package src.Sensores;

import java.util.Date;

public class Alarma {

    private boolean estado;
    private int media;
    private Date añoDeAdquisicion;
    private int valorDeUmbral;

    public Alarma(boolean estado, int media, Date añoDeAdquisicion, int valorDeUmbral) {
        this.estado = estado;
        this.media = media;
        this.añoDeAdquisicion = añoDeAdquisicion;
        this.valorDeUmbral = valorDeUmbral;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public Date getAñoDeAdquisicion() {
        return añoDeAdquisicion;
    }

    public void setAñoDeAdquisicion(Date añoDeAdquisicion) {
        this.añoDeAdquisicion = añoDeAdquisicion;
    }

    public int getValorDeUmbral() {
        return valorDeUmbral;
    }

    public void setValorDeUmbral(int valorDeUmbral) {
        this.valorDeUmbral = valorDeUmbral;
    }


    public void mensajeDeAlarma(){

    }

    public void dispararAlarma(){
        if(media > valorDeUmbral){
            mensajeDeAlarma();
        }
    }

}
