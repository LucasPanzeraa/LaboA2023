import java.util.ArrayList;

public class CD {

    ArrayList<Cancion>CD;

    public CD() {

        CD.add(new Cancion("goteo", "Duki"));
        CD.add(new Cancion("sapo Pepe", "Topa"));
        CD.add(new Cancion("silbando", "ysy A"));
        CD.add(new Cancion("gordobobo", "cuker"));
    }

    public ArrayList<Cancion> getCD() {
        return CD;
    }

    public void setCD(ArrayList<Cancion> CD) {
        this.CD = CD;
    }

    public int numeroCanciones(){

        int cantidadCanciones = 0;
        for(int i = 0; i < CD.size(); i++){
            cantidadCanciones ++;
        }
        return cantidadCanciones;
    }

    public static void main(String[] args) {

        
    }
}
