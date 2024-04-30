package BancoAviles;

import java.util.Scanner;

public class CuentaCorriente extends Titular {
    private String numCuenta;
    private double saldo;

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

    public void ingreso(int saldo) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el dinero que quiere ingresar: ");
        this.saldo = in.nextInt();
        setSaldo(this.saldo);
        System.out.println("Ingreso correcto, se ha agregado: " + this.saldo);
    }

    public void reintegro(double saldo) {
        Scanner in = new Scanner(System.in);
        double saldo = getSaldo();
        System.out.println("Ingrese dinero a retirar: ");
        double retirar = in.nextDouble();

        while (saldo < retirar) {
            System.out.println("No puedes retirar mas dinero que el que tienes guardado");
            System.out.println();
            System.out.println("Ingrese dinero a retirar: ");
            retirar = in.nextDouble();
        }
        saldo = saldo - retirar;
        System.out.println("Tras retirar: " + retirar + " el saldo actual es de: " + saldo);
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
    }

}
