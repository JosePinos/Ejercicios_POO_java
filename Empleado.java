package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    public Empleado(String nombre_aux, double sueldo_aux, int anio_aux, int mes_aux, int dia_aux){
        nombre = nombre_aux;
        sueldo = sueldo_aux;
        GregorianCalendar calendario = new GregorianCalendar(anio_aux, mes_aux-1, dia_aux);
        altaContrato = calendario.getTime();
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        //double aumento = this.sueldo*porcentaje/100;
        //this.sueldo += aumento;
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    public void mostrar_Datos(){
        System.out.println(getNombre() + " gana " + getSueldo() + " dólares " +
                " y fue dado de alta en: " + getAltaContrato() );
    }
}//fin de la clase empleado
