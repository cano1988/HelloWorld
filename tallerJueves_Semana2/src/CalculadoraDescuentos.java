import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {

/*        Ejercicio 4: Calculadora de descuentos.
        Crea un programa que calcule los descuentos por compras(Ejercicio 2)
        en una tienda, donde se aplica un porcentaje de descuento en función
        del monto total de la compra, con rangos de precios personalizados.*/
       /* ________________________________________________
                | Rango de compra | Porcentaje de descuento |
                |------------------------------------|-----------------------------------------|
                | Mayor o igual a $1000 | 25% |
                | Mayor o igual a $500 | 20% |
                | Mayor o igual a $300 | 15% |
                | Mayor o igual a $200 | 10% |
                | Menor a $200 | No se aplica descuento |*/

        Scanner datos = new Scanner(System.in);

        double[] precios = {10, 25, 30, 130};
        String[] productos = {"pan", "azucar", "leche", "servilletas"};

        //Debemos crear un array vacio para guardar las cantidades del usuario

        int[] cantidad = new int[productos.length];

        //Realizamos un for normal para recorrer la cantidad de productos y de esa
        // manera saber cuantas veces se le pregunta al usuraio lo requerido

        for (int i = 0; i < productos.length; i++) {
            System.out.println("La cantidad de " + productos[i] + " que va llevar: ");
            cantidad[i] = datos.nextInt();
        }

        //Cuando voy a realizar  operacion entre 2 arrays su posicion debe ser la misma
        double valorTotal = 0; //se debe inicializar variable por fuera del for
        for (int i = 0; i < productos.length; i++) {
            valorTotal += cantidad[i] * precios[i];
        }

        System.out.println("Su valor total a pagar es de: " + valorTotal);

        //cogemos el ejercicio 2 y vamos a realizar unos condicionales

          /* ________________________________________________
                | Rango de compra | Porcentaje de descuento |
                |------------------------------------|-----------------------------------------|
                | Mayor o igual a $1000 | 25% |
                | Mayor o igual a $500 | 20% |
                | Mayor o igual a $300 | 15% |
                | Mayor o igual a $200 | 10% |
                | Menor a $200 | No se aplica descuento |*/

        if (valorTotal >= 1000) {
            System.out.println("Obtiene un descuento del 25%, ahora su valor a pagar es de " + valorTotal * 0.75);

        } else if (valorTotal >= 500) {
            System.out.println("Obtiene un descuento del 20%, ahora su valor a pagar es de " + valorTotal * 0.80);
        } else if (valorTotal >= 300) {
            System.out.println("Obtiene un descuento del 15%, ahora su valor a pagar es de " + valorTotal * 0.85);
        } else if (valorTotal >= 200) {
            System.out.println("Obtiene un descuento del 10%, ahora su valor a pagar es de " + valorTotal * 0.90);
        } else {
            System.out.println("No se aplica descuento");
        }
    }
}