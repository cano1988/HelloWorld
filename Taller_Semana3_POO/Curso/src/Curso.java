import java.util.ArrayList;

public  class Curso {

    protected int codigo;
    protected String nombre;
    protected ArrayList<Estudiante> listaEstudiante;


    public Curso() {
    }

    public Curso(int codigo, String nombre, ArrayList<Estudiante> listaEstudiante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiante = listaEstudiante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante() {
        this.listaEstudiante = listaEstudiante;
    }


    public void addCurso() {

    }


}
