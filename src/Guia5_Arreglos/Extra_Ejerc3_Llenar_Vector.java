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
public class Extra_Ejerc3_Llenar_Vector {

    /**
     *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [][] Matriz = new String [20][20];
        int [] vector = new int[4];
        rellenarVector(vector);
        mostrar(vector);
    }
    
    public static void rellenarVector(int [] vector){
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
         for (int i = 0; i < 4; i++) {
            
            vector[i] = random.nextInt(10) + 1;
        }
    }
    
    public static void mostrar(int [] vector){
        
        for (int i = 0; i < 4; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
    
}
