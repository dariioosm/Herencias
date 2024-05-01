package BancoAviles;

public class CuentaAhorro extends CuentaCorriente {
    private double interes;
    private double saldoAhorro;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public CuentaAhorro(String numCuenta, double interes) {
        super(numCuenta, interes);
    }

    public CuentaAhorro() {
        super();
    }

    public void actualizaInteres(double interesNuevo) {
        interes = interesNuevo;
        System.out.println("Interes actualizado correctamente");
    }

    public void interesActualizado(double interesNuevo) {

        System.out.println("El interes aplicado es del " + interesNuevo + "%");
    }

    public void calcularIntereses(double interesNuevo) {
        saldoAhorro = saldo + saldo * (interes / 100);
        System.out.println("El saldo con el interes agregado es de " + saldoAhorro + "€");
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro [interes=" + interes + ", saldoAhorro=" + saldoAhorro + "]";
    }

}
