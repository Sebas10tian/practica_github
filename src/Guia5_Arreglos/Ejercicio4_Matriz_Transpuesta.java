/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Ejercicio4_Matriz_Transpuesta {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
     * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][]Matriz = new int [3][3];
      //  Random ran = new Random();
        
        rellenarMatriz(Matriz);
        mostrarMatriz(Matriz);
        
       
        
    }
    public static void rellenarMatriz(int [][]Matriz){
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz[i][j]= new Random().nextInt(10);
            }
            
        }
    }
    public static void mostrarMatriz(int [][]Matriz){
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+Matriz[i][j]+"]");
            }
             System.out.println("");
        }
         System.out.println("\n");
          for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("["+Matriz[i][j]+"]");
            }
             System.out.println("");
        }
    }
    
}
