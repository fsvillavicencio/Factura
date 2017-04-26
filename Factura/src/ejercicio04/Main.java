package ejercicio04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Producto objProducto = new Producto("Leche", 1.5);
        LineItems objItems = new LineItems(10);

        Factura objFactura = new Factura();
        System.out.println(objItems.toString());
        System.out.println(objProducto.toString());
        System.out.println(objFactura.toString());
        try {
                                File f = new File("Factura.csv");//Se crea el archivo.
                                FileWriter fw;
                                BufferedWriter bw;
                                if (f.exists()) {
                                    fw = new FileWriter(f, true);
                                    bw = new BufferedWriter(fw);
                                    bw.newLine();
                                    //Se envian los datos al archivo.
                                    bw.write(objItems.toString() + objProducto.toString() + objFactura.toString());

                                } else {
                                    fw = new FileWriter(f, true);
                                    bw = new BufferedWriter(fw);

                                    bw.newLine();
                                    bw.write(objItems.toString() + objProducto.toString() + objFactura.toString());
                                }
                                bw.close(); // cierra el archivo 
                                fw.close(); // cierra el archivo    
                            } catch (Exception e) {
                                System.out.println(e);
                            }

    }

}
