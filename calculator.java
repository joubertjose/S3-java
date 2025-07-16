package experiments.io;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        sc.nextLine(); // clear newline

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.nextLine().charAt(0);

        int result = 0;
        boolean validOperation = true;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;  // fixed subtraction
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero, you nerd!");
                    validOperation = false;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}

