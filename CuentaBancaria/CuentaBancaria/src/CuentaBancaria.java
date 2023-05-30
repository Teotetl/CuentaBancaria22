import java.util.Scanner;
public class CuentaBancaria {
    public static int menu (){
        Scanner sc = new Scanner (System.in);
        int opc1 = 0;
        System.out.println("[1] Ver informacion de la cuenta");
        System.out.println("[2] Realizar un deposito");
        System.out.println("[3] Realizar un retiro");
        System.out.println("[0] Salir");
        opc1 = sc.nextByte();
        System.out.println(" ");
        if (opc1 >= 4) {
            System.out.println("Por favor ingresa una opcion valida");
            System.out.println(" ");
        }
        return opc1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc1 = 0;
        DatosDeCuenta c1 = new DatosDeCuenta("Javier", "Garcia", 0, 1234567890);
        do {
            opc1 = menu();
            switch (opc1) {
                case 1:
                    c1.toString();
                    break;
                case 2:
                    c1.deposit();
                    break;
                case 3:
                    c1.withdraw();
                    break;
                default:
                    System.out.println("Gracias por usarnos");
                    break;
            }
        }while (opc1 != 0) ;
    }
}