public class TiposDeNumerosEntero {
    public static void main(String [] args){
        
        //EL BYTE
        
        /*El tipo byte es para almacenar 
        números pequeños desde 
        -128 a 128, esto se puede utilizar para 
        ahorrar memoria ya que guarda números 
        pequeños y ocupa menos 
        espacio exactamente 1 bytes.
        Una variable de este tipo se define de la 
        siguiente forma.*/
        byte edad = 25;
        System.out.println("Su Edad es: "+ edad);
        
        /////////////////////////////////////////////////
        
        //Short en Java
        
        /*El tipo shorEl tipo short es para almacenar 
        números medianos desde -32 768 a 32 767, 
        este tipo de dato también se utiliza para 
        ahorrar memoria, envés de utilizar int que 
        es para números grandes podrías utilizar 
        short viendo la cantidad de números que 
        quieres almacenar. Una variable de este 
        tipo se define de la siguiente forma.*/
        short numeroMediano = 30578;
        System.out.println("Numero Mediano "+numeroMediano);
        
        /////////////////////////////////////
        
        //Int en Java
        
        /*Este tipo de dato es 
        más usado para números entero, 
        a pesar que se para números grande, 
        para aprender el lenguaje de 
        programación java, usan este tipo 
        de dato ya que en pequeñas 
        aplicaciones no se nota la diferencia 
        de memorias con otros tipos.*/
        
        int numeroGrande = 124578;
        System.out.println(numeroGrande);
        
        //////////////////////////////////
        
        //Long en Java
        
        /*Este tipo de dato es para almacenar 
        números muy grandes como números complejos, 
        Este tipo de dato se usa cuando int no es 
        suficiente para un numero muy grade, 
        este tipo de dato puede almacenar desde 
        -9223372036854775808 hasta 9223372036854775807. 
        al final del numero se coloca una L de  
        long o para indicar que es tipo de dato 
        de tipo long de la siguiente forma.*/
        
        long numerMuyGrande = 45782145L;
        System.out.println(numerMuyGrande);
        
    }
}
