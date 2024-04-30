package vehiculo;

public class Coche extends Vehiculo {
    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Coche(String matricula, String color, int numRuedas, int cilindrada, int potencia, int numPuertas) {
        super(matricula, color, 4, cilindrada, potencia);
        this.numPuertas = numPuertas;
    }

    public Coche(String matricula, String color) {
        super(matricula, color);
    }

    public Coche(String matricula, String color, int numRuedas) {
        super(matricula, color, 4);
    }

    public Coche(String matricula, String color, int numRuedas, int cilindrada) {
        super(matricula, color,4, cilindrada);
    }

    public void ponPuerta() {

    }

    public void sacaPuerta() {

    }
}