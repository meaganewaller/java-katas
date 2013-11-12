package com.kata.junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: meaganewaller
 * Date: 11/11/13
 * Time: 9:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactorsThreeTest {
    private PrimeFactorsThree primeFactors;
    private ArrayList expectedResult = new ArrayList<Integer>();


    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactorsThree();
    }

    @Test
    public void oneGeneratesEmptyList() throws Exception {
        List actualResult = primeFactors.generate(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void twoGeneratesTwo() throws Exception {
        List actualResult = primeFactors.generate(2);
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void threeGeneratesThree() throws Exception {
        List actualResult = primeFactors.generate(3);
        expectedResult.add(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourGeneratesTwoTwice() throws Exception {
        List actualResult = primeFactors.generate(4);
        expectedResult.add(2);
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eightGeneratesTwoThreeTimes() throws Exception {
        List actualResult = primeFactors.generate(8);
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void nineGeneratesThreeTwice() throws Exception {
        List actualResult = primeFactors.generate(9);
        expectedResult.add(3);
        expectedResult.add(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void twentySevenGeneratesThreeThreeTimes() throws Exception {
        List actualResult = primeFactors.generate(27);
        expectedResult.add(3);
        expectedResult.add(3);
        expectedResult.add(3);
        assertEquals(expectedResult, actualResult);
    }


}
