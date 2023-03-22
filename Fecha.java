public class Fecha {

    private int dia;
    private int mes;
    private int anio;



    public Fecha() {
        this.dia = 26;
        this.mes = 4;
        this.anio = 2006;
    }

    public void validar(){
        if (anio < 1000 || anio > 3000){
            this.anio = 1900;
        }
        else if (mes < 1 || mes > 12){
            this.mes = 1;
        }
        else if (mes == 2 && dia > 28 || dia < 0){
            this.dia = 1;
        }
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia > 31 || dia < 1) {
                this.dia = 1;
            }
        }
        else{
            if(dia > 30 || dia < 1){
                this.dia = 1;
            }
        }
        System.out.println("La fecha es correcta: " + dia +"-"+ mes +"-"+ anio);


    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        validar();
    }

    void diaMes(int mes){

        if(mes > 12 || mes < 1){
            System.out.println("El mes ingreado no es posible");
        }
        else if (mes == 2){
            System.out.println("el mes " + mes + " tiene 28 dias");
        }
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("el mes " + mes + " tiene 31 dias");
        }
        else{
            System.out.println("el mes " + mes + " tiene 30 dias");
        }

    }


    void corto(){
        System.out.println(this.dia + "-" + this.mes + "-" + this.anio);
    }

    void largo(){

        String mesString = "MesNoPosible" ;

        switch (mes){
            case 1:
                mesString = "Enero";

            case 2:
                mesString = "Febrero";

            case 3:
                mesString = "Marzo";

            case 4:
                mesString = "Abril";

            case 5:
                mesString = "Mayo";

            case 6:
                mesString = "Junio";

            case 7:
                mesString = "Julio";

            case 8:
                mesString = "Agosto";

            case 9:
                mesString = "Septiembre";

            case 10:
                mesString = "Octubre";

            case 11:
                mesString = "Noviembre";

            case 12:
                mesString = "Diciembre";
        }

        System.out.println(this.dia +" de "+mesString+" del "+this.anio);
    }

    void siguiente(){

        dia ++;

        if (mes == 2){
            if (dia > 28){
                dia = 0;
                mes ++;
            }
        }
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia > 31){
                dia = 0;
                mes ++;
            }
        }
        else{
            if (dia > 30){
                mes ++;
                dia = 0;
            }
        }

        if(mes == 13 ){
            mes = 0;
            anio ++;
        }
        System.out.println(dia +"-"+ mes +"-"+ anio);
    }

    void anterior(){


        dia --;

        if (mes == 3){
            if (dia < 1){
                dia = 28;
                mes --;
            }
            else {
                dia --;
            }
        }
        else if (mes == 1 || mes == 2 || mes == 4 || mes == 6 || mes == 8 || mes == 9 || mes == 11){
            if (dia > 1){
                dia = 31;
                mes --;
            }else {
                dia --;
            }
        }
        else{
            if (dia > 1){

                dia = 30;
                mes --;
            }else {
                dia --;
            }
        }

        if(mes == 0 ){
            mes = 12;
            anio --;
        }
        System.out.println(dia +"-"+ mes +"-"+ anio);
    }

    void igualQue(Fecha fecha){
        if (fecha.dia == this.dia){
            if(fecha.mes == this.mes){
                if (fecha.anio == this.anio){
                    System.out.println("las fechas son iguales");
                }
                else{
                    System.out.println("Las fechas no son iguales");
                }
            }else{
                System.out.println("Las fechas no son iguales");
            }
        }else {
            System.out.println("Las fechas no son iguales");
        }
    }

    boolean menorQue (Fecha fecha) {
        boolean anterior;

        if (this.anio < fecha.anio) {
            anterior = true;

        } else if (this.anio == fecha.anio) {
            if (this.mes < fecha.mes) {
                anterior = true;

            } else if (this.mes == fecha.mes) {
                if(this.dia < fecha.dia){

                    anterior = true;

                }else if (this.dia == fecha.dia){
                    anterior = false;

                }else{
                    anterior = false;
                }

            }else {
                anterior = false;
            }

        }else{
            anterior = false;
        }
        return anterior;
    }

    void mayorQue (Fecha fecha) {

        if (this.anio > fecha.anio) {
            System.out.println("La fecha es mayor a la ingresada");

        } else if (this.anio == fecha.anio) {
            if (this.mes > fecha.mes) {
                System.out.println("La fecha es mayor a la ingresada");

            } else if (this.mes == fecha.mes) {
                if(this.dia > fecha.dia){
                    System.out.println("La fecha es mayor a la ingresada");

                }else if (this.dia == fecha.dia){
                    System.out.println("La fecha no es mayor a la ingresada");

                }else{
                    System.out.println("La fecha no es mayor a la ingresada");
                }

            }else {
                System.out.println("La fecha no es mayor a la ingresada");
            }

        }else{
            System.out.println("La fecha no es mayor a la ingresada");
        }
    }

}
