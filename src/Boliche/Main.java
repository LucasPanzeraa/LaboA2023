package packageMartinBarbieri;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Bebedor bebedor = new Bebedor("juan","sampierri",46555120);
        Bebedor bebedor1 = new Bebedor("pepe","pepeer",46555340);
        Bebedor bebedor2 = new Bebedor("lukita","modric",46555340);

        Bebida bebida1 = new Neutra("agua",10,80);
        Bebida bebida2 = new Azucarada("cokcucha",10);
        Bebida bebida3= new Alcoholica("vodka",10);

        HashMap<Bebida, Integer>listadebebidas = new HashMap<>();
        HashSet<Bebedor>listadebebedor = new HashSet<>();

        listadebebidas.put(bebida2, 5);
        listadebebidas.put(bebida3, 2);
        listadebebidas.put(bebida1, 4);

        Sistema sistema = new Sistema(listadebebedor,listadebebidas);

        bebedor1.agregarBebida(bebida1, 3);
        bebedor1.agregarBebida(bebida2, 4);
        bebedor1.agregarBebida(bebida3, 5);
        bebedor1.agregarBebida(bebida2, 2);


        try {
            sistema.aniadirPersona("juan","sapmpieri",40523032);
        } catch (UsuarioDuplicado e) {
            throw new RuntimeException(e);
        }

        try {
            sistema.aniadirPersona("marco","pope",40523032);
        } catch (UsuarioDuplicado e) {
            throw new RuntimeException(e);
        }

        try {
            sistema.aniadirPersona("cirrin","zeballos",40523052);
        } catch (UsuarioDuplicado e) {
            throw new RuntimeException(e);
        }

        Bebedor mejorCoef = sistema.mejorCoeficiente();
        System.out.println(mejorCoef);

        Bebedor peroCoef = sistema.peorCoeficiente();
        System.out.println(peroCoef);

        sistema.beber(bebedor1,bebida1,10);
        sistema.beber(bebedor2,bebida2,1);
        sistema.beber(bebedor,bebida3,2);
        sistema.beber(bebedor1,bebida2,4);

        int hidratacion = bebedor1.coeficienteDeHidratacion();
        System.out.println();
        bebedor2.coeficienteDeHidratacion();
        bebedor.coeficienteDeHidratacion();

    }
}
