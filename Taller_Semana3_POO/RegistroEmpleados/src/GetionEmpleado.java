import javax.swing.*;
import java.util.ArrayList;

public class GetionEmpleado {


    //Creacion de arraylist para Empleado temporal
    ArrayList<Empleado> empleado = new ArrayList<>();

    //Creacion de arraylist para Empleado permanente
    ArrayList<EmpleadoPermanente> emplePerma = new ArrayList<>();


    //Metodos para ingresar empleados temporales

    public void addEmployee(){
        //Joption lo utilizamos para realizar muestra de panel en pantalla.
        String nombre = JOptionPane.showInputDialog("Nombre del empleado: ");
        int edadEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado: "));
        int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Id del empleado: "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario del empleado: "));


        //Vamos a crear un objeto que la clase Empleado y aplicar poliformismo

        int tipoEmpleado = Integer.parseInt(JOptionPane.showInputDialog("1. Empleado permanente\n2. Empleado temporal "));
        if(tipoEmpleado == 1){

        Empleado empleaperma = new EmpleadoTemporal();

        empleaperma.setNombre(nombre);
        empleaperma.setEdad(edadEmpleado);
        empleaperma.setIdEmpleado(idEmpleado);
        empleaperma.setSalario(salario);
            //Vamos a añadir los valores a la lista
        empleado.add(empleaperma);
        }else{

        Empleado empleatempo = new EmpleadoPermanente();

        empleatempo.setNombre(nombre);
        empleatempo.setEdad(edadEmpleado);
        empleatempo.setIdEmpleado(idEmpleado);
        empleatempo.setSalario(salario);
            //Vamos a añadir los valores a la lista
        empleado.add(empleatempo);
        }

    }

    //Método para mostrar la informacion que ingresamos en la lista

    public void getEmpleado(){
        String cadena = ""; // Creamos esta cadena para almacenar por cada recorrido esta variable
        for (int i = 0; i < empleado.size(); i++) {
            cadena += "Empleado" +(i+1)+"\n";
            cadena += "**********************\n";
            cadena += "Nombre: " + empleado.get(i).getNombre()+"\n";
            cadena += "Edad empleado : " + empleado.get(i).getEdad()+"\n";
            cadena += "Id empleado: " + empleado.get(i).getIdEmpleado()+"\n";
            cadena += "Salario: " + empleado.get(i).getSalario()+"\n";
        }

        //Para mostrar nuestros productos
        JOptionPane.showMessageDialog(null,cadena);
    }


    //Método para limpiar nuestros productos
    public void ClearEmployee(){
        empleado.clear();
    }

    //Metodo para buscar si se encuntra un producto por nombre o marca
    public void BuscarEmpleado(){

        String busqueda = JOptionPane.showInputDialog("Ingrese el producto por nombre o marca para verificar existencia: ");;

        for (int i = 0; i < empleado.size(); i++) {
            if(busqueda.equals(empleado.get(i).getNombre()) || busqueda.equals(empleado.get(i).getIdEmpleado())){
                JOptionPane.showMessageDialog(null, "El empleado  esta en la lista");
                String cadena="";
                for (int j = 0; j < empleado.size(); j++) {
                    cadena += "Empleado" +(i+1)+"\n";
                    cadena += "**********************\n";
                    cadena += "Nombre: " + empleado.get(i).getNombre()+"\n";
                    cadena += "Edad empleado : " + empleado.get(i).getEdad()+"\n";
                    cadena += "Id empleado: " + empleado.get(i).getIdEmpleado()+"\n";
                    cadena += "Salario: " + empleado.get(i).getSalario()+"\n";
                }
                //Para mostrar nuestros productos
                JOptionPane.showMessageDialog(null,cadena);
            }else{
                JOptionPane.showMessageDialog(null, "El empleado no esta en la lista");
            }
        }
    }








}
