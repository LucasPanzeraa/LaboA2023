public class Empleado {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado() {
        nombre = "Cooker";
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


        public class Oficial extends Operario{

            @Override
            public String toString() {
                return "Oficial{" +
                        "nombre='" + nombre + '\'' +
                        '}';
            }
        }


        public class Tecnicio{


        }
    }



