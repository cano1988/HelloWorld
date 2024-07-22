import javax.swing.*;
import java.util.ArrayList;

public class Inventarios {

    //creacion de objeto arraylist, ojo se debe importar la libreria java. util de arraylist
    ArrayList<ProductoEspecifico> product = new ArrayList<>();


    //Metodo para ingresar valores al array
    public void addProduct(){
        //Joption lo utilizamos para realizar muestra de panel en pantalla.
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id del producto: "));
        String nombre = JOptionPane.showInputDialog("Nombre del producto: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto: "));
        String marca = JOptionPane.showInputDialog("Marca del producto: ");


        //Vamos a crear un objeto de la clase productoEspecifico, dado que, me trae herencia los metodos de la clase producto
        ProductoEspecifico producto = new ProductoEspecifico();
        producto.setId(id);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setMarca(marca);


        //Luego de crear los objetos vamos a añadirlos a la lista con el metodo add(es de java)
        product.add(producto);
    }



    //Método para mostrar la informacion que ingresamos en la lista

    public void getProducto(){
        String cadena = ""; // Creamos esta cadena para almacenar por cada recorrido esta variable
        for (int i = 0; i < product.size(); i++) {
                cadena += "Producto " +(i+1)+"\n";
                cadena += "******************\n";
                cadena += "Id: " + product.get(i).getId()+"\n";
                cadena += "Nombre : " + product.get(i).getNombre()+"\n";
                cadena += "Precio: " + product.get(i).getPrecio()+"\n";
                cadena += "Precio: " + product.get(i).getMarca()+"\n";
        }

        //Para mostrar nuestros productos
        JOptionPane.showMessageDialog(null,cadena);
    }

    //Método para limpiar nuestros productos
    public void ClearProduct(){
        product.clear();
    }


    //Metodo para buscar si se encuntra un producto por nombre o marca
    public void BuscarProducto(){

        String busqueda = JOptionPane.showInputDialog("Ingrese el producto por nombre o marca para verificar existencia: ");

        for (int i = 0; i < product.size(); i++) {
            if(busqueda.equals(product.get(i).getNombre()) || busqueda.equals(product.get(i).getMarca())){
                JOptionPane.showMessageDialog(null, "El producto se encuentra en inventario");
                String cadena="";
                for (int j = 0; j < product.size(); j++) {
                    cadena += "Producto" +(i+1)+"\n";
                    cadena += "Id: " + product.get(i).getId()+"\n";
                    cadena += "Nombre : " + product.get(i).getNombre()+"\n";
                    cadena += "Precio: " + product.get(i).getPrecio()+"\n";
                    cadena += "Precio: " + product.get(i).getMarca()+"\n";

                }
                //Para mostrar nuestros productos
                JOptionPane.showMessageDialog(null,cadena);
            }else{
                JOptionPane.showMessageDialog(null, "El producto no esta en inventario");
            }
        }
    }

}
