package src.Sensores;

import java.util.Date;

public class DetectorDeHumo extends Alarma{

    public DetectorDeHumo(boolean estado, int media, Date añoDeAdquisicion, int valorDeUmbral) {
        super(estado, media, añoDeAdquisicion, valorDeUmbral);
    }

    @Override
    public void dispararAlarma(int media, int valorDeUmbral) {
        if (media > valorDeUmbral){
            System.out.println("Humo detectado, corre wachin");
        }
    }
}
