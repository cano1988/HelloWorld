package Taller1_semana1.src;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){

       /* Ejercicio 8: Cálculo de Promedio Escribe un programa que solicite al usuario ingresar
        tres calificaciones, calcule el promedio y muestre un mensaje indicando
        si el alumno aprueba o no (considera que se aprueba con un promedio de 6 o más).*/

        Scanner avg = new Scanner(System.in);

        double cal1, cal2, cal3, prom;
        System.out.println("Ingresa calificacion 1: ");
        cal1 = avg.nextDouble();
        System.out.println("Ingresa calificacion 2: ");
        cal2 = avg.nextDouble();
        System.out.println("Ingresa calificacion 3: ");
        cal3 = avg.nextDouble();

        prom = (cal1 + cal2 + cal3) / 3;

        if(prom >= 6){
            System.out.println("Esta aprobado con " + prom);
        }else {
            System.out.println("No esta aprobado con " + prom);
        }



    }
}
