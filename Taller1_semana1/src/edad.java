package Taller1_semana1.src;

import java.util.Scanner;

public class edad {
    public static void main(String[] args){


        /*Ejercicio 2: Verificador de Edad
        Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
        El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.*/

        Scanner age= new Scanner(System.in);
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = age.nextInt();

        if(edad >= 18){
            System.out.println("El usuario es mayor de edad");
        }else
            System.out.println("El usuario no es mayor de edad");

    }
}
