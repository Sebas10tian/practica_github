/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;
import java.util.*;
//import java.util.Scanner;
/**
 *
 * @author Chiva
 */
    
public class Ejercico5_Matriz_Transpuesta_Antisimetrica {
    Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int[][]Matriz = new int [3][3];
        int[][]Matrizb= new int [3][3];
      //  Random ran = new Random();
        
        rellenarMatriz(Matriz,Matrizb);
        mostrarMatriz(Matriz);
        mostrarMatriz(Matrizb);
        comprobarMatriz(Matriz,Matrizb);
       
        
        
    }
    public static void rellenarMatriz(int [][]Matriz, int [][] Matrizb){
        Scanner leer = new Scanner(System.in);
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero");
                Matriz[i][j]= leer.nextInt();
            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matrizb[i][j]=Matriz[j][i];
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
    
    }
    public static void comprobarMatriz(int [][]Matriz,int [][]Matrizb){
        int num =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Matriz[i][j]== -Matrizb[i][j]) {
                    num++;
                                      
                }
            }
        }
        if(num == 9) {
            System.out.println("La matriz es antisimétrica");
      }else{
            System.out.println("La matriz NO es antisimétrica");
        }
        
    }
    
}
