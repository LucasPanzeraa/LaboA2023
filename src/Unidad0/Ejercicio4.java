package src.Unidad0;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Ingrese un dia y le diremos si es laboral o no: ");

        Scanner entrada = new Scanner(System.in);
        String dia;
        dia = entrada.nextLine();

        if (dia.equals("Sabado") || dia.equals("Domingo")){
            System.out.println("El dia ingresado es no Laboral");
        }else {
            System.out.println("El dia ingresado es laboral");
        }

    }
}
