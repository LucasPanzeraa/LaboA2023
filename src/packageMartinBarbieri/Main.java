package packageMartinBarbieri;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String args[]){

        Bebedor bebedor=new Bebedor("franco","hernandez",46443145);
        Bebedor bebedor2=new Bebedor("julian","alvarez",32470145);
        Bebedor bebedor3=new Bebedor("ian","cuker",45103145);

        Alcoholica bebidaAlcoholica =new Alcoholica("ferno",49);
        Azucarada bebidaAzucarada =new Azucarada("juguito",10);
        Neutra bebidaNeutra =new Neutra("agua",0,20);

        HashMap<Bebida, Integer> listaDeBebidas=new HashMap<>();
        listaDeBebidas.put(bebidaAlcoholica,2);
        listaDeBebidas.put(bebidaAzucarada,5);
        listaDeBebidas.put(bebidaNeutra,10);

        HashSet<Bebedor> listaDeBorachos=new HashSet<>();
        listaDeBorachos.add(bebedor);
        listaDeBorachos.add(bebedor2);
        listaDeBorachos.add(bebedor3);

        Sistema s1=new Sistema(listaDeBorachos, listaDeBebidas);


        try {
            s1.aniadirPersona("ian","cuker",45103145);
        } catch (UsuarioDuplicado e) {
            System.out.println(e.getMessage());
        }


        s1.beber(bebedor,bebidaNeutra,3);
        s1.beber(bebedor,bebidaAlcoholica,2);


        System.out.println();
        System.out.println(bebedor.coeficienteDeHidratacion());


        System.out.println();
        System.out.println("El Bebedor " + s1.mejorCoeficiente().getNombre() + " es el que mayor hidratacion tiene con un valor de: "+ s1.mejorCoeficiente().coeficienteDeHidratacion());
        System.out.println();
        System.out.println("El Bebedor " + s1.peorCoeficiente().getNombre() + " es el que menor hidratacion tiene con un valor de: "+ s1.peorCoeficiente().coeficienteDeHidratacion());
    }
}