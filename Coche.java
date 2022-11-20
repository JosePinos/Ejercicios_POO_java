package poo;

public class Coche {

    //características de la plataforma del coche
    //solo deberían ser mofificadas dentro de esta clase
    //con private "encapsulo a ese atributo" y solo se puede
    // modificar dentro de la clase Coche

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;


    /*CONSTRUCTOR*/
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }


    //getter me devuelve el valor de esa propiedad
    public int getRuedas(){
        return ruedas;
    }

    //setter establece el valor de la propiedad
    public void setRuedas(int numero_ruedas){
        ruedas = numero_ruedas;
    }

    //el nombre del argumento es igual al nombre del atributo
    public void setAsientos_cuero(String asientos_cuero){
        //this.atributo<variable de la clase> en el caso de que el nombre del parámetro es igual al del atributo

        if( asientos_cuero.equals("si") || asientos_cuero.equals("Si")){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }

    }

    public boolean getAsientoscuero(){
        return asientos_cuero;
    }


    public void setClimatizador(String climatizador){
        if( climatizador.equals("si") || climatizador.equals("Si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public boolean getClimatizador(){
        return climatizador;
    }


}//FIN DE LA CLASE COCHE
