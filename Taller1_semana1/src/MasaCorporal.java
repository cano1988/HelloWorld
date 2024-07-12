package Taller1_semana1.src;

import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args){

        /*Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
        Escribe un programa que calcule el índice de masa corporal (IMC) de una persona.
        El programa debe pedir al usuario su peso en kilogramos y su altura en metros,
        calcular el IMC y mostrar un mensaje con el resultado. La fórmula para calcular el
        IMC es peso / (altura * altura).*/

        Scanner mas = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Ingrese su peso en kilogramos: ");
        peso = mas.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        altura = mas.nextDouble();

        imc = peso / (altura*altura);
        System.out.println(imc);

    }
}
