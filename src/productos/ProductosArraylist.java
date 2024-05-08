package productos;

import java.util.ArrayList;

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
   
    

}
