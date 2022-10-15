package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;
        while (runApp) {
            System.out.println("Welcome to console-based calculator! You can select one of the following options: ");
            System.out.println(" 1 - Addition");
            System.out.println(" 2 - Subtraction");
            System.out.println(" 3 - multiplication");
            System.out.println(" 4 - division");
            System.out.println(" 5 - exit");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 + num2));
            } else if (option == 2) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 - num2));
            } else if (option == 3) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 * num2));
            } else if (option == 4) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 / num2));
            } else if (option == 5) {
                System.out.println("Thank you for using our app!");
                break;
            }
        }
    }
}