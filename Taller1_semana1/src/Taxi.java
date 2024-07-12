package Taller1_semana1.src;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args){

      /*  Ejercicio 13: Calculadora de Tarifa de Taxi desarrolla un programa que calcule el costo de un viaje en
        taxi basándose en la distancia del viaje (en kilómetros) y la tarifa base.
        Puedes añadir una tarifa adicional por kilómetro recorrido. El usuario debe ingresar la distancia del viaje.*/

        Scanner tarifa = new Scanner(System.in);
        double tarbase = 4000, tariadic, distancia,costo;

        System.out.print("Ingrese la distancia del viaje: ");
        distancia = tarifa.nextDouble();

        tariadic = 200* distancia;

        costo = tariadic + tarbase;
        System.out.println("El costo total es de: " + costo);


    }
}
