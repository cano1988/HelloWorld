package Taller1_semana1.src;

import java.util.Scanner;

public class Ordener {
    public static void main(String[] args){

      /*Ejercicio 11: Ordenando Tres Números
      Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
      ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear
      una solución usando el operador ternario para práctica adicional.*/

        Scanner orde = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingresa num1: ");
        num1 = orde.nextInt();
        System.out.println("Ingresa num2: ");
        num2 = orde.nextInt();
        System.out.println("Ingresa num3: ");
        num3 = orde.nextInt();

        if ((num1 < num2) && (num2 < num3)){
         System.out.println("Orden: "+num1+"-"+num2+"-"+num3);
        } else if ((num1 < num3) && (num3 < num2) ){
         System.out.println("Orden: "+num1+"-"+num3+"-"+num2);
        } else if ((num2 < num1) && (num1 < num3) ){
         System.out.println("Orden: "+num2+"-"+num1+"-"+num3);
        }  else if ((num2 < num3) && (num3 < num1) ){
         System.out.println("Orden: "+num2+"-"+num3+"-"+num1);
        } else if ((num3 < num1) && (num1 < num2)){
         System.out.println("Orden: "+num3+"-"+num1+"-"+num2);
        }else {
         System.out.println("Orden: "+num3+"-"+num2+"-"+num1);
        }
    }
}
