package poo;

import java.sql.SQLOutput;

public class Estudiante {

    String nombre;
    byte edad;
    String carrera;
    int promedio;

    public Estudiante(){
        nombre = "Jhon Petrucci";
        edad = 20;
        carrera = "Ejecución Musical";
        promedio = 100;
    }


    public void graduarse(){

    }
    public void ingresar(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {

        if(promedio > 0 && promedio <= 100){
            this.promedio = promedio;
        }else{
            this.promedio = 10;
        }

    }

    public String letra_Promedio(){
        String prom_letra = " ";
        if(this.getPromedio() == 100){
            prom_letra = " A+ ";

        }else if( this.getPromedio() >= 90 && this.getPromedio() < 100  ){
            prom_letra = " A ";

        }else if( this.getPromedio() >= 80 && this.getPromedio() < 90  ){
            prom_letra = " B+ ";

        }else if( this.getPromedio() >= 70 && this.getPromedio() < 80  ){
            prom_letra = " B ";

        }else if( this.getPromedio() < 70 ){
            prom_letra = " C ";
        }


        return prom_letra;
    }


    public void resumen_Berklee(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Promedio: " + getPromedio() + " " + letra_Promedio());
        System.out.println("\n------------------------------\n");
    }
}//fin de la clase
