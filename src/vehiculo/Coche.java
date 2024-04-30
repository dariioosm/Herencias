package vehiculo;

public class Coche extends Vehiculo {
    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Coche(String matricula, String color, int ruedaCoche, int cilindrada, int potencia, int numPuertas) {
        super(matricula, color, ruedaCoche, cilindrada, potencia);
        this.numPuertas = numPuertas;

    }

    public Coche(String matricula, String color) {
        super(matricula, color);
    }

    public Coche(String matricula, String color, int ruedaCoche) {
        super(matricula, color, ruedaCoche);
    }

    public Coche(String matricula, String color, int ruedaCoche, int cilindrada) {
        super(matricula, color, ruedaCoche, cilindrada);
    }

    public void ponPuerta() {

    }

    public void sacaPuerta() {

    }
}