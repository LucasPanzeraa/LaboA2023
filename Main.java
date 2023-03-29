public class Main {

    public static void main(String[] args) {

        CD cd = new CD();
        cd.getCanciones().add(new Cancion("hola", "gordo"));
        cd.getCanciones().add(new Cancion("como", "juancho"));
        cd.getCanciones().add(new Cancion("dale", "panchis"));

        cd.grabaCancion(2, new Cancion("chucha", "cook"));

        System.out.println(cd);
    }
}
