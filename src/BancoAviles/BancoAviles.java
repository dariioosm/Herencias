package banco;

class BancoAviles {
public static void main (String [] args) {
	//creacion del titular
	Titular titular1= new Titular();
	titular1.setNombre("Noe");
	titular1.setApellidos("Tira Donada");
	titular1.setEdad(39);
	//creacion de la cuenta corriente del primer titular
	CuentaCorriente ctaTitular1= new CuentaCorriente(titular1,"000001",0);
	//ingresar 1000â‚¬
	ctaTitular1.ingreso(1000);
	//reintegro 300â‚¬
	ctaTitular1.reintegro(300);
	//sacar la info de la cuenta
	System.out.println("Datos de la cuenta del titular 1");
	System.out.println(titular1.getNombre()+titular1.getApellidos()+titular1.getEdad());
	System.out.println("Saldo Actual: "+ctaTitular1.getSaldo()+"â‚¬");
	
	double interes=ctaTitular1.getSaldo()*0.025; 
	CuentaAhorro ctaAhorro= new CuentaAhorro(titular1,"000002",ctaTitular1.getSaldo(),0.025);
	//visualizar datos cuenta ahorro
	System.out.println("Cuenta ahorro");
	System.out.println(titular1.getNombre()+" "+titular1.getApellidos()+"  "+titular1.getEdad());
	ctaAhorro.calcularInteres();
	
	CuentaAhorro ctaAhorroNoe= new CuentaAhorro(titular1,"00000003",0,0.025);
	//ingreso de dinero
	ctaAhorroNoe.ingreso(300);
	//total de la cuenta
	double interesNoe=ctaAhorroNoe.getSaldo()*0.0025;
	System.out.println("\n"+"Datos noe");
	ctaAhorroNoe.calcularInteres();
	System.out.println("Saldo Actual"+ctaAhorroNoe.getSaldo()+"â‚¬");
	
	
}



}
