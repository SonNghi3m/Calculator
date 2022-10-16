package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;
        while (runApp) {
            try {
                System.out.println("Welcome to console-based calculator! You can select one of the following options: ");
                System.out.println(" 1 - Addition");
                System.out.println(" 2 - Subtraction");
                System.out.println(" 3 - Multiplication");
                System.out.println(" 4 - Division");
                System.out.println(" 5 - Exit");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    double addSum = 0;
                    boolean userChoice = true;
                    while (userChoice) {
                        System.out.println("Do you want to add more number to calculate? (y/n) ");
                        char addSelect = scanner.next().charAt(0);
                        if (addSelect == 'y') {
                            System.out.println("Enter numbers you want to add: ");
                            double addNumber = scanner.nextDouble();
                            addSum = addSum + addNumber;
                            System.out.println("The result is: " + (num1 + num2 + addSum));
                        } else if (addSelect == 'n') {
                            System.out.println("The result is: " + (num1 + num2 + addSum));
                            break;
                        } else {
                            System.out.println("You must enter correct character: 'y' or 'n' !");
                            userChoice = true;
                        }
                    }

                } else if (option == 2) {
                    System.out.println("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    double subSum = 0;
                    boolean userChoice = true;
                    while (userChoice) {
                        System.out.println("Do you want to add more number to calculate? (y/n) ");
                        char addSelect = scanner.next().charAt(0);
                        if (addSelect == 'y') {
                            System.out.println("Enter numbers you want to add: ");
                            double addNumber = scanner.nextDouble();
                            subSum = subSum + addNumber;
                            System.out.println("The result is: " + (num1 - num2 - subSum));
                        } else if (addSelect == 'n') {
                            System.out.println("The result is: " + (num1 - num2 - subSum));
                            break;
                        } else {
                            System.out.println("You must enter correct character: 'y' or 'n' !");
                            userChoice = true;
                        }

                    }
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
            } catch (Exception e) {
                System.out.println("Your input is not correct! Please rerun the program!");

            }
        }
    }
}