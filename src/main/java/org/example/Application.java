package org.example;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of integers as command line arguments.");
        } else {
            for (String arg : args) {
                try {
                    int number = Integer.parseInt(arg);
                    if (isEven(number)) {
                        System.out.println(number + " is even");
                    } else if (isOdd(number)) {
                        System.out.println(number + " is odd");
                    } else {
                        System.out.println(number + " is neither odd nor even. This is impossible!");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(arg + " is not an integer!");
                }
            }
        }
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
