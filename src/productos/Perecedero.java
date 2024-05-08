package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Perecedero extends Producto {
    
    private int caduca;

    public Perecedero() {
        super();
    }

    public Perecedero(String nombre, String codigo, int precio, int caduca) {
        super();
        this.caduca = caduca;
    }

    public int getCaduca() {
        return caduca;
    }

    public void setCaduca(int caduca) {
        this.caduca = caduca;
    }

    /* el metodo calcular descuento se tiene que hace con arrays*/


    public double calcularDescuento(int cantidad, int caduca) {
        int[] dias= {1,2,3,4,5};
        double [] dto={4,3.5,3,2.5,2};
        double desc, importe=0;
        for (int i = 0; i < dias.length; i++) {
            if (caduca == dias[i]) {
                desc = (super.getPrecio() * cantidad * dto[i]) / 100;
                importe = super.getPrecio() * cantidad - desc;
                }
            return importe;
        }
    }

    // busca el producto y multiplica el numero de unidades por el precio unitario
    // descontado
    public void calculaPerecedero() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el codigo de producto: ");
        String buscaCodigo = in.nextLine();
        System.out.println("Introduce numero de unidades vendidas: ");
        int unidades = in.nextInt();
        System.out.println();
        
        for (Perecedero producto : listaProductos) {
            if (producto.getCodigo().equalsIgnoreCase(buscaCodigo)) {
                double importe = producto.calcularDescuento(unidades) * unidades;
                System.out.println("El importe total del producto " + producto.getNombre() + "es: " + importe);
            
            } else {
                System.out.println("Producto inexistente");
            }
        }
    }

}

