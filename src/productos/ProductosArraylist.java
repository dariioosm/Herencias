package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductosArraylist {
    ArrayList<Producto> inventario= new ArrayList<Producto>();
    //? crear objetos de los productos
    /*Perecedero perecedero;
    NoPerecedero noperecedero;*/ 
    public void CargarInventario(){
//cargar arraylist
    inventario.add(new Perecedero("Lubina","LB",16.34,2));
    inventario.add(new Perecedero("Tomates","TA",11.44,3));
    inventario.add(new Perecedero("Naranjas","NJ",6.34,1));
    inventario.add(new Perecedero("Tomates","TM",3.55,4));
    inventario.add(new NoPerecedero ("LataAtun","LT",2.34,"Latas"));
    inventario.add(new NoPerecedero ("Sopa Vegetal","SP",1.24,"Sobres"));
    inventario.add(new NoPerecedero ("PastaII","PT",4.34,"Embasado"));
    }
   public void calculaPerecedero() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el codigo de producto: ");
        String buscaCodigo = in.nextLine();
        System.out.println("Introduce numero de unidades vendidas: ");
        int unidades = in.nextInt();
        System.out.println();
        
        for (Perecedero producto : inventario) {
            if (producto.getCodigo().equalsIgnoreCase(buscaCodigo)) {
                double importe = producto.calcularDescuento(unidades) * unidades;
                System.out.println("El importe total del producto " + producto.getNombre() + "es: " + importe);
            } else {
                System.out.println("Producto inexistente");
            }
        }
    }
    

}
