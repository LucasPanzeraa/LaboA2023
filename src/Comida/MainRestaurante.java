package src.Comida;

import java.util.HashSet;

public class MainRestaurante {
    public static void main(String[] args) throws NoAgregar, NoContratar {
        HashSet<Restaurante> historialPanzera = new HashSet<>();

        Chef chef = new Chef("Lucas", "Panzera", 434653643, 17, historialPanzera);
        HashSet<Chef> chefs = new HashSet<>();

        Plato plato = new Plato("polloBagu", "solo Pollo", 12, TipoPlato.PLATOPRINCIPAL, chef);
        HashSet<Plato> menu = new HashSet<>();

        Restaurante restaurante = new Restaurante(chefs, menu);

        restaurante.agregarPlato(plato);
        restaurante.contratar(chef);
    }
}
