package tienda;

import java.io.*;
import java.util.Scanner;

public class Libro extends Articulo {
    private int isbn;
    private int numPag;
    private String autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro() {
        super();
    }

    public Libro(int referencia, String nombre, int precio, int numPag, int isbn, String autor) {
        super(referencia, nombre, precio);
        this.numPag = numPag;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void anadirLibro() {
        // donde crear el arraylist?
        Scanner in = new Scanner(System.in);
        char respuesta = 's';
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("registroLibro.dat"));
            do {
                // ordenes para el usuario
                System.out.println("Introduzca referencia del producto: ");
                String referencia = in.nextLine();
                System.out.println("Introduzca nombre del libro: ");
                String nombre = in.nextLine();
                System.out.println("Introduzca precio del libro: ");
                int precio = in.nextInt();
                System.out.println("Introduzca numero de paginas: ");
                int numPag = in.nextInt();
                System.out.println("Introduzca numero ISBN: ");
                int isbn = in.nextInt();
                System.out.println("Introduzca los apellidos y nombre del autor: ");
                String autor = in.nextLine();
                // creacion del objeto
                lib = new Libro();
                // escribir el objeto al arraylist

                // escribir el objeto en el fichero

            } while (Character.toLowerCase(respuesta) != 'n');
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error en la entrada o salida de datos " + ex.getMessage());
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Libro -> ISBN: " + isbn + ", NumPaginas: " + numPag + ", Autor: " + autor;
    }

}
