package tienda;

import java.io.*;
import java.util.*;

public class Dvd extends Articulo {
    ArrayList<Dvd> listaDvd = new ArrayList<Dvd>();

    private String realizador;
    private int duracion;

    public String getRealizador() {
        return realizador;
    }

    public void setRealizador(String realizador) {
        this.realizador = realizador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Dvd(String referencia, String nombre, int precio, String realizador2, int duracion2) {
        super();
    }

    public Dvd(int referencia, String nombre, int precio, String realizador, int duracion) {
        super(referencia, nombre, precio);
        this.realizador = realizador;
        this.duracion = duracion;
    }

    public void anadirDvd() {
        Dvd dvd;
        Scanner in = new Scanner(System.in);
        char respuesta = 's';
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("registroDvd.dat"));
            do {
                // ordenes para el usuario
                System.out.println("Introduzca referencia del producto: ");
                String referencia = in.nextLine();
                System.out.println("Introduzca nombre del DVD: ");
                String nombre = in.nextLine();
                System.out.println("Introduzca precio del DVD: ");
                int precio = in.nextInt();
                System.out.println("Introduzca duracion: ");
                int duracion = in.nextInt();
                System.out.println("Introduzca los apellidos y nombre del realizador: ");
                String autor = in.nextLine();
                // creacion del objeto
                dvd = new Dvd(referencia, nombre, precio, realizador, duracion);
                // escribir el objeto al arraylist
                listaLibros.add(dvd);
                // escribir el objeto en el fichero
                salida.writeObject(dvd);
                // cerrar archivo
                salida.close();
            } while (Character.toLowerCase(respuesta) != 'n');
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error en la entrada o salida de datos " + ex.getMessage());
        }

    }

    public void verLibro() {// ver el arraylist que tiene los libros
        System.out.println("**********Libros en el inventario**********");
        for (Dvd dvds : listaDvd) {
            System.out.println(dvds.toString());
        }
    }

    public void leerInventario() throws ClassNotFoundException, FileNotFoundException, IOException {
        // leer los datos guardados en el archivo
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("registroLibros.dat"));
            listaDvd = (ArrayList) entrada.readObject();
            entrada.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encuentra la clase" + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error en entrada o salida de datos " + ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Dvd -> realizador " + realizador + ", duracion: " + duracion + " minutos";
    }

}
