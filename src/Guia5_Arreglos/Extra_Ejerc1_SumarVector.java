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
public class Extra_Ejerc1_SumarVector {

    /**
     Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
     * con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int N;
        System.out.println("Ingrese el tamaño del vector");
        N=leer.nextInt();
        
        int [] vector = new int[N];
        int suma=0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese los valores a sumar");
            vector[i]= leer.nextInt();
            suma = vector[i]+suma;
            
        }
        System.out.println("La suma es: "+suma);
        
    }
    
}
