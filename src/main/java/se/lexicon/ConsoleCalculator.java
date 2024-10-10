package se.lexicon;

import java.util.Scanner;

public class ConsoleCalculator {


    public static void displayMenu() {
        System.out.println("===== Calculator Menu =====");
        System.out.println("Choose an operation:");
        System.out.println("+ (Addition)");
        System.out.println("- (Subtraction)");
        System.out.println("* (Multiplication)");
        System.out.println("/ (Division)");
        System.out.println("addition (Advanced Addition)");
        System.out.println("exit (Exit the calculator)");
        System.out.println("==========================");
    }

    public static void runCalculator() {
        while (true) {
            displayMenu();
            System.out.println("Choose the operation: ");
            Scanner sc = new Scanner(System.in);
            String operation = sc.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            if (operation.equalsIgnoreCase("addition")){
                // Handel multiple number addition
                performAdvancedAddition();
            } else {
                int firstNumber = getNumber("Enter the first number: ");
                int secondNumber = getNumber("Enter the second number: ");

                performOperation(operation, firstNumber, secondNumber);
            }


        }

    }


    public static void performOperation(String mathOperationType, int n1, int n2) {

        switch (mathOperationType) {
            case "+":
                System.out.println("Result: " + MathOperations.add(n1, n2));
                System.out.println("Addition operation has been executed!");
                break;
            case "-":
                System.out.println("Result: " + MathOperations.subtract(n1, n2));
                System.out.println("Subtraction operation has been executed!");
                break;
            case "*":
                System.out.println("Result: " + MathOperations.multiply(n1, n2));
                System.out.println("Multiplication operation has been executed!");
                break;
            case "/":
                System.out.println("Result: " + MathOperations.divide(n1, n2));
                System.out.println("Division operation has been executed!");
                break;
            default:
                System.out.println("Invalid Operation. Please try again.");
        }

    }


    public static int getNumber(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void performAdvancedAddition(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number (or type '=' to calculate): ");
            String input = scanner.nextLine(); // 10

            if(input.equals("=")){
                System.out.println("Result: " + sum);
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;

        }

    }

}
