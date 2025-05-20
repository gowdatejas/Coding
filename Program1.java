package CodingAssignment;

import java.util.Scanner;

public class Program1 {

    static class Calculator {
        double a, b;

        Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        double calculate(String operation) {
            if (operation.equalsIgnoreCase("add")) {
                return a + b;
            } else if (operation.equalsIgnoreCase("sub")) {
                return a - b;
            } else if (operation.equalsIgnoreCase("mul")) {
                return a * b;
            } else if (operation.equalsIgnoreCase("div")) {
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    return 0;
                }
                return a / b;
            } else {
                System.out.println("Invalid operation");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        double result = calc.calculate(op);
        System.out.println("Result: " + result);
    }
}
