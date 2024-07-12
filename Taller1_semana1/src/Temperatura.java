package Taller1_semana1.src;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){

        /*Ejercicio 14: Convertidor de Temperatura Crea un programa que convierta temperaturas
        entre grados Celsius y Fahrenheit. El usuario debe poder elegir si quiere convertir de
        Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
        Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a Fahrenheit.*/

        Scanner temperature = new Scanner(System.in);
        int temp;
        double grados;

        System.out.println("Ingresa la opcion deseada: \n1.Celsius-Fahrenheit\n2.Fahrenheit-Celsius");
        temp = temperature.nextInt();
        System.out.println("Ingresa la temperatura: ");
        grados = temperature.nextDouble();

        switch (temp){
            case 1:
                System.out.println("Los grados fahrenheit son: " + (grados * 9/5 + 32));
                break;
            case 2:
                System.out.println("Los grados Celsius son: " + (grados -32) * 5/9);
                break;
        }
    }
}
