package src.Comida;

import src.Comida.Pedido;
import src.Comida.Plato;
import src.Personas.Alumno;
import src.Personas.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Alumno> listaDeAlumnos;
    private ArrayList<Profesor> listaDeProfesores;
    private ArrayList<Pedido> listaDePedidos;
    private ArrayList<Plato> listaDePlatos;


    public void verMenu(){

        System.out.println("que deceas modificar: ");
        System.out.println("1. Profesores");
        System.out.println("2. Alumnos");
        System.out.println("3. Platos");
        System.out.println("4. Pedidos");

        Scanner entrada = new Scanner(System.in);
        int opciones = entrada.nextInt();

        switch (opciones) {
            case (1):
                System.out.println("Que desea hacer: ");
                System.out.println("1. Agregar profesores");
                System.out.println("2. modificar profesor");
                System.out.println("3. Eliminar profesor");

                opciones = entrada.nextInt();
                String opcionString;

                switch (opciones) {
                    case (1):
                        listaDeProfesores.add(new Profesor());
                        break;
                    case (2):
                        System.out.println("INgrese el apellido del profesor a modificar");
                        opcionString = entrada.nextLine();
                        for (Profesor lista: listaDeProfesores) {
                            if (lista.getApellido() == opcionString){

                                System.out.println("Que desea modificar: ");
                                System.out.println("1. Cambiar nombre");
                                System.out.println("2. Cambiar apellido");
                                System.out.println("3. Cambiar descuento");

                                opciones = entrada.nextInt();
                                switch (opciones){
                                    case (1):
                                        System.out.println("Ingrese el nuevo nombre");
                                        opcionString = entrada.nextLine();
                                        lista.setNombre(opcionString);
                                    break;
                                    case(2):
                                        System.out.println("Ingrese el nuevo apellido");
                                        opcionString = entrada.nextLine();
                                        lista.setApellido(opcionString);
                                    break;
                                    case (3):
                                        System.out.println("Ingrese el nuevo descuento");
                                        opciones = entrada.nextInt();
                                        lista.setPorcentajeDeDescuento(opciones);
                                    break;
                                }
                            }
                        }
                    case (3):
                        System.out.println("Ingrese el apellido del profesor a eliminar");
                        opcionString = entrada.nextLine();
                        for (Profesor lista:listaDeProfesores) {
                            if(lista.getApellido() == opcionString) {

                                listaDeProfesores.remove(lista);
                            }
                        }
                }

        }
    }

}
