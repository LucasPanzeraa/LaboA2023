package src.ManejoDeExcepciones;

public class manejoDeExcepcion {

    public static void largoDelNombre(String nombre) throws Exception{
            System.out.println("El largo del nombre es:"+ nombre.length());
    }

    public static void main(String[] args) throws Exception {

        //try/catch
        try{
            String nombre = null;
            System.out.println("El largo del nombre es:"+ nombre.length());
        }catch (NullPointerException e){
            System.out.println("Lucas");
        }

        // throw
        try{
            String nombre = null;
            if (nombre == null){
                throw new NullPointerException("Lucas");
            }
            System.out.println("El largo del nombre es:"+ nombre.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }

        //throws
        try{
            largoDelNombre(null);
        } catch (Exception e) {
            System.out.println("Lucas");
        }

        // Clase personalizada
        try{
            largoDelNombre(null);
        }catch (NombreNulo e){
            System.out.println("Lucas");
        }
    }
}
