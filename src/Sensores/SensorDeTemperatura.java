package src.Sensores;

import java.util.Date;

public class SensorDeTemperatura extends Alarma{

    public SensorDeTemperatura(boolean estado, int media, Date añoDeAdquisicion, int valorDeUmbral) {
        super(estado, media, añoDeAdquisicion, valorDeUmbral);
    }

    @Override
    public void mensajeDeAlarma() {
        System.out.println("¡Cuidado! La temperatura sube" );
    }
}
