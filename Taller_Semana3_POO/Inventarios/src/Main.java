import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //comezaremos con la funcionalidad de nuestro programa
        Inventarios inv = new Inventarios();

        //para guardar la opcion del usuario
        byte opcion;

        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menú principal\n"
                    +"1. Añadir producto\n"
                    +"2. Listar productos\n"
                    +"3. Limpiar productos\n"
                    +"4. Buscar producto\n"
                    +"5. Salir"));

            //creamos un switch para ver cada caso

            switch (opcion){
                case 1 :
                    inv.addProduct();
                    break;
                case 2:
                    inv.getProducto();
                    break;
                case 3:
                    inv.ClearProduct();
                    break;
                case 4:
                    inv.BuscarProducto();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No encontrado");
                    break;
            }

        }while (opcion != 5);

    }
}