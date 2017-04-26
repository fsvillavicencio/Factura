package ejercicio04;

import java.util.ArrayList;

public class Factura {

    ArrayList<LineItems> listItem = new ArrayList<>();//Array list de LineItems.
    double dblPrecioTotal;
    Domicilio objDomicilio = new Domicilio("San Pedro", "Paraguay", "Loja", "Ecuador");//Se envian datos del domicilio.

    public double getCantidadPago() {
        LineItems objlItems = new LineItems(10);//Se envia la cantidad.
        dblPrecioTotal = objlItems.getPrecioTotal() + (objlItems.getPrecioTotal() * 0.14);//Se calcula el precioTotal.  
        return dblPrecioTotal;
    }

    @Override
    public String toString() {//to String.
        return "\n----Factura----\n" + "Precio Total: " + getCantidadPago() + "\n" + objDomicilio.toString();
    }

}
