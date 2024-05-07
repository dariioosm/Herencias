package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Perecedero extends Producto {
    ArrayList<Perecedero> listaProductos = new ArrayList<>();

    private int perecedero;

    public Perecedero() {
        super();
    }

    public Perecedero(String nombre, String codigo, int precio, int perecedero) {
        super();
        this.perecedero = perecedero;
    }

    public int getPerecedero() {
        return perecedero;
    }

    public void setPerecedero(int perecedero) {
        this.perecedero = perecedero;
    }

    public double calcularDescuento() {
        double descuento = 0;
        if (perecedero == 1) {
            descuento = 0.04;
        } else if (perecedero == 2) {
            descuento = 0.035;
        } else if (perecedero == 3) {
            descuento = 0.03;
        } else if (perecedero == 4) {
            descuento = 0.025;
        } else if (perecedero == 5) {
            descuento = 0.02;
        }
        // descuento unitario en funcion de los dias a caducar
        double precioDescuento = precio - (precio * descuento);
        return precioDescuento;
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
                double importe = producto.calcularDescuento() * unidades;
                System.out.println("El importe total del producto " + producto.getNombre() + "es: " + importe);
            
            } else {
                System.out.println("Producto inexistente");
            }
        }
    }

}
