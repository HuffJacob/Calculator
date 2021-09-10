import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public double numbers() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = kb.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = kb.nextDouble();
        operations(num1, num2);
        return 0;
    }
    public double operations(double num1, double num2) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        String choice = kb.nextLine();
        if(choice.equals("+")) {
            add(num1, num2);
        }
        else if(choice.equals("-")) {
            subtract(num1, num2);
        }
        else if(choice.equals("*")) {
            multiply(num1, num2);
        }
        else if(choice.equals("/")) {
            divide(num1, num2);
        }
        else {
            System.out.println("Use: (+, - , *, /)");
            operations(num1, num2);
        }
        return 0;
    }

    public double add(double num1, double num2) {
        double op = num1 + num2;
        System.out.println("Result: " + op);
        return op;
    }

    public double subtract(double num1, double num2) {
        double op = num1 - num2;
        System.out.println("Result: " + op);
        return 0;
    }

    public double multiply(double num1, double num2) {
        double op = num1 * num2;
        System.out.println("Result: " + op);
        return 0;
    }

    public double divide(double num1, double num2) {
        double op = num1 / num2;
        System.out.println("Result: " + op);
        return 0;
    }
}
