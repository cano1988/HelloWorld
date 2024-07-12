package tallerJueves_Semana2.src;

import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args){


        // Voy a utilizar un array vacio para ir llenando el orden invertido
        int [] array = {4,6,2,8,7};
        int [] auxiliar = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int j = array.length-i-1;
            auxiliar[j] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(auxiliar));
    }
}
