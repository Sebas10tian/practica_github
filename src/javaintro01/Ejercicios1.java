/*
 Escribir un programa que pida dos números enteros por teclado y
calcule la suma de los dos. El programa deberá después mostrar el
resultado de la suma
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //*** Ejercicio 1
         /*Scanner    leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: "+ suma);*/
         
     /*** Ejercicio 2 / Escribir un programa que pida tu nombre,
        lo guarde en una variable y lo muestre por pantalla.
        Scanner    leer = new Scanner(System.in);//Importamos la clase leer
    
        System.out.println("ingrese su nombres");
         String nombre = leer.next();// Definimos la variable cadena y leemos lo que ingresa el usuario
         System.out.println("El nombre ingresado es: "+ nombre);*/

    /*Ejercicio 3
           Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
           Nota: investigar la función toUpperCase() y toLowerCase() en Java.
           
           Scanner    leer = new Scanner(System.in);//Importamos la clase leer
    
        System.out.println("ingrese una frase");
         String frase = leer.nextLine();// Definimos la variable cadena y leemos lo que ingresa el usuario
         System.out.println("La frase es: "+ frase.toUpperCase());
         System.out.println("La frase es: "+ frase.toLowerCase());*/
    
    /*** Ejercicio 4
        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner leer = new Scanner(System.in);//Importamos la clase leer
        System.out.println("Que temperatura hace en tu ciudad?");
        int grados = leer.nextInt();
        int F = 32 + (9 * grados / 5);
        
        System.out.println("El equivalente en grados Fahrenheit es : " + F + "F"); */
    
    /*** Ejercicio 5
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla
     * el doble, el triple y la raíz cuadrada de ese número. 
    
    Scanner leer = new Scanner(System.in);//Importamos la clase leer
    System.out.println("Ingrese un Numero");
        int num = leer.nextInt();
        int num2 = num * 2;
        int num3 = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es : " + num2 );
        System.out.println("El triple del numero ingresado es : " + num3 );
        System.out.println("La raiz cuadrada del numero ingresado es : " + raiz );
     
   
    }
    
}*/
    /***    Ejercicio 6
           Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos
           * es mayor a 25.

    
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25) {
            System.out.println("El primer numero ingresado es mayor a 25");

        } else if (num2 > 25) {
            System.out.println("El Segundo numero ingresado es mayor a 25");

        } else if (num2 > 25 && num1>25) {
            System.out.println("Ambos numeros son mayores a 25");

        } else {
            System.out.println("Ningun numero es mayores a 25");

        }
    }*/
    /*Ejercicio 7 / Bloque switch(Segun)
    
    
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y 4");
        tipoMotor = leer.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");

        }
    }*/
    /*** Ejercicio 8 / Estructura While
    Escriba un programa que valide si una nota está entre 0 y 10, sino está
    * entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
    
     	Scanner leer = new Scanner(System.in);
        int nota;
  	
  	     do {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
            
        } while (nota < 0 || nota > 10);
        
   	
      	 
    	System.out.println("la nota es: " + nota);
    	
   	   
   }*/
    
    /*** Ejercicio 9
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
     * salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá
     * calcular y mostrar el resultado de la suma de los números leídos, pero si el número es
     * negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros");
            int nota;
            int cont=0;
            int suma = 0;
            
            
           do {

            nota = leer.nextInt();
            ++cont;
               if (nota == 0) {
                   System.out.println("Se capturó el numero cero");
                   break;
                   
               }
               if (nota > 0) {
                   suma = suma + nota;
                   
               }
              // System.out.println("contador = " + cont);
        } while (cont < 20);
           System.out.println("La sumatoria de los numeros ingresados es: " + suma);
          
           
        }*/
    /*** Ejercicio 10
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido
     * de tantos asteriscos como indique su valor. Por ejemplo:
    
    */
        Scanner leer = new Scanner(System.in);
        
        
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese un numero entre el 1 y el 20");
            int num = leer.nextInt();
            
            if (num >0 && num < 20) {
                System.out.print("El numero ingresado es: " +num);
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        
    }
}

