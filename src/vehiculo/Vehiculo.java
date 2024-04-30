package vehiculo;

public class Vehiculo {
    private String matricula;
    private String color;
    private int numRuedas;
    private int cilindrada;
    private int potencia;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Vehiculo(String matricula, String color, int numRuedas, int cilindrada, int potencia) {
        super();
        this.matricula = matricula;
        this.color = color;
        this.numRuedas=numRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public Vehiculo(String matricula, String color, int numRuedas, int cilindrada) {
        super();
        this.matricula = matricula;
        this.color = color;
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
    }

    public Vehiculo(String matricula, String color, int numRuedas) {
        // con este constructor, puedo construir objeto con 3 elementos
        super();
        this.matricula = matricula;
        this.color = color;
        this.numRuedas = numRuedas;
    }

    public Vehiculo(String matricula, String color) {
        super();
        this.matricula = matricula;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo matricula: " + matricula + ", color: " + color + ", numRuedas: " + numRuedas + ", cilindrada: "
                + cilindrada + ", potencia: " + potencia;
    }

}