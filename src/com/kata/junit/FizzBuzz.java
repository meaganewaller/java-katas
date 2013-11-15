package com.kata.junit;

public class FizzBuzz {
    public static String generate(int input) {
        if (input == 3) {
            return "fizz";
        }
        return String.valueOf(input);
    }
}
