# Java-Manejo-De-Variables
Practicando en Java


# Tipos de Números Entero
Los tipos de datos de números entero puede almacenar, números positivos como números negativos y para almacenar estos números Java pude hacer de varias formas de acuerdo a la necesidad, como por ejemplo con byte, short, int y long.

## Byte en Java
El tipo byte es para almacenar números pequeños desde -128 a 128, esto se puede utilizar para ahorrar memoria ya que guarda números pequeños y ocupa menos espacio exactamente 1 bytes.Una variable de este tipo se define de la siguiente forma.

byte edad = 25;

System.out.println("Su Edad es: "+ edad);

### Short en Java
El tipo shorEl tipo short es para almacenar números medianos desde -32 768 a 32 767, este tipo de dato también se utiliza para ahorrar memoria, envés de utilizar int que es para números grandes podrías utilizar short viendo la cantidad de números que quieres almacenar. Una variable de este tipo se define de la siguiente forma.

short numeroMediano = 30578;

System.out.println(numeroMediano);

### Int en Java
Este tipo de dato es más usado para números entero, a pesar que se para números grande, para aprender el lenguaje de programación java, usan este tipo de dato ya que en pequeñas aplicaciones no se nota la diferencia de memorias con otros tipos.

int numeroGrande = 124578;

System.out.println(numeroGrande);

### Long en Java
Este tipo de dato es para almacenar números muy grandes como números complejos, Este tipo de dato se usa cuando int no es suficiente para un numero muy grade, este tipo de dato puede almacenar desde -9223372036854775808 hasta 9223372036854775807. al final del numero se coloca una L de  long o para indicar que es tipo de dato de tipo long de la siguiente forma.

long numerMuyGrande = 45782145L;

System.out.println(numerMuyGrande);


# Tipos de Números Decimales

### Float en Java
Tipo de dato float puede almacenar números decimales medianos, suficientes con un número decima de 6 o 7 dígitos, al final de numero se coloca un f.

float decimalMediano = 3.58f;

System.out.println(decimalMediano);

### Double en Java
Tipo de dato double puede almacenar números decimales grandes, suficientes con un número decima de 15 dígitos, al final de numero se coloca un d aunque esto es opcional, también puedes colocar sin la d al final.

double decimalGrande = 5.256d;

decimalGrande = 5.4585;

System.out.println(decimalGrande);

# Otros tipos de Datos

### Char en Java
Este tipo de dato es para almacenar un carácter ose una letra y también puede almacenar código ASCII y como resultado te devuelve el valor de ese código.

char letra = 'a';

char codigo = 65; //Resultado es igual -> A

System.out.println(letra);

System.out.println(codigo);

### Boolean en Java
Este tipo de dato solo solo tiene dos valores verdadero y falso (true y false), estés datos se utilizan para realizar condiciones u opciones lógicas.

boolean verdad = true;

boolean falso = false;

System.out.println(verdad);

System.out.println(falso);

# String en Java

String no es un tipo de dato primitivo, este es un objeto pero se comporta y se define como un tipo de dato primitivo, este tipo de dato es para almacenar cadena de caracteres.

String nombreCompleto = "Alex Willian Beltràn";

System.out.println(nombreCompleto);
