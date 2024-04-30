package vehiculo;

public class Menu  {
    public static void main(String[] args) {
         Coche cochePepe = new Coche("0000BBB", "gris plata", 0, 0, 3, 0);
         Coche cocheMaria = new Coche("1111CCC", "rojo", 0, 0, 0, 5);
        System.out.println(cochePepe.toString());
        System.out.println();
        System.out.println(cocheMaria.toString());
        System.out.println();
         Moto motoPepe= new Moto("2222BBBB", "negro",0,2);
         System.out.println(motoPepe.toString());
    }
}
