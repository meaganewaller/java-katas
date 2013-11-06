package com.kata.junit;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/6/13
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsTest {
    private PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
       primeFactors = new PrimeFactors();

    }

    @Test
    public void testSayHello() throws Exception {
        assertEquals("Hello", primeFactors.sayHello());
    }
}
