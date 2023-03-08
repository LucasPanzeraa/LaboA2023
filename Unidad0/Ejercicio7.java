package Unidad0;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int contador = 0;
        System.out.println("Ingrese distintos numeros");

        Scanner entrada = new Scanner(System.in);
        int numeros = 0;

        while (numeros  != -1){
            numeros = entrada.nextInt();
            contador ++;
        }

        System.out.println("La cantidad de numreos ingresados son: " + contador);
    }
}
