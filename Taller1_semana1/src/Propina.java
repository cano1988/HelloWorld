import java.util.Scanner;

public class Propina {
    public static void main(String[] args){

      /*  Ejercicio 10: Calculadora de Propina Desarrolla un programa que calcule cuánto dejar de propina
        en un restaurante. El usuario debe ingresar el total de la cuenta y el porcentaje de propina que
        desea dejar. El programa debe mostrar cuánto dinero en propina debe dejar.*/

        Scanner propi = new Scanner(System.in);

        double cuenta, pro, dinepro;

        System.out.println("Ingrese el total de la cuenta: ");
        cuenta = propi.nextDouble();
        System.out.println("Ingrese porcentaje de propina: ");
        pro = propi.nextDouble();

        dinepro = (cuenta * pro) / 100;
        System.out.println("El total de propina es de: "+ dinepro);



    }
}
