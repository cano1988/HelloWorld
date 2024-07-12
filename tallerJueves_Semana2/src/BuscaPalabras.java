package tallerJueves_Semana2.src;

import java.util.Scanner;

public class BuscaPalabras {
    public static void main(String[] args){

     /*   Ejercicio 5: Busca palabras.
        Un programa que permita al usuario ingresar un texto y luego le da la
        opción de buscar una palabra específica, mostrando como resultado
        el rango de posiciones donde se encontró la palabra exacta. (Sin darle
        importancia a mayúsculas o minúsculas)*/
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el texto:");
        String texto = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine().toLowerCase();

        // Buscar la palabra en el texto y mostrar las posiciones
        int index = 0;
        boolean buscado = false;
        while ((index = texto.indexOf(palabra, index)) != -1) {
            System.out.println("La palabra se encontró desde la posición " + index + " hasta " + (index + palabra.length() - 1));
            index += palabra.length();
            buscado = true;
        }

        if (!buscado) {
            System.out.println("La palabra no se encontró en el texto.");
        }

        scanner.close();


    }
}
