package tienda;

import java.io.Serializable;

public class Articulo implements Serializable {
    protected int referencia;
    protected String nombre;
    protected double precio;

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // constructor parametros
    public Articulo(int referencia, String nombre, double precio) {
        super();
    }

    // constructor vacio
    public Articulo() {
        super();
    }

    @Override
    public String toString() {
        return "Articulo -> referencia: " + referencia + ", nombre: " + nombre + ", precio: " + precio;
    }

}
