package src.Comida;

import java.util.HashSet;

public class Restaurante implements IRestaurante{
    private HashSet<Chef> chefs;
    private HashSet<Plato> menu;

    public Restaurante(HashSet<Chef> chefs, HashSet<Plato> menu) {
        this.chefs = chefs;
        this.menu = menu;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    @Override
    public void contratar(Chef chef) throws NoContratar {
        if (chef.getEdad()< 18 || chef.getHistorialTrabajo() == null){
            throw new NoContratar("no cumple los requisitos");
        }
        else {
            chefs.add(chef);
            chef.getHistorialTrabajo().add(this);
        }
    }

    @Override
    public void agregarPlato(Plato plato) throws NoAgregar {
        if (menu.contains(plato) || chefs.contains(plato.getChefACargo())){
            throw new NoAgregar("no cumple los requisitos");
        }

        else {
            menu.add(plato);
        }
    }
}
