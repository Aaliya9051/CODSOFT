package Task3_ATMInterface;

import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Current Balance: " + balance);

            }

            else if (choice == 2) {

                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                balance = balance + amount;

                System.out.println("Amount Deposited");

            }

            else if (choice == 3) {

                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {

                    balance = balance - amount;

                    System.out.println("Withdraw Successful");

                }

                else {

                    System.out.println("Insufficient Balance");

                }

            }

            else if (choice == 4) {

                System.out.println("Thank You");
                break;

            }

            else {

                System.out.println("Invalid Choice");

            }

        }

        sc.close();

    }

}


    
