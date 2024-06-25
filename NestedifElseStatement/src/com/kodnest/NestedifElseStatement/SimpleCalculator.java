package com.kodnest.NestedifElseStatement;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the operation (+, -, *, /): ");
        char operation = scan.next().charAt(0);
        double result;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
                scan.close();
                return;
            }
        } else {
            System.out.println("Invalid operation.");
            scan.close();
            return;
        }
        System.out.println("Result: " + result);
        scan.close();
    }
}

