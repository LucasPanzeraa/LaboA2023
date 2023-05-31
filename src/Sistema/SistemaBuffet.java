package src.Sistema;

import src.Comida.Pedido;
import src.Comida.Plato;
import src.Personas.Alumno;
import src.Personas.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBuffet {

    private ArrayList<Alumno> listaDeAlumnos;
    private ArrayList<Profesor> listaDeProfesores;
    private ArrayList<Pedido> listaDePedidos;
    private ArrayList<Plato> listaDePlatos;


    public void verMenu(){

        System.out.println("que deceas modificar: ");
        System.out.println("1. Profesores");
        System.out.println("2. Platos");
        System.out.println("3. Pedidos");

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
                        System.out.println("Ingrese el apellido del profesor a modificar");
                        opcionString = entrada.nextLine();
                        for (Profesor lista: listaDeProfesores) {
                            if (lista.getApellido().equals(opcionString)){

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
                            if(lista.getApellido().equals(opcionString)) {

                                listaDeProfesores.remove(lista);
                            }
                        }
                    break;
                }
            case (2):
                System.out.println("Que desea hacer: ");
                System.out.println("1. Agregar plato");
                System.out.println("2. modificar plato");
                System.out.println("3. Eliminar plato");

                opciones = entrada.nextInt();

                switch (opciones) {
                    case (1):
                        Plato plato = new Plato();
                    break;

                    case (2):
                        System.out.println("Ingrese el nombre del plato que decea modificar");
                        opcionString = entrada.nextLine();
                        for (Plato lista: listaDePlatos) {
                            if (lista.getNombre().equals(opcionString)){

                                System.out.println("Que desea modificar: ");
                                System.out.println("1. Cambiar nombre");
                                System.out.println("2. Cambiar precio");

                                opciones = entrada.nextInt();
                                switch (opciones){
                                    case (1):
                                        System.out.println("Ingrese el nuevo nombre");
                                        opcionString = entrada.nextLine();
                                        lista.setNombre(opcionString);
                                        break;
                                    case(2):
                                        System.out.println("Ingrese el nuevo precio");
                                        opciones = entrada.nextInt();
                                        lista.setPrecio(opciones);
                                    break;
                                }
                            }
                        }
                    case (3):
                        System.out.println("Ingrese el nombre del plato a eliminar");
                        opcionString = entrada.nextLine();
                        for (Plato lista:listaDePlatos) {
                            if(lista.getNombre().equals(opcionString)) {
                                listaDePlatos.remove(lista);
                            }
                        }
                    break;
                }
            case (3):
                System.out.println("Que desea hacer: ");
                System.out.println("1. Agregar pedido");
                System.out.println("2. modificar pedido");
                System.out.println("3. Eliminar pedido");

                opciones = entrada.nextInt();

                switch (opciones) {
                    case (1):
                        Pedido pedido = new Pedido();
                    break;

                    case (2):
                        System.out.println("Ingrese el id del pedido que decea modificar");
                        opciones = entrada.nextInt();
                        for (Pedido lista: listaDePedidos) {
                            if (lista.getIdPedido() == opciones){

                                System.out.println("Que desea modificar: ");
                                System.out.println("1. Cambiar plato");
                                System.out.println("2. Cambiar hora de entrega");

                                opciones = entrada.nextInt();
                                switch (opciones){
                                    case (1):
                                        System.out.println("Ingrese el nuevo plato");
                                        lista.setPlato(new Plato());
                                    break;

                                    case(2):
                                        System.out.println("Ingrese la hora de entrega");
                                        double opcione = entrada.nextDouble();
                                        lista.setHoraDeEntrega(opcione);
                                    break;
                                }
                            }
                        }
                    break;

                    case (3):
                        System.out.println("Ingrese el id del pedido a eliminar");
                        opciones = entrada.nextInt();
                        for (Pedido lista:listaDePedidos) {
                            if(lista.getIdPedido() == opciones) {
                                listaDePedidos.remove(lista);
                            }
                        }
                    break;
                }
            break;
        }
    }
}
