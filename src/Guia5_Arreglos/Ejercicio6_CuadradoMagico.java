/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;
import java.util.*;
/**
 *
 * @author Chiva
 */
public class Ejercicio6_CuadradoMagico {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
     * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
     * El programa deberá comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][]Matriz = new int [3][3];
        
         rellenarMatriz(Matriz);
         controlarMatriz(Matriz);
    }
    
    public static void rellenarMatriz(int [][]Matriz){
        Scanner leer = new Scanner(System.in);
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero");
                Matriz[i][j]= leer.nextInt();
                } while (Matriz[i][j]<1 && Matriz[i][j]>9);
                
                
            }
            
        }
    }
    public static void controlarMatriz(int [][]Matriz){
        int fila0=0;
        int fila1=0;
        int fila2=0;
        int columna0=0;
        int columna1=0;
        int columna2=0;
        int diagPrincipal = 0;
        int inversa = 0;
        
            for (int j = 0; j < 3; j++) {
                fila0 = Matriz[0][j]+ fila0;
                fila1 = Matriz[1][j]+ fila1;
                fila2 = Matriz[2][j]+ fila2;
                columna0 = Matriz[j][0]+ columna0;
                columna1 = Matriz[j][1]+ columna1;
                columna2 = Matriz[j][2]+ columna2;
                diagPrincipal = Matriz[j][j]+ diagPrincipal;
                inversa = Matriz[j][2-j]+ inversa;
            }
            System.out.println("Fila 0: "+fila0);
            System.out.println("Fila 1: "+fila1);
            System.out.println("Fila 2: "+fila2);
            System.out.println("Columna 0: "+columna0);
            System.out.println("Columna 1: "+columna1);
            System.out.println("Columna 2: "+columna2);
            System.out.println("diagPrincipal : "+diagPrincipal);
            System.out.println("inversa: "+inversa);
          
            if (fila0 == fila1 && fila2 == columna0&&columna1==columna2&&diagPrincipal==inversa) {
                System.out.println("El cuadrado es MAGICO!!!!!");
        }else{
                System.out.println("El cuadrado No es Magico");
            }
    }
    
}
