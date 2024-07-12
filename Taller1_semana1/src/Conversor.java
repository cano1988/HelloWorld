package Taller1_semana1.src;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){

        /*Ejercicio 3: Conversor de Unidades Desarrolla un programa que convierta kilómetros a millas.
        El programa debe solicitar al usuario que introduzca una distancia en kilómetros y luego debe
        mostrar la distancia equivalente en millas. Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.*/

        Scanner conversor = new Scanner(System.in);
        double km, mill, conversion;

        System.out.print("Ingresa los kilometros recorridos: ");
        km = conversor.nextDouble();
        conversion = km * 1.60934;
        System.out.println("El recorrido en millas es: " + conversion);

    }
}
