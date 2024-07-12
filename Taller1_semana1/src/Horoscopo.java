package Taller1_semana1.src;

import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args){

      /*  Ejercicio 12: Generador de Horóscopo Implementa un programa que le pida al usuario su mes y día de nacimiento.
        Luego, basado en esa información, muestra su signo del zodíaco.
        Utiliza una estructura switch para manejar los meses y if para los días.*/

        Scanner signo = new Scanner(System.in);
        int mes, dia;
        String horoscopo="";

        System.out.print("Ingresa mes de nacimiento: ");
        mes = signo.nextInt();
        System.out.print("Ingresa dia de nacimiento: ");
        dia = signo.nextInt();

        switch(mes) {
            case 1:
                if (dia < 21) {
                    horoscopo = "capricornio";
                } else {
                    horoscopo = "acuario";
                }
                break;
            case 2:
                if (dia < 20) {
                    horoscopo = "acuario";
                } else {
                    horoscopo = "piscis";
                }
                break;
            case 3:
                if (dia < 21) {
                    horoscopo = "piscis";
                } else {
                    horoscopo = "aries";
                }
                break;
            case 4:
                if (dia < 21) {
                    horoscopo = "aries";
                } else {
                    horoscopo = "tauro";
                }
                break;
            case 5:
                if (dia < 20) {
                    horoscopo = "tauro";
                } else {
                    horoscopo = "géminis";
                }
                break;
            case 6:
                if (dia < 22) {
                    horoscopo = "géminis";
                } else {
                    horoscopo = "cáncer";
                }
                break;
            case 7:
                if (dia < 22) {
                    horoscopo = "cáncer";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 8:
                if (dia < 24) {
                    horoscopo = "leo";
                } else {
                    horoscopo = "virgo";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscopo = "virgo";
                } else {
                    horoscopo = "libra";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscopo = "libra";
                } else {
                    horoscopo = "escorpio";
                }
                break;
            case 11:
                if (dia < 23) {
                    horoscopo = "escorpio";
                } else {
                    horoscopo = "sagitario";
                }
                break;
            case 12:
                if (dia < 21) {
                    horoscopo = "sagitario";
                } else {
                    horoscopo = "capricornio";
                }
                break;
            default:
        }

        System.out.print("Su horóscopo es " + horoscopo);






    }
}
