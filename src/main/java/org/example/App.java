package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;

        while (runApp) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Enter the arithmetic operator '+', '-', '*', '/': ");
            char operator = scanner.next().charAt(0);
            double result = 0;


            //selections
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default: {
                    System.out.println("Character " + operator + " is not correct!");
                    return;
                }
            }

            //Output
            System.out.println("The result is: " + result);
            System.out.println("Do you want to continue? (y/n)");
            char userChoice = scanner.next().charAt(0);
            if (userChoice == 'n') {
                System.out.println("Program ended. Thank you for using our application!");
                runApp = false;
            } else if (userChoice == 'y'){
                runApp = true;
            }
        }
    }
}
