import java.util.Scanner;

public class Ejecicio9 {
    public static void main(String[] args) {
        System.out.println("Igrese una palabra");
        Scanner entrada = new Scanner(System.in);
        String palabra;
        palabra = entrada.nextLine();


        System.out.println("Otra palabra");
        String segundaPalabra;
        segundaPalabra = entrada.nextLine();

        if (palabra.equals(segundaPalabra)){

            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras son distintas");
        }



    }
}
