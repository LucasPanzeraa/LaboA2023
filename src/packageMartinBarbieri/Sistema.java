package packageMartinBarbieri;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

    private HashSet<Bebedor>bebedores;
    private HashMap<Bebida,Integer>bebidas;

    public Sistema(HashSet<Bebedor> bebedores, HashMap<Bebida,Integer> bebidas) {
        this.bebedores = bebedores;
        this.bebidas = bebidas;
    }

    public Sistema() {
        this.bebedores = new HashSet<>();
        this.bebidas = new HashMap<>();
    }

    public void aniadirPersona(String nombre, String apellido, int dni) throws UsuarioDuplicado{
        for(Bebedor b: bebedores){
            if(b.getDNI() == dni){
                throw new UsuarioDuplicado("Ya existe el usuario en el sistema");
            }
        }
        bebedores.add(new Bebedor(nombre,apellido,dni));
    }
    public Bebedor mejorCoeficiente(){
        if(bebedores.size()==0){
            throw new NullPointerException("No hay bebedores registrados");
        } else{
        Bebedor bebedorMejor = null;
        for(Bebedor b:bebedores){
            if(bebedorMejor.equals(null) || b.coeficienteDeHidratacion()>bebedorMejor.coeficienteDeHidratacion()){
                bebedorMejor = b;
            }
        }
        return bebedorMejor;
    }}

    public Bebedor peorCoeficiente(){
        if(bebedores.size()==0){
            throw new NullPointerException("No hay bebedores registrados");
        } else{
        Bebedor bebedorPeor = null;
        for(Bebedor b:bebedores){
            if(bebedorPeor.equals(null) || b.coeficienteDeHidratacion()<bebedorPeor.coeficienteDeHidratacion()){
                bebedorPeor = b;
            }
        }
        return bebedorPeor;}
    }

    public void verificarUsuario(Bebedor b) throws UsuarioInexistente
    {
        if(!bebedores.contains(b)){
            throw new UsuarioInexistente("No está registardo en el sistema");
        }
    }
    public void verificarStock(Bebida b, int c) throws StockInsuficiente
    {
        if(bebidas.get(b)<c){
            throw new StockInsuficiente("No tenemos esa cantidad de bebidas");
        }
    }
    public void verificarBebida(Bebida b) throws BebidaInexistente
    {
        if(!bebidas.containsKey(b)){
            throw new BebidaInexistente("No tenemos esa bebida");
        }
    }
    public void actualizarStock(Bebida b, int c)
    {
       bebidas.put(b, bebidas.get(b)-c);
    }
    public void beber(Bebedor b, Bebida bebida, int cant){
        try {
            verificarUsuario(b);
            verificarBebida(bebida);
            verificarStock(bebida, cant);
            actualizarStock(bebida, cant);
            b.agregarBebida(bebida,cant);

        } catch (StockInsuficiente e) {
            e.getMessage();
        }
        catch (UsuarioInexistente e) {
            e.getMessage();
        }
        catch (BebidaInexistente e) {
            e.getMessage();
        }
    }

}
