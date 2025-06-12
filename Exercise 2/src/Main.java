//Ejercicio 1: Clase y Encapsulamiento
//
//Objetivo: Crear una clase CuentaBancaria que tenga los siguientes atributos privados:
//Número de cuenta (String)
//Saldo (double)
//
//Y los siguientes métodos:
//Constructor que inicialice ambos atributos.
//Método depositar(double cantidad)
//Método retirar(double cantidad)
//Método mostrarSaldo()
//
//Getters y setters para ambos atributos (solo si lo crees necesario)

public class Main {
    public static void main(String[] args) {
        var account = new BankAccount("AGUS-07", 0.0);

        printAccount(account);

        account.deposit(600.0);
        printAccount(account);

        account.extract(200.0);
        printAccount(account);

        var account2 = new BankAccount("EZE-10", 1000.0);
        printAccount(account2);
    }


    private static void printAccount(BankAccount account) {
        System.out.printf("Account id: %s -> Balance: %f%n", account.getAccountNumber(), account.getBalance());
    }
}