package tallerJueves_Semana2.src;

import java.util.Scanner;

public class FacturacionTienda {
    public static void main(String[] args) {

       /* Ejercicio 2: Facturación de una tienda.
        Un cliente realiza una compra en una tienda. El programa proporciona
        un array de productos y un array de precios. Se requiere pedir al
        usuario la cantidad de cada producto que desea comprar, para
        posteriormente imprimir el valor total de la factura.*/
        // recoredemos que utilizamos scanner para poder guardar los datos por consola
        Scanner datos = new Scanner(System.in);

        double[] precios = {1000, 2500, 3000, 1300};
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

        System.out.println("Su valor total a pagar es de: "+valorTotal);


    }

}
