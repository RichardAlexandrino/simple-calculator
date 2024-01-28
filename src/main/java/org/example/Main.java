package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continueCalculations = true;
        double num1, num2, result;
        String operator;

        while (continueCalculations) {
            System.out.println("--CALCULATOR--");
            System.out.println("Choose a operation: \n1 - Sum '+' \n2 - Subtraction '-' \n3 - Multiplication '*' \n4 - Division \n0 - Exit");
            operator = sc.next();

            switch (operator.toLowerCase()) {
                case "1":
                case "+":
                case "sum":
                    System.out.println("Enter the first number: ");
                    num1 = sc.nextDouble();

                    System.out.println("Enter the second number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;
                    System.out.println("Result: " + String.format("%.2f", num1) + " + " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
                    break;
                case "2":
                case "-":
                case "subtraction":
                    System.out.println("Enter the first number: ");
                    num1 = sc.nextDouble();

                    System.out.println("Enter the second number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;
                    System.out.println("Result: " + String.format("%.2f", num1) + " - " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
                    break;
                case "3":
                case "*":
                case "multiplication":
                    System.out.println("Enter the first number: ");
                    num1 = sc.nextDouble();

                    System.out.println("Enter the second number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;
                    System.out.println("Result: " + String.format("%.2f", num1) + " * " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
                    break;
                case "4":
                case "/":
                case "division":
                    System.out.println("Enter the first number: ");
                    num1 = sc.nextDouble();

                    System.out.println("Enter the second number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + String.format("%.2f", num1) + " / " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case "0":
                case "exit":
                    break;
                default:
                    System.out.println("Invalid operator!");

            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueChoice = sc.next().toLowerCase();
            continueCalculations = continueChoice.equals("yes") || continueChoice.equals("y");

        }

        System.out.println("Program has been terminated.");
        sc.close();

    }

}