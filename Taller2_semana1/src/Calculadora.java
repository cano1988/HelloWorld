package Taller2_semana1.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calculadora {
    public  static void main(String[] args){

        Scanner edad = new Scanner(System.in);

        int year, month, day;

        System.out.println("Ingrese año de nacimiento: ");
        year = edad.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        month = edad.nextInt();
        System.out.println("Ingrese dia de nacimiento: ");
        day = edad.nextInt();

        Period edade = Period.between(LocalDate.of(year, month,day), LocalDate.now());
        System.out.println(String.format("%d años, %d meses y %d días",
                edade.getYears(),
                edade.getMonths(),
                edade.getDays()));

    }
}
