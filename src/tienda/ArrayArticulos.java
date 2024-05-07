package tienda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayArticulos {
    ArrayList<Articulo>inventario=ArrayList<Articulo>();
    public void cargaArt(){
        Scanner in= new Scanner (System.in);
        System.out.println("Introduzca referencia del producto: ");
        int referencia = in.nextInt();
        System.out.println("Introduzca nombre del articulo: ");
        String nombre = in.nextLine();
        System.out.println("Introduzca precio del articulo: ");
        int precio = in.nextInt();
        System.out.println("Seleccione si es un Libro (1) o un DVD (2)");
        int  opcion= in.nextInt();
        if(opcion==1){
            System.out.println("******* Menu Libro *******");
            System.out.println();
            System.out.println("Introduzca numero de paginas: ");
            int numPag = in.nextInt();
            System.out.println("Introduzca numero ISBN: ");
            String isbn = in.nextLine();
            System.out.println("Introduzca los apellidos y nombre del autor: ");
            String autor = in.nextLine();
            inventario.add(new Articulo(referencia, nombre, precio,numPag,isbn,autor));
        }
        else if(opcion==2){
            System.out.println("******* Menu DVD *******");
            System.out.println();
            System.out.println("Introduzca duracion: ");
            int duracion = in.nextInt();
            System.out.println("Introduzca los apellidos y nombre del realizador: ");
            String realizador = in.nextLine();
        }
        else{
            System.out.println("Introduzca un valor valido (1||2)");
        }
    }

    public void imprimirArt(){
        String vacio="";
        System.out.println("Inventario de articulos disponibles \n");
        for(Articulo tmp:inventario){
            if (tmp instanceof Libro){
                vacio="Libro";
            }
            else{
                vacio="DVD";
            }
            System.out.println("Tipo de articulo: "+vacio+" Datos: "+(tmp.toString()));
        }
    }

    public void grabarArt() throws FileNotFoundException,IOException,ClassNotFoundException{
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("inventario.dat"));
        salida.writeObject(inventario);
        salida.close();
    }
}
