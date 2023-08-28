package src.Personas;

import src.Personas.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroLetraPersona {

    public static void main(String[] args) {

        //Ejercicio1
        ArrayList <Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        int suma = 0;


        for (int numero: numeros) {
            suma= suma + numero;
        }


        //Ejercicio2
        ArrayList <String> palabras = new ArrayList<String>();

        palabras.add("arbol");
        palabras.add("palo");
        palabras.add("mantis");
        palabras.add("lamanoarriba");
        palabras.add("gordo");
        palabras.add("bool");
        palabras.add("vaca");
        palabras.add("volver");

        char letra = 'v';
        String palabrasElegidas = " ";

        for (String palabra: palabras) {

            if (palabra.charAt(0) == letra){

                palabrasElegidas = palabrasElegidas + " - " + palabra;
            }
        }

        // Ejercicio 3
        ArrayList<Persona> personas=new ArrayList<Persona>();

        System.out.println("Ingrese cuantas personas hay: ");

        Scanner entrada = new Scanner(System.in);
        int cantidadPersonas;
        cantidadPersonas = entrada.nextInt();

        System.out.println("Ingrese solo el nombre no el apellido, dale al enter y pone la edad: ");

        String personasMas30 = " ";

        for (Persona persona : personas){

            if (persona.getEdad() > 30){

                   personasMas30 = personasMas30 + " " + persona.getNombre();
            }
        }
        System.out.println(personasMas30);
    }
}
