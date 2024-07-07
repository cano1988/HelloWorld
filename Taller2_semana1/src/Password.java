import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static boolean esSegura(String password){

        if (password.length() > 8){
           //Ejecutar verificaciones
            boolean mayuscula = false;
            boolean numero = false;
            boolean carEspecial = false;

            // Definir los caracteres especiales
            Pattern especial = Pattern.compile("[?!¡@¿.,´*/|)]"); //Caracteres especiales que se definen para la contraseña segura
            Matcher TieneEspecial = especial.matcher(password);
            char c;
            // Realizo un for para que pase por cada uno de los caracteres de la contraseña

            for (int i = 0; i < password.length(); i++){

                // variable c le digo con el metodo charAt para que me devuelva el indice definido de la cadena
                c = password.charAt(i);

                //Realizo las condiciones si es digito y si es mayuscula

                if(Character.isDigit(c))
                    numero = true;
                if (Character.isUpperCase(c))
                    mayuscula = true;
                if (TieneEspecial.find())
                    carEspecial = true;

            }
            if(numero && mayuscula && carEspecial)
                return true;
            else
                return false;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String password;

        System.out.println("Ingrese una contraseña: ");
        password = lector.next();

        if (esSegura(password))
            System.out.println("La contraseña es segura");
        else
            System.out.println("La contraseña no es esgura");
    }
}