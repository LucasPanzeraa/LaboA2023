package src.Sensores;

import java.util.ArrayList;

public class SensorComplejo {

    private ArrayList<Alarma>listaAlarma;
    private int valorDeUmbral;

    public SensorComplejo(ArrayList<Alarma> listaAlarma, int valorDeUmbral) {
        this.listaAlarma = listaAlarma;
        this.valorDeUmbral = valorDeUmbral;
    }

    public int getValorDeUmbral() {
        return valorDeUmbral;
    }

    public void setValorDeUmbral(int valorDeUmbral) {
        this.valorDeUmbral = valorDeUmbral;
    }

    public ArrayList<Alarma> getListaAlarma() {
        return listaAlarma;
    }

    public void setListaAlarma(ArrayList<Alarma> listaAlarma) {
        this.listaAlarma = listaAlarma;
    }

    public int valorMedio(){
        int valorMedio = 0;
        for (Alarma alarma:listaAlarma) {
            valorMedio = valorMedio + alarma.getMedia();
        }
        valorMedio = valorMedio * listaAlarma.size() /100;
        return valorMedio;
    }

    public void verificarAlarma(){
        int valorMedio = valorMedio();
        if (valorMedio > valorDeUmbral){
            System.out.println("El valor medio esta por las nubes");
        }
    }
}
