package com.kata.junit;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/6/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */

/* Refactoring Notes:
What this method is actually doing:
1. Setting primes ArrayList
2. Checking if number arg is 1, if so returning empty initialized ArrayList
3. Setting integer i to 1
4. As long as the i integer is less than or equal to the number argument
4a. It adds 1 to i if so
5. After adding 1 to i, it enters into another loop, checks if the number is divisible by i
5a. If so, it adds whatever i is to the primes ArrayList
5b. It sets number now to number divided by i
6. After it adds i, and divides by i, it goes back to #5
7. Once it's either no longer divisible, or i is greater than the number, it checks if the number is 1
7a. If the number isn't one, it adds the number to the primes ArrayList
8. Returns the primes ArrayList

This method is supposed to generate the primes for a given number, however as we can see it does way more than that.

How can I split this method up, should I split it up?


 */
public class PrimeFactorsTwo {
    public static List<Integer> generate(int number) {
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
