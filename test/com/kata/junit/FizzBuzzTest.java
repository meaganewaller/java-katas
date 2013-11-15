package com.kata.junit;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class FizzBuzzTest {
    @Test
    public void oneGeneratesOne() throws Exception {
        assertEquals("1", FizzBuzz.generate(1));
    }

    @Test
    public void threeGeneratesFizz() throws Exception {
        assertEquals("fizz", FizzBuzz.generate(3));
    }


}
