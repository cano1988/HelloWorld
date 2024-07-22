import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Inicio de funcionalidad de nuestro proyecto

        //Crearemos un objeto para instanciar de la clase gestionCurso

        GestionCurso gestion = new GestionCurso();

        //para guardar la opcion del usuario
        byte opcion;

        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menú principal\n"
                            +"1. Añadir Curso\n"
                            +"2. Añadir estudiantes\n"
                            +"3. Listar estudiantes por curso\n"
                            +"4. Limpiar Cursos\n"
                            +"5. Limpiar Estudiantes\n"
                            +"6. Salir"));

            //creamos un switch para ver cada caso

            switch (opcion){
                case 1 :
                    gestion.addCurso();
                    break;
               case 2:
                    gestion.addStudent();
                    break;
                case 3:
                    gestion.listarEstudiante();
                    break;
                case 4:
                    gestion.Clearcurso();
                    break;
                case 5:
                    gestion.Clearstudent();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No encontrado");
                    break;
            }

        }while (opcion != 6);

    }


}

