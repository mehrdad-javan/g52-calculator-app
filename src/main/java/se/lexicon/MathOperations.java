package se.lexicon;

public class MathOperations {

    //Varargs (...): means method can accept zero or more arguments of the specified type
    public static int add(int... numbers) { // 1,8,2  = 11
        int sum = 0; // 1
        for (int number : numbers) {
            //sum = sum + number;
            sum += number;
        }
        return sum;
    }


    public static int subtract(int a, int b) {
        return a - b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static int divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }


}
