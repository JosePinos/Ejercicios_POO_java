package poo;
import java.util.Scanner;
public class uso_Estudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 1;
        Estudiante[] alumnos = new Estudiante[2];
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Estudiante();//se inicializan con el constructor por defecto
        }

        while(opcion != 3){

            opcion = Menu();
            switch (opcion){

                case 1:{
                    System.out.println("\n\tAgregar estudiante\n");
                    System.out.println("Ingrese los datos de los estudiantes");

                    for(int i = 0; i < alumnos.length; i++){

                        //entrada.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        String nombre = entrada.nextLine();

                        System.out.print("Ingrese la edad: ");
                        byte edad = entrada.nextByte();

                        entrada.nextLine();
                        System.out.print("Ingrese la carrera: ");
                        String carrera = entrada.nextLine();

                        System.out.print("Ingrese el promedio de la carrera: ");
                        int promedio = entrada.nextInt();
                        entrada.nextLine();

                        alumnos[i].setNombre(nombre);
                        alumnos[i].setEdad(edad);
                        alumnos[i].setCarrera(carrera);
                        alumnos[i].setPromedio(promedio);

                        System.out.println("\n\n*******************************************\n\n");

                    }
                }
                break;

                case 2:{
                    System.out.println("\tDatos de los alumnos");
                    for(int i = 0; i < alumnos.length; i++){
                        alumnos[i].resumen_Berklee();
                    }
                }
                break;

                case 3:{
                    System.out.println("Vuelva Pronto :)");
                }
                break;

                default:{
                    System.out.println("Algo ha salido muy mal");
                }
                break;

            }//fin del switch
            System.out.println("\n\n");
        }//fin del while principal


    }//FIN DEL MÉTODO DE MAIN


    public static int Menu(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tBerklee College of Music");
        System.out.println("\tMenú");
        System.out.println("1) Agregar alumnos");
        System.out.println("2) Mostrar alumnos");
        System.out.println("3) Salir");
        System.out.print(">");
        opcion = sc.nextInt();

        while(opcion <1 || opcion > 3){
            System.out.println("Ingrese una opción válida");
            System.out.print(">");
            opcion = sc.nextInt();
        }
        System.out.println();

        return opcion;
    }///FIN DE LA FUNCIÓN MENU

}


