import java.util.Scanner;

class Calculator {
    public double add(double n1, double n2) {
        return (n1 + n2);
    }

    public double sub(double n1, double n2) {
        return (n1 - n2);
    }

    public double mul(double n1, double n2) {
        return (n1 * n2);
    }

    public double div(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero error");
        }
        return (n1 / n2);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        double a, b, result;
        int choice;
        char continueChoice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Select an operation (1-5): ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the Calculator. Thank you!");
                break;
            }

            System.out.print("Enter the first number: ");
            a = sc.nextDouble();
            System.out.print("Enter the second number: ");
            b = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = calc.add(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calc.sub(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calc.mul(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    try {
                        result = calc.div(a, b);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid option.");
                    break;
            }

            System.out.print("Do you want to continue? [y/n]: ");
            continueChoice = sc.next().charAt(0);
        } while (continueChoice == 'y' || continueChoice == 'Y');

        sc.close();
    }
}
