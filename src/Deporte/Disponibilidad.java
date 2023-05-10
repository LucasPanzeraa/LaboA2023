package src.Deporte;
import src.Fechas.Dia;
import src.Fechas.Turno;

public class Disponibilidad {

    private Turno turno;
    private Dia dia;

    public void DisposicionHoraria(CurlingEquipo equipo1, CurlingEquipo equipo2){

        for (int i = 0; i < equipo1.horarioMañana.size(); i ++){

            if (equipo1.horarioMañana.get(i).equals(true)  && equipo2.horarioMañana.get(i).equals(true)){

                horarioPartido = "mañana";
                dia = i;
                return;
            }
        }

        for (int i = 0; i < equipo1.horarioMediodia.size(); i ++){

            if (equipo1.horarioMediodia.get(i).equals(true)  && equipo2.horarioMediodia.get(i).equals(true)){
                horarioPartido = "mediodia";
                dia = i;
                return;
            }
        }

        for (int i = 0; i < equipo1.horarioNoche.size(); i ++){

            if (equipo1.horarioNoche.get(i).equals(true)  && equipo2.horarioNoche.get(i).equals(true)){

                horarioPartido = "noche";
                dia = i;
                return;
            }
        }
    }



}
