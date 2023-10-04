package src;

import java.util.HashSet;

public class Sistema {
    private HashSet<Partido> listapartidos;

    private HashSet<Equipo> listaequipos;

    public HashSet<Partido> getListapartidos() {
        return listapartidos;
    }

    public void setListapartidos(HashSet<Partido> listapartidos) {
        this.listapartidos = listapartidos;
    }

    public HashSet<Equipo> getListaequipos() {
        return listaequipos;
    }

    public void setListaequipos(HashSet<Equipo> listaequipos) {
        this.listaequipos = listaequipos;
    }


}
