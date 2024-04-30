package colegio;

public class Profesor extends Persona {

    private String departamento;
    private int nrp;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
    public Profesor(){
        super();
    }

    public Profesor(String nombre, String apellido, int nacimiento, String departamento, int nrp) {
        // el super va antes que los atributos de la clase,
        // (tiene que seguir el ordende los parametros llamados)
        super(nombre, apellido, nacimiento);

        this.departamento = departamento;
        this.nrp = nrp;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Profesor [departamento=" + departamento + ", nrp=" + nrp + "]";
    }

    public void visualizarProfesor() {
        System.out.println("Los datos del profesor son:");
        System.out.println(
                "====================================================================================================");
        Imprime();
        System.out.println(
                "\t" + "Departamento: " + departamento + "\t" + "\t" + "Numero de registro personal: " + nrp);
        // System.out.println();
        System.out.println(
                "====================================================================================================");
    }
}

