package poo;
import javax.swing.JOptionPane;
public class uso_fecha {

    public static void main(String[] args) {


    Fecha fech1 = new Fecha(0,0,0);
    Fecha fech2 = new Fecha(0,0,0);
        System.out.println( JOptionPane.showInputDialog("1) Ej1 \n2) Ej2 \n 3) Ej3") );
    //                           null es para que la ventana aparezca centrada
    JOptionPane.showMessageDialog(null,"\tIngrese una primera fecha");
    int anio = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el año") );
    int mes = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el mes") );
    int dia = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el día") );

    fech1.setAnio(anio);
    fech1.setMes(mes);
    fech1.setDia(dia);


    JOptionPane.showMessageDialog(null,"\tIngrese una segunda fecha");
     anio = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el año") );
     mes = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el mes") );
     dia = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el día") );

     fech2.setAnio(anio);
     fech2.setMes(mes);
     fech2.setDia(dia);

     System.out.println("\n\n");

     System.out.print("Fecha 1: ");
     fech1.mostrar_fecha();

     System.out.print("Fecha 2: ");
     fech2.mostrar_fecha();

    }//fin del método de main

}
