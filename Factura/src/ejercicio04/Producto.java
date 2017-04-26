package ejercicio04;

public class Producto {

    public String strDescripcion;
    public double dblPrecio;

    public Producto(String strDescripcion, double dblPrecio) {//Constructor de la clase.
        this.strDescripcion = strDescripcion;
        this.dblPrecio = dblPrecio;
    }
    //Set y Get de los atributos.
    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    public double getDblPrecio() {
        return dblPrecio;
    }

    public void setDblPrecio(double dblPrecio) {
        this.dblPrecio = dblPrecio;
    }

    @Override
    public String toString() {//to String
        return "\n----- Producto -----\n" + "Descripcion: " + strDescripcion + "\nPrecio: " + dblPrecio;
    }
    
    

}
