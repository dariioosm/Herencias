package BancoAviles;

public class CuentaCorriente extends Titular {
    private String numCuenta;
    protected double saldo;

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void actualizaCuenta(double saldoNuevo) {
        saldo = saldoNuevo;
        System.out.println("Saldo actualizado correctamente");
    }

    public void ingreso(double dineros) {
        saldo += dineros;
        System.out.println("Se han inrgesado " + dineros + "€");
    }

    public void reintegro(double dineros) {
        saldo -= dineros;
        if (dineros <= saldo) {
            System.out.println("Se han retirado" + dineros + "€");
        } else {
            System.out.println("No puedes retirar una cantidad mayor que la disponible");
        }
    }

    public CuentaCorriente() {
        super();
    }

    public CuentaCorriente(String numCuenta, double saldo) {
        super();
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
    }

}
