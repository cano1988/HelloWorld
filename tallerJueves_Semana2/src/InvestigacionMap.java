import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class InvestigacionMap {
    public static void main(String[] args){

        System.out.println("QUE ES UN MAP");
        System.out.println("******************************************************************************************************************");
        System.out.println("La Interface Map (java.io.Map) en Java, nos permite representar una estructura de datos para almacenar" +
                " pares \"clave/valor\"; de tal manera que para una clave solamente tenemos un valor. Esta estructura de datos" +
                " también es conocida en otros lenguajes de programación como \"Diccionarios\", aunque en cada lenguajes esta" +
                " estructura de datos tiene sus matices.");
        System.out.println("******************************************************************************************************************");

        System.out.println("Los principales métodos para trabajar con los Map son los siguientes:");

        // Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
        Map<Integer, String> nombreMap = new HashMap<>();
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        /*nombreMap.put(Key, Value); // Añade un elemento al Map
        nombreMap.get(Key, Value); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(Key, Value); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(Key, Value); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(Value); // Devuelve true si en el map hay un Valor que coincide con V*/
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map

    }
}
