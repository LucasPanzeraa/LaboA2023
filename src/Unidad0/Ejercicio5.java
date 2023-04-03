package src.Unidad0;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Ejercicio5 {
    public static void main(String[] args) {

        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        int contador = 0;
        String fraseMinuscula = toLowerCase(frase);


        for (int i = 0; i < frase.length(); i++ ){

            if (fraseMinuscula.charAt(i) == ('a') || fraseMinuscula.charAt(i) == ('e') || fraseMinuscula.charAt(i) == ('i') || fraseMinuscula.charAt(i) == ('o') || fraseMinuscula.charAt(i) == ('u')){

                contador++;
            }

        }
        System.out.println(contador);
    }
}
