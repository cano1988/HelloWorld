import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class GestionCurso extends Curso{



    ArrayList<Curso> curso = new ArrayList<>();
    ArrayList<Estudiante> listaEstudiante = new ArrayList<>();




    @Override
    public void addCurso() {
        //Joption lo utilizamos para realizar muestra de panel en pantalla.
        int codigo = Integer.parseInt(showInputDialog("Código del curso: "));
        String nombre = showInputDialog("Nombre del curso: ");

        //Colocar los valores en el objeto
        Curso course = new Curso();
        course.setCodigo(codigo);
        course.setNombre(nombre);

        //Luego de crear los objetos vamos a añadirlos a la lista con el metodo add(es de java)
        curso.add(course);
    }



    public void addStudent() {
        if(curso.isEmpty()){
            JOptionPane.showMessageDialog(null,"Lo sentimos no hay cursos disponibles");

        }else {
            String cadena = "";
            for (int i = 0; i < curso.size(); i++) {
                cadena += +(i + 1) + ". " + curso.get(i).getNombre() + "\n";
            }
            //Para mostrar los cursos
            JOptionPane.showMessageDialog(null,"""
                        Cursos disponibles

                        """+ cadena);
            String busqueda = JOptionPane.showInputDialog("Ingrese el nombre del curso en el que se desea inscribir: ");
            for (int i = 0; i < curso.size(); i++) {
                if (busqueda.equals(curso.get(i).getNombre())) {
                    //Joption lo utilizamos para realizar muestra de panel en pantalla.
                    int id = Integer.parseInt(showInputDialog("id del estudiante: "));
                    String nombreEstudiante = JOptionPane.showInputDialog("Nombre del estudiante: ");
                    String email = JOptionPane.showInputDialog("Email del estudiante ");


                    //Colocar los valores en el objeto
                    Estudiante student = new Estudiante();

                    student.setId(id);
                    student.setNombreEstudiante(nombreEstudiante);
                    student.setEmail(email);
                    //Luego de crear los objetos vamos a añadirlos a la lista con el metodo add(es de java)
                    listaEstudiante.add(student);

                }else {
                    JOptionPane.showMessageDialog(null, "El curso ingresado no esta en la lista");

                }
            }
       }
    }


    //Metodo para listar estudiantes por cusrso especifico
    public void listarEstudiante(){
        if(curso.isEmpty() || (listaEstudiante.isEmpty())){
            JOptionPane.showMessageDialog(null,"No hay cursos existente o estudiantes inscritos");
        }else {
            String busqueda = JOptionPane.showInputDialog("Ingrese el nombre de un curso para ver los estudiantes inscritos: ");
            for (int i = 0; i < curso.size(); i++) {
                if (busqueda.equals(curso.get(i).getNombre())) {
                    JOptionPane.showMessageDialog(null, "Estudiantes inscritos en el curso: " + curso.get(i).getNombre());
                    String cadena = "";
                    for (int j = 0; j< listaEstudiante.size(); j++) {
                        cadena += "Estudiante " + (j + 1) + "\n";
                        cadena += "Id: " + listaEstudiante.get(j).getId() + "\n";
                        cadena += "Nombre : " + listaEstudiante.get(j).getNombreEstudiante() + "\n";
                        cadena += "Precio: " + listaEstudiante.get(j).getEmail() + "\n";

                    }
                    //Para mostrar nuestros productos
                    JOptionPane.showMessageDialog(null, """
                            Estudiantes inscritos en el curso: """ +" "+ curso.get(i).getNombre() + "\n" +
                            cadena);

                } else {
                    JOptionPane.showMessageDialog(null, "El curso  no existe");
                }
           }
        }
    }

    //Método para limpiar nuestros productos
    public void Clearcurso(){
        JOptionPane.showMessageDialog(null,"Curso limpiado");
        curso.clear();
    }


    //Método para limpiar nuestros productos
    public void Clearstudent(){
        JOptionPane.showMessageDialog(null,"Estudiante limpiado");
        listaEstudiante.clear();
    }
}
