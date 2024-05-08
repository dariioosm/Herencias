package productos;

public class Producto {
    protected String nombre;
    protected String codigo;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto() {
        super();
    }

    public Producto(String nombre, String codigo, int precio){
        super();
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
    }

}