package BancoAviles;

public class BancoAviles {
    public static void main(String[] args) {
        // creacion del titular
        Titular titular1 = new Titular();
        titular1.setNombre("Noe");
        titular1.setApellido("Tira Donada");
        titular1.setEdad(39);
        // creacion de la cuenta corriente del primer titular
        CuentaCorriente ctaTitular1 = new CuentaCorriente();
        ctaTitular1.setNombre("Noelia");
        ctaTitular1.setApellido("Tira Donada");
        ctaTitular1.setEdad(39);
        ctaTitular1.setNumCuenta("000001");
        ctaTitular1.ingreso(10000);
        ctaTitular1.actualizaCuenta(0);
        ctaTitular1.reintegro(300);
        System.out.println(ctaTitular1.toString());
        // creacion de la cuenta de ahorro
        CuentaAhorro ctaTitular2 = new CuentaAhorro();
        ctaTitular2.setNombre("Noelia");
        ctaTitular2.setApellido("Tira Donada");
        ctaTitular2.setEdad(39);
        ctaTitular2.setNumCuenta("000002");
        ctaTitular2.setSaldo(30000);
        ctaTitular2.setInteres(2.5);
        ctaTitular2.calcularIntereses(0);
        System.out.println(ctaTitular2.toString());
    }
}
