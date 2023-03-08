package Unidad0;

public class Ejercicio3 {
    public static void main(String[] args) {

        int contador = 1;
        int numerosDivisibles;


        System.out.println( "Los numeros del 1 al 100 divisible entre 2 y 3 son: ");

        while (contador<=100){

            if(contador%2 == 0 && contador%3 == 0){

                numerosDivisibles = contador;
                System.out.print( numerosDivisibles + " - ");
            }
            contador++;
        }



    }
}
