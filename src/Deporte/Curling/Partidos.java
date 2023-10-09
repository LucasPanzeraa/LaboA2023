package src.Deporte.Curling;

public class Partidos {

    private CurlingEquipo equipo1;
    private CurlingEquipo equipo2;


    public Partidos(CurlingEquipo equipo1, CurlingEquipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public CurlingEquipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(CurlingEquipo equipo1) {
        this.equipo1 = equipo1;
    }

    public CurlingEquipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(CurlingEquipo equipo2) {
        this.equipo2 = equipo2;
    }


}
