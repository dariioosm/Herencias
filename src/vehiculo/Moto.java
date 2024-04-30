package vehiculo;

public class Moto extends Vehiculo {
    private int numPlazas;
    
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public Moto(String matricula, String color, int numRuedas, int cilindrada, int potencia) {
        super(matricula, color, 2, cilindrada, potencia);
        
    }

    public Moto(String matricula, String color) {
        super(matricula, color);
    }

    public Moto(String matricula, String color, int numRuedas,int numPlazas) {
        super(matricula, color, 2);
        this.numPlazas=numPlazas;
    }

    public Moto(String matricula, String color, int numRuedas, int cilindrada) {
        super(matricula, color, 2, cilindrada);
    }

    @Override
    public String toString() {
        return super.toString()+"Moto [numPlazas=" + numPlazas + "]";
    }

}
