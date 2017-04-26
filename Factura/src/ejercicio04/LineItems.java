package ejercicio04;

import java.util.ArrayList;

public class LineItems {

    public int intCantidad;

    double dblPrecioTotal;

    ArrayList<Producto> listProducto = new ArrayList<>();//Array list de Productos.

    public LineItems(int intCantidad) {
        this.intCantidad = intCantidad;

    }

    public double getPrecioTotal() {
        Producto objProducto = new Producto("Leche", 1.5);//Descripcion y precio del producto.
        this.dblPrecioTotal =  objProducto.getDblPrecio() * this.intCantidad;//Precio total.

        return dblPrecioTotal;

    }

    @Override
    public String toString() {//to String.
        return "----Items----\n" + "Cantidad: " + intCantidad + "\nPrecio Total: " + getPrecioTotal();
    }

}
