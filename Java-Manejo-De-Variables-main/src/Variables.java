//Nombre de la clase con mayuscula siempre
public class Variables {
    public static void main(String[]args){
        String nombre;
        int a,b,c;
        //java es tipado y no le puedes
        //asignar otro tipo de dato
        nombre = "AXEL";
        int edad = 25;
        a = 1;
        b = 2;
        c = 3;
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(a+b+c);
        
        //Otra forma de definir variables
        var primerNombre = "Axel ";
        var segundoNombre = "Willian";
        var misNombres = primerNombre + segundoNombre;
        System.out.println("Mi Nombre Es: " + misNombres);
    }
}
