package BancoAviles;

class CuentaCorriente extends Titular {
    private Titular titular;
    private String numCuenta;
    protected double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

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

    // metodo setter asignar saldo nuevo
    public void actualizaCuenta(double saldoNuevo) {
        saldo = saldoNuevo;
        System.out.println("Saldo actualizado correctamente");
    }

    // metodo ingresar dinero

    public void ingreso(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han inrgesado " + cantidad + "â‚¬");
    }

    public void reintegro(double cantidad) {
        saldo -= cantidad;
        if (cantidad <= saldo) {
            System.out.println("Se han retirado " + cantidad + "â‚¬");
        } else {
            System.out.println("No tienes saldo");
        }
    }

    // metodo info cuenta
    public String getNumCta() {
        return numCuenta;
    }

    public CuentaCorriente(String obtenerTitular) {
        super();
        // TODO Auto-generated constructor stub
    }

    public CuentaCorriente(Titular titular, String numCuenta, double saldo) {
        super();
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente() {
        super();
    }

}
