package BancoAviles;

class CuentaAhorro extends CuentaCorriente {
    private double interes;

    public CuentaAhorro() {
        super();
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numCuenta, double saldo, double interes) {
        super(titular, numCuenta, saldo);
        this.interes = interes;

    }

    // metodo calcular interes y aÃ±adirlo a saldo
    public void calcularInteres() {
        double interesGanado = getSaldo() * interes;
        setSaldo(getSaldo() + interesGanado);
        System.out.println("Se ha calculado el interes y aÃ±adido a la cuenta " + interesGanado);
    }

    @Override
    public String toString() {
        return super.toString() + interes * 100 + "%";
    }

}
