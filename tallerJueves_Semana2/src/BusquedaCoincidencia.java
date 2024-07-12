package tallerJueves_Semana2.src;

import java.util.Scanner;

public class BusquedaCoincidencia {

    public static void main(String[] args){
/*
        Ejercicio 6: Búsqueda por coincidencia en arrays
        Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
        ingrese un nombre. Busca ese nombre en el array que imprima si se
        encuentra la posición y si no un mensaje que no se encuentra.*/

        Scanner name =new Scanner(System.in);

        String [] nombres ={"andres", "jaime","santiago","federico"};
        System.out.println("Escriba un nombre: ");
        String nom = name.nextLine();

        for(int i = 0; i < nombres.length; i++){
            if (nombres[i].equals(nom)){
                System.out.println("su posicion es:  " + i);
                break;
            }

        }

    }
}
