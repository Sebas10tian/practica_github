/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;


/**
 *
 * @author Chiva
 */
import java.util.Scanner;
public class Main {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
/*
        String frase;
        System.out.println("ingrese una frase");
        frase=sc.nextLine();
        trans(frase);
        
    }
    public static void trans(String frase){
        frase= frase.replace("a", "@");
        frase= frase.replace("e", "#");
        frase= frase.replace("i", "$");
        frase= frase.replace("o", "%");
        frase= frase.replace("u", "*");
        System.out.println("la frase modificada queda "+frase+".");*/
    
   // }
    
    /*Ejercicio 2
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
   
    
   //import java.util.Scanner;
//public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      int edad;
      String validacion;
      int c=1;
      String nombre;
      do {
          System.out.println("cargue el nombre de la persona "+c);
          nombre=sc.nextLine();
          System.out.println("cargue la edad de la persona "+c);
          edad=sc.nextInt();
          mayorEdad(nombre, edad);
          System.out.println("desea cargar mas personas?  S/N");
          validacion= sc.next();
          c++;
      }while(validacion.equalsIgnoreCase("s"));
    }
    public static void mayorEdad(String nombre, int edad){
        if (edad>17){
            System.out.println(nombre+" tiene "+edad+" es mayor de edad ");
        }else {
            System.out.println(nombre+" tiene "+edad+" no es mayor de edad ");
        }
    } */
    
    /*** Ejercicio 4 -
     * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por
     * parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
       Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
      * ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
       */
   
        int x;
        boolean pri;
        System.out.println("ingrese el valor a verificar");
        x = leer.nextInt();
        pri = primos(x);
        System.out.println("el numero es primo? " + pri);
    }

    public static boolean primos(int x) {
        int c = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

}


