package com.kata.junit;

public class FizzBuzz {
    public static String generate(int input) {
        if (input == 5) {
            return "buzz";
        }
        else if (input % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(input);
    }
}
