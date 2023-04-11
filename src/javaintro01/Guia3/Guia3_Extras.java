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
public class Guia3_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*** Ejercicio 1.
         * Dado un tiempo en minutos, calcular su equivalente en días y horas.
         * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
         * su equivalente: 1 día, 2 horas.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo");
        int minutos = leer.nextInt();
        
        int dias = (int)minutos/(24*60);
        minutos = (minutos %(60*24)); 
        int horas = (int)minutos/60;
        minutos = minutos%60;
        System.out.println("Dias" + dias);
        System.out.println("Minutos" + minutos);
        System.out.println("Horas" + horas);
        ////////////////////////////////////////////////
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo");
        
        int min, hora, dia;
        
        System.out.println("Ingrese los minutos: ");
        min = leer.nextInt();
        
        
        hora = min / 60;
        dia = hora / 24;
        hora = hora % 24;
        //int minutos = min - (dia*(60*24)+ hora *60);
        min = min%60;
        
        System.out.println(min + " minutos son equivalentes a " + dia + " días , " + hora + " horas y "  + min + " minutos.");
        */
        
        /*Ejercicio 2
        
        
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,aux;
        System.out.println("Ingrese el valor de A:");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D:");
        D = leer.nextInt();
        System.out.println("Valores iniciales");
        System.out.println("\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Los nuevos valores son: ");
        System.out.println("\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);*/
        
        /*** Ejercicio 3
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        
        Scanner input = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra: ");
        letra = input.nextLine();
        //letra = letra.toUpperCase();
        
        
        if (letra.equalsIgnoreCase("A") || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))){
        System.out.println("Es una vocal");
            
        }else{
                System.out.println("No es una vocal");
                }*/
        /*** Ejercicio 4
         * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
         * se muestre su equivalente en romano.
        
        Scanner input = new Scanner(System.in);
        String romano;
        int num;
        System.out.println("Ingrese un numero del 1 al 10: ");
        num = input.nextInt();
                
        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                romano = "Número inválido";
                break;
            }      
        System.out.println("El numero " + num + " convertivo a romando es: " + romano);
        */
        /*** Ejercicio 5
        
        
        Scanner leer = new Scanner(System.in);
        String tipoCliente;
        double total = 0;
        double totalDescuento = 0;
        double desc = 0;

        System.out.println("A(50%) - B(35%) - C(cuack)");
        tipoCliente = leer.next();
        tipoCliente = tipoCliente.toUpperCase();

        System.out.println("Costo Tratamiento: ");
        total = leer.nextFloat();

        switch (tipoCliente) {
            case "A":
                totalDescuento = total - total * 0.5;
                break;
            case "B":
                totalDescuento = total - total * 0.35;
                break;
            case "C":
                totalDescuento = total;
                break;
        }

        System.out.println("Tipo cliente : " + tipoCliente);
        System.out.println("Total c/descuento: " + totalDescuento);
*/
        /*** Ejerccicio 6
         * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
         * por debajo de 1.60 mts. y el promedio de estaturas en general.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int person = leer.nextInt();
        int cant= 0;
        int promedio =0;
       
        
        for (int i = 0; i < person; i++) {
             System.out.println("Que altura tiene en centimetros?");
                int altura = leer.nextInt();
                
                if (altura < 160) {
                cant++;
                promedio = promedio + altura;
            }
            
            
        }
        
    }

}
    

