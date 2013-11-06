package com.kata.junit;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/6/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsTwo {
    public static List<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if(number == 1) return primes;
        if(number % 2 == 0) {
            primes.add(2);
            number = number/2;
        }
        if(number != 1) {
            primes.add(number);
        }
        return primes;
    }
}
