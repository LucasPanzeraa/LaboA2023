package Unidad0;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int contador = 0;
        int mayorNumero = 0;
        int menorNumero = 0;
        int sumaPositivos = 0;
        int sumaNegativios = 0;
        int sumaTotal = 0;

        System.out.println("Ingrese distintos numeros");

        Scanner entrada = new Scanner(System.in);
        int numeros = 0;

        while (numeros  != -1){

            numeros = entrada.nextInt();
            contador ++;
            sumaTotal =+ numeros;

            if(numeros > mayorNumero){
                mayorNumero = numeros;
            }
            if(numeros > menorNumero){
                menorNumero = numeros;
            }
            if (numeros % 2 == 0){
                sumaPositivos =+ numeros;
            }else {
                sumaNegativios =+ numeros;
            }
        }

        System.out.println("La cantidad de numreos ingresados son: " + contador);
        System.out.println("La suma tota");

    }
}
