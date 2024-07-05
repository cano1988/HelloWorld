import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args){

        /*Ejercicio 7: Menú Interactivo Implementa un programa que muestre un menú con opciones para realizar
        diferentes operaciones matemáticas (por ejemplo, sumar, restar, multiplicar, dividir).
        El usuario debe poder seleccionar una opción ingresando un número, y luego el programa
        debe pedir los números necesarios para realizar la operación elegida y mostrar el resultado.
        Utiliza una estructura switch para manejar las opciones del menú.*/

        Scanner menu = new Scanner(System.in);
        double num1, num2;
        int operacion;

        System.out.println("Menu de operaciones:\n1-suma\n2-resta\n3-multiplicar\n4-dividir");
        operacion = menu.nextInt();
        System.out.println("Ingresa numero uno");
        num1 = menu.nextDouble();
        System.out.println("Ingresa numero dos");
        num2 = menu.nextDouble();

        switch (operacion){
            case 1:
                System.out.println("la suma es igual a: " + (num1 + num2) );
                break;
            case 2:
                System.out.println("la resta es igual a: " + (num1 - num2) );
                break;
            case 3:
                System.out.println("la multiplicación  es igual a: " + (num1 * num2) );
                break;
            case 4:
                System.out.println("la división  es igual a: " + (num1 / num2) );
                break;
            default:
                System.out.println("El numero no se encuentra en el menu");
        }
    }
}
