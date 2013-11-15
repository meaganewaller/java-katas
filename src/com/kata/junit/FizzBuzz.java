package com.kata.junit;

public class FizzBuzz {
    public static String generate(int input) {
        if (input % 15 == 0 ) {
            return "fizzbuzz";
        }
        else if (input % 5 == 0 ) {
            return "buzz";
        }
        else if (input % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(input);
    }
}
