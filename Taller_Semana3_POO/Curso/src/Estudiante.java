import java.util.ArrayList;

public  class  Estudiante extends Curso {

    private int id;
    private String nombreEstudiante;
    private String email;

    public Estudiante() {
    }

    public Estudiante(int id, String nombreEstudiante, String email) {
        this.id = id;
        this.nombreEstudiante = nombreEstudiante;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addStudent() {

    }


    public void addCurso() {

    }
}
