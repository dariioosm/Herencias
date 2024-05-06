package tienda;

public class Articulo {
    protected int referencia;
    protected String nombre;
    protected int precio;

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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // constructor vacio
    public Articulo() {
        super();
    }

    // constructor parametros
    public Articulo(int referencia, String nombre, int precio) {
        super();
    }
}
