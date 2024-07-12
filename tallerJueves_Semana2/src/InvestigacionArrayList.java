import java.sql.SQLOutput;
import java.util.ArrayList;

public class InvestigacionArrayList {
    public static void main (String[] args){

       /* Investigación 1: ArrayList
        Investigar que es un arraylists y hacer ejemplos con los tipos de datos
        que se han visto hasta el momento, también mirar los métodos que
        tienen y hacer ejemplos.*/


        System.out.println("QUE ES UN ARRAYLIST");
        System.out.println("******************************************************************************************************************");
        System.out.println("La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays," +
                " con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica, es decir," +
                " que no es necesario declarar su tamaño como pasa con los Arrays");
        System.out.println("******************************************************************************************************************");



        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        // Añade el elemento al ArrayList
                nombreArrayList.add("Elemento");
        // Devuelve el numero de elementos del ArrayList
                nombreArrayList.size();
        // Devuelve el elemento que esta en la posición '2' del ArrayList
                nombreArrayList.get(2);
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
                nombreArrayList.contains("Elemento");
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList
                nombreArrayList.indexOf("Elemento");
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
                nombreArrayList.lastIndexOf("Elemento");
        // Borra el elemento de la posición '5' del ArrayList
                nombreArrayList.remove(5);
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
                nombreArrayList.remove("Elemento");
        //Borra todos los elementos de ArrayList
                nombreArrayList.clear();
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False
                nombreArrayList.isEmpty();
        // Copiar un ArrayList
                ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();
        // Pasa el ArrayList a un Array
                Object[] array = nombreArrayList.toArray();

    }
}
