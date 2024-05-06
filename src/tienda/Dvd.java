package tienda;

public class Dvd extends Articulo {
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

    public Dvd(){
        super();
    }

    public Dvd(int referencia, String nombre, int precio,String realizador, int duracion){
        super(referencia,nombre,precio);
        this.realizador=realizador;
        this.duracion=duracion;
    }
    @Override
    public String toString() {
        return super.toString() + "Dvd -> realizador " + realizador + ", duracion: " + duracion + " minutos";
    }


    
}
