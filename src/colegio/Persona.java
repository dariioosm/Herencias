package colegio;

public class Persona {
    private String nombre;
    private String apellido;
    private int nacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Persona(String nombre, String apellido, int nacimiento) { // constructor por parametros del objeto persona
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;

    }



    
    public Persona() {
        super();
    }

    @Override
    public String toString() {
        super.toString();
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + "]";
    }

    public void Imprime() {
        System.out.println("Nombre: " + getNombre() + "\t" + "Apellido: " + getApellido() + "\t"
                + "Anno de nacimiento: " + getNacimiento());
    }

}
