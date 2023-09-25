package src.Intercambios;

import sun.awt.im.InputMethodWindow;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class MainIntercambio {
    public static void main(String[] args) {

        HashMap<Integer, Integer> paginasPorCapitulo = new HashMap<Integer, Integer>();
        paginasPorCapitulo.put(1, 20);
        paginasPorCapitulo.put(2, 30);

        Prestable prestable = new Pantalon("rojo", Materiales.ALGODON, "Gucci", "buen estado", 10, 10, 10);
        Prestable prestable2 = new Remera("Azul", Materiales.POLIESTER, "Prada", "buen estado", 10, 10, 10);
        Prestable prestable3 = new Campera("Negro", Materiales.SEDA, "LV", "roto");
        Prestable prestable4 = new LibroEscrito(1, "farenheit 451", 2011, paginasPorCapitulo);
        Prestable prestable5 = new Revista(2, "New sport", 2023, LocalDateTime.now());

        HashSet<Prestable> listaDePrestable = new HashSet<>();

        SistemaIntercambios sistemaIntercambios = new SistemaIntercambios(listaDePrestable);

        sistemaIntercambios.agregarElemento(prestable);
        sistemaIntercambios.agregarElemento(prestable2);
        sistemaIntercambios.agregarElemento(prestable3);
        sistemaIntercambios.agregarElemento(prestable4);
        sistemaIntercambios.agregarElemento(prestable5);

        HashSet<Prestable> prestablesColeccionista = new HashSet<>();
        Prestable prestable6 = new Campera("Blanco", Materiales.POLIESTER, "LV", "buen estado");
        prestablesColeccionista.add(prestable6);

        HashSet<Prestable> prestablesColeccionista2 = new HashSet<>();
        Prestable prestable7 = new Campera("Violeta", Materiales.SEDA, "Gucci", "buen estado");
        Coleccionista coleccionista = new Coleccionista("Lucas", prestablesColeccionista);

        Coleccionista coleccionista2 = new Coleccionista("Juan", prestablesColeccionista2);

        sistemaIntercambios.prestarAColeccionista(prestable, coleccionista);

        sistemaIntercambios.ColeccionistaAColeccionista(prestable, coleccionista, coleccionista2);

        System.out.println(sistemaIntercambios.getListaPrestables());
        System.out.println(coleccionista.getListaDePrestables());
        System.out.println(coleccionista2.getListaDePrestables());
    }
}
