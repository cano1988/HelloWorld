package Taller2_semana1.src;

import java.util.Scanner;

public class Idenrtificador {

    public static boolean Vocal(char dato) {
        dato = Character.toLowerCase(dato);
        if ( dato == 'a' || dato == 'e' || dato == 'i' || dato == 'o' || dato == 'u'){
            return true;
        }
        return false;
    }


    public static void main(String[] args){

        Scanner caracter = new Scanner(System.in);
        char dato;
        System.out.print("Introduce un carácter: ");
        dato = caracter.next().charAt(0);

        if (Character.isLetter(dato)) {
            if (Vocal(dato)) {
                System.out.println("Es Vocal.");
            } else {
                System.out.println("Es consonante.");
            }
        } else {
            System.out.println("Es carácter especial.");
        }
    }
}
