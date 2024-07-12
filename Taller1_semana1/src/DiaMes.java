package Taller1_semana1.src;

import java.util.Scanner;

public class DiaMes {
    public static void main(String[] args){

       /* Ejercicio 6: Calculadora de Días del Mes Desarrolla un programa que pida al usuario
        el número de un mes (1-12) y muestre el número de días de ese mes. Asume que febrero tiene 28 días.
        Utiliza una estructura switch para resolverlo. */

        Scanner calcular = new Scanner(System.in);
        int numMes;

        System.out.print("Ingrese el numero de un mes de 1 al 12: ");
        numMes = calcular.nextInt();

        switch (numMes){
            case 1,3,5,7,10,12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4,6,9,11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            default:
                System.out.println("El mes no se encuentra");
        }







    }
}
