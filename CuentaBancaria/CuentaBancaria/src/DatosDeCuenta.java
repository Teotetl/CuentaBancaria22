import java.util.Scanner;

public class DatosDeCuenta {
    Scanner sc = new Scanner (System.in);
    private String name;
    private String lastname;
    private double balance;
    private int accountNumber;
//metodo constructor
    public DatosDeCuenta(String name, String lastName, double balance, int accountNumber) {
        this.name = name;
        this.lastname = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    //getters and setters
    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public String getLastname() {
            return lastname;
    }
    public void setLastname(String lastname) {
            this.lastname = lastname;
    }

    public double getBalance() {
            return balance;
    }
    public void setBalance(double balance) {
            this.balance = balance;
    }

    public int getAccountNumber() {
            return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
    }

    public void deposit() {
            double amount = 0;
            System.out.println("Ingrese la cantidad a depositar");
            amount = sc.nextDouble();
            balance += amount;
            System.out.println("$" + amount + " depositado con éxito.");
            System.out.println("El saldo actual es: $"+ getBalance());
            System.out.println(" ");
        }//incrementa el saldo inicial dependiendo del monto indicado

    public void withdraw() {
        System.out.println("Ingrese la cantidad a retirar");
        double amount = sc.nextDouble();
        if (balance >= amount) { //ve si hay dinero suficiente en la cuenta para realizar el retiro
            balance -= amount;
            System.out.println("$" + amount + " retirado con éxito.");
            System.out.println("El saldo restante es: " + getBalance());
            System.out.println(" ");
            //si hay dinero suficiente en la cuenta se resta el monto pedido y proyecta un mensaje indicando que se realizo con exico la accion
        } else {
            System.out.println("Fondos insuficientes.");
            System.out.println("El saldo es de: " + getBalance());
            //se proyecta cuendo no hay dinero suficiente en la cuenta para realizar el retiro
        }
    }
    public String toString() {
        System.out.println("Titular de la cuenta: " + this.name + " " + this.lastname);
        System.out.println("Numero de la cuenta: " + this.accountNumber);
        System.out.println("Saldo de la cuenta: " + this.balance);
        System.out.println(" ");
        return "";
        //muestra la informacion de la cuenta
    }

}
