package com.example.multiplyintegers;

public class MultiplyIntegers {
/*Testing */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one integer argument.");
            return;
        }

        try {
            int result = multiply(args);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer arguments.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int multiply(String... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Please provide at least one number.");
        }

        int result = 1;
        for (String number : numbers) {
            result *= Integer.parseInt(number);
        }
        return result;
    }
}
