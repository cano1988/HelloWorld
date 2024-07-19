public class  Empleado extends Persona {

    //Atributos propios

    private int IdEmpleado;
    private double Salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        IdEmpleado = idEmpleado;
        Salario = salario;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        IdEmpleado = idEmpleado;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
