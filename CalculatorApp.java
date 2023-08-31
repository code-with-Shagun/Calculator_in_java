package Calci_in_java;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Percentage");
        System.out.println("7. Square");

        System.out.print("Enter choice (1/2/3/4/5/6/7): ");
        int choice = scanner.nextInt();

        double num1, num2;
        double result = 0;

        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero");
                            return;
                        }
                        break;
                    case 5:
                        result = num1 % num2;
                        break;
                    case 6:
                        result = (num1 * num2) / 100;
                        break;
                }
                break;
            case 7:
                System.out.print("Enter a number: ");
                num1 = scanner.nextDouble();
                result = num1 * num1;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
