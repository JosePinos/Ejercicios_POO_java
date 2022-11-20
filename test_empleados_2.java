package poo;

import java.util.Scanner;

public class test_empleados_2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Empleado[] trabajadores = new Empleado[4];
        for(int i = 0; i < trabajadores.length; ++i){
            trabajadores[i] = new Empleado(" ",2489.9,1,1,1);
        }
        System.out.println("\n\tIngrese los " +
                "datos de los empleados\n");


        for(int i = 0; i < 4; ++i){
            String nombre_aux = " ";
            System.out.print("Ingrese su nombre: ");
            nombre_aux = entrada.nextLine();

            System.out.print("Ingrese su sueldo: ");
            double sueldo_aux = entrada.nextDouble();

            entrada.nextLine();
            trabajadores[i].setNombre( nombre_aux );
            trabajadores[i].setSueldo( sueldo_aux );
            System.out.println("\n---------------------------------------------\n");
        }



        System.out.println();
        for(int i = 0; i < 4; i++){
            System.out.println("\tEMPLEADO "+ i+1);
            System.out.println("Nombre: "+trabajadores[i].getNombre());
            System.out.println("Sueldo: "+trabajadores[i].getSueldo());

            System.out.println("\n---------------------------------------------\n");
        }











    }//fin de main
}
