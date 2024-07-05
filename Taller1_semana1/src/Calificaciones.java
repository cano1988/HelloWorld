import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args){

        /*Ejercicio 15: Sistema de Calificaciones Implementa un programa que le pida al usuario la calificación
        de un examen (0-100). Basado en la calificación, el programa debe mostrar una letra (A, B, C, D, F),
        donde A es 90-100, B es 80-89, etc. Considera utilizar if o switch.*/

        Scanner notas = new Scanner(System.in);
        int califi;
        System.out.print("Ingresa la calificacion: ");
        califi = notas.nextInt();

        if (califi >= 90 && califi <= 100){
            System.out.println("Su nota es A");
        } else if (califi >= 80 && califi <= 89){
            System.out.println("Su nota es B");
        }else if (califi >= 70 && califi <= 79){
            System.out.println("Su nota es C");
        }else if (califi >= 60 && califi <= 69){
            System.out.println("Su nota es D");
        } else if (califi >=50 && califi <= 59){
            System.out.println("Su nota es F");
        }else if (califi >= 40 && califi <= 49){
            System.out.println("Su nota es G");
        }else if (califi >= 30 && califi <= 39){
            System.out.println("Su nota es H");
        }else if (califi >= 20 && califi <= 29){
            System.out.println("Su nota es I");
        }else if (califi >= 10 && califi <= 19){
            System.out.println("Su nota es J");
        }else if (califi >= 0 && califi <= 9){
            System.out.println("Su nota es K");
        }else{
            System.out.println("No existe el valor");
        }
    }
}
