package src.Unidad0;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Ejercicio6 {
    public static void main(String[] args) {

        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        String fraseMinuscula = toLowerCase(frase);

        System.out.println("Introdusca una letra: ");
        Scanner entrada = new Scanner(System.in);
        String letraIngrsada;
        letraIngrsada = entrada.nextLine();

        char letra = (char) letraIngrsada.charAt(0);

        String fraseNueva = frase.replaceAll("e", String.valueOf(letra));


        System.out.println(fraseNueva);

    }
}
