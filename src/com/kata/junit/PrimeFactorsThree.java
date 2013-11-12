package com.kata.junit;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/11/13
 * Time: 9:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsThree {
    public static List<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int i = 1;
        while(i <= number){
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
