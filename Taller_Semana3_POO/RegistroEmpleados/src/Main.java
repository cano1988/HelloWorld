import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Comenzaremos con la funcionalidad
        //Instanciamos un objeto de la clase gestionEmpleados
        GetionEmpleado gestor = new GetionEmpleado();

        //creamos variable para guardar la ocion del usuario
        byte opcion;

        //vamos a crear el menu

        do {
           opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menú principal\n"
                    +"1. Añadir empleado\n"
                    +"2. Listar empleado\n"
                    +"3. Limpiar empleado\n"
                    +"4. Buscar empleado\n"
                    +"5. Salir"));

            //creamos un switch para ver cada caso
            switch (opcion){
                case 1 :
                    gestor.addEmployee();
                    break;
                case 2:
                    gestor.getEmpleado();
                    break;
                case 3:
                    gestor.ClearEmployee();
                    break;
                case 4:
                    gestor.BuscarEmpleado();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No encontrado");
                    break;
            }

        }while(opcion != 5);

    }
}