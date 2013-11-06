package com.kata.junit;

import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/6/13
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactors {
    public static List<Integer> generate(int number)  {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if(number == 1) return primes;
        int i = 1;
        while(i <= number) {
            i++;
        while(number % i == 0) {
            primes.add(i);
            number = number/i;
        }
        }
        if(number != 1) {
        primes.add(number);
        }
        return primes;

    }
}
