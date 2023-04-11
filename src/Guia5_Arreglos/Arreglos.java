/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Arreglos {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] equipo = new String [7];
        
// Creo un for para pedir los nombres
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el nombre" + ", " +i);
            equipo[i] = leer.nextLine();
            
            
        }
        
        // Imprimo los nombres
        System.out.println("Los nombres ingresados son: ");
        for (int i = 0; i < 7; i++) {
            System.out.println("[" + equipo[i]+ "]");
        }
    }
    
}
