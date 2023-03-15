import java.util.Scanner;

public class fecha {

    private int dia;
    private int mes;
    private int anio;

    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        public int validar(){
            if (anio < 1000 || anio > 3000){
                this.anio = 1900;
            }
            if (mes < 1 || mes > 12){
                this.mes = 1;
            }
            if (mes == 2 && dia > 28 || dia < 0){
                this.dia = 1;
            }
            if (mes == 1 || 3 || 5 || 7 || 8 || 10 || 12)
                if (dia > 31 || dia < 1) {
                this.dia =  1;
            }
        }
    }

    public fecha() {
        this.dia = 26;
        this.mes = 4;
        this.anio = 2006;
    }


}
