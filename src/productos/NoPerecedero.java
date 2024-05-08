package productos;

public class NoPerecedero extends Producto {
    private String tipo;

    public NoPerecedero(String nombre, String codigo, double precio , String tipo) {
        super(nombre,codigo,precio);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
