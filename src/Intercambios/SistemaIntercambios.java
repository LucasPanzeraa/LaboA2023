package src.Intercambios;

import java.util.HashSet;

public class SistemaIntercambios {

    private HashSet<Prestable>listaPrestables;

    public SistemaIntercambios(HashSet<Prestable> listaPrestables) {
        this.listaPrestables = listaPrestables;
    }

    public HashSet<Prestable> getListaPrestables() {
        return listaPrestables;
    }

    public void setListaPrestables(HashSet<Prestable> listaPrestables) {
        this.listaPrestables = listaPrestables;
    }

    public void agregarElemento(Prestable prestable) {
        if (prestable.agregarElemento()) {
            getListaPrestables().add(prestable);
        }
    }

    public void prestarAColeccionista (Prestable prestable, Coleccionista coleccionista){
        if (prestable.prestar()){
            coleccionista.getListaDePrestables().add(prestable);
        }
    }

    public void ColeccionistaAColeccionista (Prestable prestable, Coleccionista vendedor, Coleccionista comprador){
        if (prestable.prestar() && vendedor.verificarElemento(prestable)){
            vendedor.getListaDePrestables().remove(prestable);
            comprador.getListaDePrestables().add(prestable);
            System.out.println("El cambio se realizo correctamente");
        }
        else {
            System.out.println("No se puede realizar el cambio");
        }
    }
}
