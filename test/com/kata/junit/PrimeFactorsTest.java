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
    public void oneGeneratesEmptyList() throws Exception {
        List expectedResult = primeFactors.generate(1);
        ArrayList actualResult = new ArrayList<Integer>();
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void twoGeneratesTwo() throws Exception {
        List expectedResult = primeFactors.generate(2);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(2);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void threeGeneratesThree() throws Exception {
        List expectedResult = primeFactors.generate(3);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(3);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void fourGeneratesTwoTwice() throws Exception {
        List expectedResult = primeFactors.generate(4);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(2);
        actualResult.add(2);
        assertEquals(actualResult, expectedResult);

    }

    @Test
    public void fiveGeneratesFive() throws Exception {
        List expectedResult = primeFactors.generate(5);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(5);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void sixGeneratesThreeAndTwo() throws Exception {
        List expectedResult = primeFactors.generate(6);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(2);
        actualResult.add(3);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void eightGeneratesTwoThreeTimes() throws Exception {
        List expectedResult = primeFactors.generate(8);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(2);
        actualResult.add(2);
        actualResult.add(2);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nineGeneratesThreeTwoTimes() throws Exception {
        List expectedResult = primeFactors.generate(9);
        ArrayList actualResult = new ArrayList<Integer>();
        actualResult.add(3);
        actualResult.add(3);
        assertEquals(actualResult, expectedResult);
    }
}

