package poo;
import java.util.Scanner;

public class Uso_empleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Empleado emp = new Empleado("Julio Páez", 85.241, 2018, 3,25);

        Empleado emp_2 = new Empleado("Nicole Ruiz", 95.241, 2015, 7,18);

        emp.setSueldo(5);//el sueldo aumentará en (n%)
        emp_2.setSueldo(10);

        System.out.println(emp.getNombre() +" gana " + emp.getSueldo() + " dóllars " +
                " y tiene una fecha de alta de: " + emp.getAltaContrato());

        System.out.println(emp_2.getNombre() +" gana " + emp_2.getSueldo() + " dóllars " +
                " y tiene una fecha de alta de: " + emp_2.getAltaContrato());
        */
        Empleado[] empleados = new Empleado[3];

        System.out.println("Ingrese los datos de los empleados");
       for(int i = 0; i < empleados.length; i++){
           System.out.print("Ingrese el nombre del empleado: ");
           String nombre = entrada.nextLine();

           System.out.print("Ingrese el sueldo del empleado: ");
           double sueldo = entrada.nextDouble();

           System.out.print("Ingrese el año: ");
           int anio = entrada.nextInt();

           System.out.print("Ingrese el mes: ");
           int mes = entrada.nextInt();

           System.out.print("Ingrese el día: ");
           int dia = entrada.nextInt();

           empleados[i] = new Empleado(nombre, sueldo, anio, mes, dia);
           entrada.nextLine();//almaceno el enter pendiente
           System.out.println("\n");
       }


        System.out.println("\n Los empleados ingresados fueron");
       for(int i = 0; i < empleados.length; i++){
           empleados[i].mostrar_Datos();
       }



    }//fin del método de main
}
