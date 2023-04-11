/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;

import static Guia5_Arreglos.Arreglos.leer;

/**
 *
 * @author Chiva
 */
public class Ejercicio2_EncontrarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida
        al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el
        numero y si se encuentra repetido
        */
       
        System.out.println("Ingrese el tamaño del vector (N)");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int num;
        int cont = 0;
        String repetido = "no";
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("El vector es:");
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("Ingrese un numero entre 1 y 10 a buscar en el vector");

        do {
            num = leer.nextInt();
        } while (num > 10);
        for (int i = 0; i < N; i++) {
            if (num == vector[i]) {
                cont++;
                System.out.println("El número está dentro del vector en la posición " + i);

            }

        }
        if (cont == 0) {
            System.out.println("El número no está dentro del vector");
        }

    }

}

