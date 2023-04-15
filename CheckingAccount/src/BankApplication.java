/**
 * Name: Kenzie Fanning
 * File: CheckingAccount
 * Description: This class test the functionality of CheckingAccount class
 */

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int choice=0;

        System.out.println("Banking App");
        System.out.print("Enter the unique ID: ");
        String id=input.nextLine();

        while(id.length()<4) {
            System.out.println("!!!ERROR: Unique IDs are at least 4 characters long!!!");
            System.out.print("Enter the Unique ID: ");
            id=input.nextLine();
        }
        System.out.print("Enter the initial balance: $");
        double balance=input.nextDouble();

        while(balance<500) {
            System.out.println("!!!ERROR: New accounts need at least $500!!!");
            System.out.print("Enter the initial balance: $");
            balance=input.nextDouble();
        }
        System.out.print("Enter the annual interest rate as percentage: ");
        double interestRate=input.nextDouble();

        CheckingAccount account=new CheckingAccount(id,balance,interestRate);

        do
        {
            System.out.println("===============================");
            System.out.println("=    OPTIONS =");
            System.out.println("===============================");
            System.out.println("1. Deposit");
            System.out.println("2. View Daily Interest Rate");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.println("Enter your selection");
            choice=input.nextInt();
            switch(choice) {

                case 1:
                    System.out.print("Enter your deposit amount: ");
                    double amount=input.nextDouble();

                    while(amount<0) {
                        System.out.println("!!!ERROR: Deposits must be greater than $0!!!");
                        System.out.print("Enter your Deposit amount: ");
                        amount=input.nextDouble();
                    }
                    account.depositCash(amount);
                    System.out.println("New Balance: $"+account.GetAcct_Balance());
                    break;

                case 2:
                    System.out.printf("Your Daily Interest Amount is $ %.2f\n",account.getDailyIntRate());
                    break;

                case 3:
                    System.out.println(account);
                    break;

                case 4:
                    System.out.println("Program exiting...");
                    break;

                default:
                    System.out.println("INVALID SELECTION - TRY AGAIN!");
            }

        } while(choice!=4);

    }

}

