package tallerJueves_Semana2.src;

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {


  /*      Ejercicio 1: Menú interactivo.
        Este ejercicio propone la creación de un programa que presente al
        usuario un menú interactivo para realizar operaciones matemáticas
        básicas como suma, resta, multiplicación y división.*/

        Scanner scanner = new Scanner(System.in);

        //variables
        int option;
        double num1, num2;

        System.out.println("Este es un menú para realizar operaciones básicas: ");

        while (true) {
            System.out.println("Ingresa la operación a realizar: \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            option = scanner.nextInt();
            System.out.println("Ingresa numero uno: ");
            num1 = scanner.nextDouble();
            System.out.println("Ingresa numero dos: ");
            num2 = scanner.nextDouble();
            if (option == 1) {
                System.out.println("La suma es: " + Suma(num1, num2));
            }
            else if (option == 2) {
                System.out.println("La resta es: " + Resta(num1, num2));
            }
            else if (option == 3) {
                System.out.println("La multiplicacion es: " + Multiplicacion(num1, num2));
            }
            else if (option == 4) {
                System.out.println("La división es: " + Division(num1, num2));
            }
            else if (option == 5) {
                System.out.println("Gracias por visitarnos");
                break;
            } else {
                System.out.println("Ingrese una opción correcta: ");
            }

        }
    }

    public static double Suma(double val1, double val2){
        return val1 + val2;
    }

    public static  double Resta(double val1, double val2){
        return val1 - val2;
    }

    public static  double Multiplicacion(double val1, double val2){
        return  val1 * val2;
    }

    public static double Division(double val1, double val2){
        return val1 / val2;
    }
}