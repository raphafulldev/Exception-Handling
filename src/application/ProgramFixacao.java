package application;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ProgramFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);
        try {
            System.out.println("Enter the account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();

            Account acc = new Account(number, holder, balance, withdrawLimit);


            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.printf(String.format("New balance: %.2f", acc.getBalance()));
        } catch (InputMismatchException e) {
            System.out.println("Error: input error");
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } finally {

        }
        sc.close();
    }
}
