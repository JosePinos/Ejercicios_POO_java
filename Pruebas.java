package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados emp1 = new Empleados("Juan");
        Empleados emp2 = new Empleados("Adriana");
        Empleados emp3 = new Empleados("Pedro");
        Empleados emp4 = new Empleados("Catalina");
        Empleados emp5 = new Empleados("Jorge");

        System.out.println(emp1.dameDatos());
        System.out.println(emp2.dameDatos());
        System.out.println(emp3.dameDatos());
        System.out.println(emp4.dameDatos());
        System.out.println(emp5.dameDatos());

        emp1.setSeccion("Automóviles");
        emp2.setSeccion("Administración");
        emp3.setSeccion("RRHH");
        emp4.setSeccion("Gerencia General");
        emp5.setSeccion("CEO");

        System.out.println("\n\n"+emp1.dameDatos());
        //Empleados.Id++;
        System.out.println(emp2.dameDatos());

        System.out.println(emp3.dameDatos());

        System.out.println(emp4.dameDatos());
        System.out.println(emp5.dameDatos());
        System.out.println(Empleados.dame_Idsiguiente());
    }//FIN DEL MÉTODO DE MAIN
}

class Empleados{
    private final String nombre;//si la declaro como final (const ya no puedo modificarla luego)
    //solo en el constructor no puedo setearlo
    private String seccion;
    //public static int Id;//ahora cada objeto ya no tendrá su copia de Id, rompo el encapsulamiento
    private int Id;
    private static int IdSiguiente = 1;//pertenece a la clase

    public Empleados(String nomb){
        nombre = nomb;
        seccion = "Administración";
        Id=IdSiguiente;
        IdSiguiente++;
    }


    public String getNombre() {
        return nombre;
    }

   // public void setNombre(String nombre) { this.nombre = nombre; } YA NO PUEDO SETEAR

    public int getId(){ return Id; }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String dameDatos(){
        return getNombre() +" con Id " + getId() +", trabaja en: " + getSeccion();
    }

    public static String dame_Idsiguiente(){
        return "El IdSiguiente es: " + IdSiguiente;
        //metodos estáticos solo pueden acceder a mibmros estáticos
    }


}