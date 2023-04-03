package src;
import java.util.ArrayList;

public class Partidos {

    int dia;
    String horarioPartido;
    ArrayList<CurlingEquipo>equiposDelPartido;


    public Partidos(int dia, String horario, ArrayList<CurlingEquipo> equiposDelPartido) {
        this.dia = dia;
        this.horarioPartido = horario;
        this.equiposDelPartido = equiposDelPartido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horarioPartido;
    }

    public void setHorario(String horario) {
        this.horarioPartido = horario;
    }

    public ArrayList<CurlingEquipo> getEquiposDelPartido() {
        return equiposDelPartido;
    }

    public void setEquiposDelPartido(ArrayList<CurlingEquipo> equiposDelPartido) {
        this.equiposDelPartido = equiposDelPartido;
    }

    public void DispocicionHoraria(CurlingEquipo equipo1, CurlingEquipo equipo2){

        for (int i = 0; i < equipo1.horarioMañana.size(); i ++){

            if(equipo1.horarioMañana.get(i) == equipo2.horarioMañana.get(i)){
                horarioPartido = "horarioMañana";
                dia = i;
                return;
            } else if (equipo1.horarioMediodia.get(i) == equipo2.horarioMediodia.get(i)) {
                horarioPartido = "horarioMediodia";
                dia = i;
                return;

            } else if (equipo1.horarioNoche.get(i) == equipo2.horarioNoche.get(i)) {
                horarioPartido = "HorarioNoche";
                dia = i;
                return;
            }
        }
    }


}
