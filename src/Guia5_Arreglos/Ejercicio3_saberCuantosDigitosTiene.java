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
public class Ejercicio3_saberCuantosDigitosTiene {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimensión del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int num;
        int cont;
        GenerarVectorAleatorio(N,vector);
        
        System.out.println("El vector es:");
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        for (int i = 0; i < N; i++) {
            cont=0;
                for (int j = 0; j < 6; j++) {
                    cont++;
                    num=(int) (vector[i]/(Math.pow(10, j)));
                                   
                        if (num<1) {
                        break;
                    }
                }                
            System.out.println("El número "+vector[i]+" tiene "+ (cont-1) +" cifras");
            
            
        }
        
    }
    public static void GenerarVectorAleatorio(int N, int[] vector) {
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int numeroAleatorio = random.nextInt(99999) + 1;
            vector[i] = numeroAleatorio;
        }

        System.out.println("Vector generado:");
        for (int i = 0; i < N; i++) {
            System.out.println(vector[i]);
        }
    }

}
