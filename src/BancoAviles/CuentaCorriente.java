package BancoAviles;

import java.util.Scanner;

public class CuentaCorriente extends Titular {
    private String numCuenta;
    private int saldo;

    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    public void ingreso(int saldo){
        Scanner in= new Scanner(System.in);
        System.out.println("Indique el dinero que quiere ingresar: ");
        this.saldo= in.nextInt();
        setSaldo(this.saldo);
    }
    

}
