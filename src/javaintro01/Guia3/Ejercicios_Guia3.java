/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01.Guia3;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Ejercicios_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         /*** 1. Crear un programa que dado un número determine si es par o impar.
         
         System.out.println("Ingrese un numero");
         int num = leer.nextInt();
         
         if (num % 2 == 0) {
             System.out.println("El numero ingresado es PAR");
            
        }else {
             System.out.println("El numero ingresado es IMPAR");
         }
    }*/
    
    /*** Ejercicio 2.
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
     * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.
         
         
    
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }*/
    /*** Ejercicio 3
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
     * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
     * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
     * Nota: investigar la función Lenght() en Java.
    
    
    System.out.println("Ingrese una frase");
        String frase = leer.next();

        if (frase.length() <= 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }*/
    /*** Ejercicio 4
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
     * frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
     * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
     * Nota: investigar la función Substring y equals() de Java.
    
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        String frase1 = frase.substring(0, 1);
        if (frase1.equals("a") || (frase1.equals("A"))) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }*/
    /**=====================================================================
     * **Ejercicio 5
     * Escriba un programa en el cual se ingrese un valor limite positivo, y a continuación solicite
     * numeros al usuario hasta que la suma de los números introducidos supere el límite inicial.
    
    
        System.out.println("Ingrese un numero limite");
        int numL = leer.nextInt();
        double suma = 0;
       
        for (suma = 0; suma < numL;) {
            System.out.println("Ingrese numeros");
            int num = leer.nextInt();
            
            suma = num + suma;
            
            if (suma > numL) {
                break;
                
            } 
        }
        System.out.println("El numero fue superado");
    }*/
    
    /*** Ejercicio 6
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
     * el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado
     * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
     * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    
        System.out.println("Ingrese el primer valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el pSegundo valor");
        int num2 = leer.nextInt();
        String resp = "N";
        boolean salir = false;

        do {
            System.out.println("\nMENU" + "\n1.Sumar" + "\n2.Restar" + "\n3.Multiplicar" + "\n4.Dividir" + "\n5.Salir" + "\nElija Opcion:");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    double suma = num1 + num2;
                    System.out.println("La suma de los numeros es: " + suma);
                   break;
                case 2:
                    double resta = num1 - num2;
                    System.out.println("La Resta de los numeros es: " + resta);
                    break;
                case 3:
                    double mult = num1 * num2;
                    System.out.println("La multiplicacion da: " + mult);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("La division es: " + div);
                    break;
                case 5:
                    
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("s")) {
                        salir = true;
                        
                    }
                    break;
            }
        } while (salir== false);
        System.out.println("** Hasta luego **");
    }*/
    
    /*** Ejercicio 7
    Realizar un programa que simule el funcionamiento de un dispositivo RS232
    
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int Incorrect = 0;
        int correct = 0;
        
        while (!frase.equals("&&&&&")) {

            if (frase.length() <= 5) {
                String frase1 = frase.substring(0, 1);
                String frase2 = frase.substring(frase.length() - 1, frase.length());
                if (frase1.equalsIgnoreCase("x") && (frase2.equalsIgnoreCase("o"))) {
                    System.out.println("Correcto");
                    correct++;
                } else {
                    System.out.println("Incorrecto");
                    Incorrect++;
                }
                //System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
                    Incorrect++;
            }
             System.out.println("Ingrese una frase");
                frase = leer.next();
        }
        System.out.println("La cantidad de frases correctas es: "+ correct);
        System.out.println("La cantidad de frases incorrectas es: "+ Incorrect);
    }*/
    /*** Ejercicio 8
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    
    */
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {

                if (j == 0 || j == num - 1 || i == 0 || i == num - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
                
            }System.out.println(" ");
        }
    }
}
