package src.Sensores;

import java.util.Date;

public class DetectorDeHumo extends Alarma{

    public DetectorDeHumo(boolean estado, int media, Date añoDeAdquisicion, int valorDeUmbral) {
        super(estado, media, añoDeAdquisicion, valorDeUmbral);
    }

    @Override
    public void mensajeDeAlarma() {
        System.out.println("Sensor de humo activado: Llamando a los bomberos");
    }
}
