package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Boolean>> matriz = new ArrayList<>();
        ArrayList<Boolean> fila = new ArrayList<>();
        ArrayList<Boolean> fila2 = new ArrayList<>();
        ArrayList<Boolean> fila3 = new ArrayList<>();

        fila.add(true);
        fila.add(true);
        fila.add(true);
        fila.add(true);

        fila2.add(false);
        fila2.add(false);
        fila2.add(false);
        fila2.add(false);

        fila3.add(true);
        fila3.add(true);
        fila3.add(true);
        fila3.add(true);

        matriz.add(fila);
        matriz.add(fila2);
        matriz.add(fila3);

        ArrayList <Boolean> filaDiferente = new ArrayList<>();





        int contadorFalse = 0;
        for (int i = 0; i < fila.size(); i++) {
            for(int j = 0; j < matriz.size(); i++){
                if(matriz.get(i).get(j) == false){
                    contadorFalse ++;
                }
            }
            if (contadorFalse%2 == 0){
                filaDiferente.add(false);
            }
            else {
                filaDiferente.add(true);
            }
        }


    }
}