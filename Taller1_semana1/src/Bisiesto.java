import java.util.Scanner;

public class Bisiesto {
        public static void main(String[] args){

        /*Ejercicio 9: Calculadora de Año Bisiesto Escribe un programa que le pida al usuario que
        ingrese un año y determine si es un año bisiesto o no. Recuerda que un año es bisiesto si es divisible entre 4,
        excepto aquellos que son divisibles entre 100, a menos que también sean divisibles entre 400.*/

        Scanner bisi = new Scanner(System.in);
        int year;

        System.out.println("Ingresa un año: ");
        year = bisi.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){

            System.out.println("El año " + year + " es bisiesto");
        } else
        {
            System.out.println("El año " + year + " no es bisiesto");
        }
   }
}

