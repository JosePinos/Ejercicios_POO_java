package poo;

public class Fecha {

    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia){
        if(anio >= 0){
            this.anio = anio;
        }
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }

        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }

    }


    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio >= 0){
            this.anio = anio;
        }

    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }

    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }

    }


    public void mostrar_fecha(){
        System.out.println(getAnio() + "/" + getMes() + "/" + getDia());
    }


}//fin de la clase fecha
