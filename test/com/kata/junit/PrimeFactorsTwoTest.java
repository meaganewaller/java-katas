package com.kata.junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/6/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsTwoTest {
    private PrimeFactorsTwo primeFactors;

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactorsTwo();
    }

    @Test
    public void oneGeneratesEmptyList() throws Exception {
        List actualResult = primeFactors.generate(1);
        ArrayList expectedResult = new ArrayList<Integer>();
        assertEquals(expectedResult, actualResult);
    }


}
