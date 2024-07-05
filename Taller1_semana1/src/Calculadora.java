import java.util.Scanner;

//Taller semana 1
public class Calculadora {
    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);
        int num1, num2,suma, resta, multiplicacion;
        double division;

        /*Ejercicio 1: Calculadora Básica
        Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar, multiplicar
        y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y los resultados.*/

        System.out.print("Ingresa numero uno: ");
        num1 = calculadora.nextInt();

        System.out.print("Ingresa numero dos: ");
        num2 = calculadora.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2 ;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

    }
}