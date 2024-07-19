public class ProductoEspecifico extends Producto{

    private String marca, empaque;

    public ProductoEspecifico() {
    }

    public ProductoEspecifico(int id, String nombre, double precio, String marca, String empaque) {
        super(id, nombre, precio);
        this.marca = marca;
        this.empaque = empaque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }
}
