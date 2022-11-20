package poo;
import java.util.Scanner;

public class Uso_coche {

    //la clase principal es la que tiene el método de main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //instanciar
        //              new + <nombre constructor>
        Coche Renault = new Coche();

        //Me da error el sout porque ruedas está como private
        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
        //Renault.ruedas = 2; estoy modificando este objeto fuera de la clase coche




        //RUEDAS ESTÁ COMO PRIVATE ENTONCES USO EL MÉTODO GETTER
        System.out.println("Mi carro tiene " + Renault.getRuedas() + " ruedas");

        System.out.print("Ingrese el número de ruedas de su coche: ");
        int numero_ruedas = entrada.nextInt();

        Renault.setRuedas(numero_ruedas);//ahora ya no tiene 4 ruedas

        if( Renault.getRuedas() > 6){
            System.out.println("Tu auto ahora tiene " + Renault.getRuedas() + " ruedas y evolucionó a camión");
        }

        entrada.nextLine();
        System.out.print("\nDesea asientos de cuero: ");
        String asientos_de_cuero = entrada.nextLine();


        //Renault.setAsientos_cuero("si"); FUNCIONA
        Renault.setAsientos_cuero(asientos_de_cuero);
        System.out.println(Renault.getAsientoscuero());

        if(Renault.getAsientoscuero()){
            System.out.println("Tu auto tiene asientos de cuero");
        }else{
            System.out.println("Tu auto tiene asientos de fábrica");
        }


        System.out.print("\nDesea climatizador: ");
        String climatizador = entrada.nextLine();

        Renault.setClimatizador(climatizador);

        if(Renault.getClimatizador()){
            System.out.println("Tu auto tiene climatizador");
        }else{
            System.out.println("Tu auto no tiene climatizador");
        }

    }//fin del método de main

}
