package desafios.contaBancaria.main;

import desafios.contaBancaria.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = reader.nextInt();
        System.out.println("Enter account holder: ");
        reader.nextLine();
        String holder = reader.nextLine();
        System.out.println("Is there na inital deposit (y/n)?");
        char response = reader.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialBalance = reader.nextDouble();
            account = new Account(number, holder, initialBalance);
            System.out.println();
            System.out.println("Account data:");
            System.out.println(account);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposit = reader.nextDouble();
        account.deposit(deposit);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value:");
        deposit = reader.nextDouble();
        account.withdraw(deposit);
        System.out.println("Update account data:");
        System.out.println(account);

        reader.close();
    }
}
