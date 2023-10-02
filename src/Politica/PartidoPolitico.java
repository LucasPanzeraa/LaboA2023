package src.Politica;

import java.util.HashSet;

public class PartidoPolitico {

    private NombrePartido nombre;
    private Candidato candidato;
    private String direccionOficinaCentral;
    private int cantAfiliados;
    HashSet<Mensajeros> listaDeMensajeros;

    public PartidoPolitico( Candidato candidato) {
        this.nombre = candidato.getPartidoPolitico();
        this.candidato = candidato;
    }

    public PartidoPolitico(NombrePartido nombre, String direccionOficinaCentral, int cantAfiliados, HashSet<Mensajeros> listaDeMensajeros) {
        this.nombre = nombre;
        this.direccionOficinaCentral = direccionOficinaCentral;
        this.cantAfiliados = cantAfiliados;
        this.listaDeMensajeros = listaDeMensajeros;
    }

    public String getDireccionOficinaCentral() {
        return direccionOficinaCentral;
    }

    public void setDireccionOficinaCentral(String direccionOficinaCentral) {
        this.direccionOficinaCentral = direccionOficinaCentral;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajeros> getListaDeMensajeros() {
        return listaDeMensajeros;
    }

    public void setListaDeMensajeros(HashSet<Mensajeros> listaDeMensajeros) {
        this.listaDeMensajeros = listaDeMensajeros;
    }

    public PartidoPolitico() {
        nombre = NombrePartido.ELPOLIAVANZA;
        candidato = new Candidato();
    }

    public NombrePartido getNombre() {
        return nombre;
    }

    public void setNombre(NombrePartido nombre) {
        nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }


    public void agregarMensajero(Mensajeros mensajero){
        listaDeMensajeros.add(mensajero);
    }

    public void hacerPromocion (){
        for (Mensajeros mensajero : listaDeMensajeros){
            mensajero.enviarMensaje(nombre);
        }
    }

}
