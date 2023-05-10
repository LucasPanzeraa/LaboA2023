package src.Sensores;

import java.util.Date;

public class SensorDePresion extends Alarma{

    public SensorDePresion(boolean estado, int media, Date añoDeAdquisicion, int valorDeUmbral) {
        super(estado, media, añoDeAdquisicion, valorDeUmbral);
    }

    @Override
    public void mensajeDeAlarma() {
        System.out.println( "Sensor de presión activado");
    }
}
