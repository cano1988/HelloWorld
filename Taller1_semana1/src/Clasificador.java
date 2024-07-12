package Taller1_semana1.src;

import java.util.Scanner;

public class Clasificador {
    public static void main(String[] args){

        /*Ejercicio 5: Clasificador de Números Crea un programa que solicite al usuario un número
        y muestre un mensaje indicando si el número es positivo, negativo o cero.
        Además, indica si el número es par o impar.*/

        Scanner clasify = new Scanner(System.in);
        double num;
        System.out.print("Ingresa un numero: ");
        num = clasify.nextDouble();

        if (num == 0){
            System.out.println("El numero es 0");
            //numero positivo y es par o impar
        } else if (num > 0 && (num % 2) == 0){
            System.out.println("El numero es positivo y es par");
        } else if (num > 0 && (num % 2) != 0) {
            System.out.println("El numero es positivo y es impar");
        } else if (num < 0 && (num % 2) == 0) {
            System.out.println("El numero es negativo y es par");
        } else if (num < 0 && (num % 2) != 0) {
            System.out.println("El numero es negativo y es impar");
        }
    }
}
