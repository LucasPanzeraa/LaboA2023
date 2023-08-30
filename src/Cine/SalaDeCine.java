package src.Cine;

public class SalaDeCine {
    private static int contador = 0;
    private int id;
    private static int numeroDeButaca = 45;



    public SalaDeCine() {
        contador ++;
        id = contador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        SalaDeCine.contador = contador;
    }

    public static void setNumeroDeButaca(int numeroDeButaca) {
        SalaDeCine.numeroDeButaca = numeroDeButaca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumeroDeButaca() {
        return numeroDeButaca;
    }
}
