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

    @Test
    public void fiveGeneratesBuzz() throws Exception {
        assertEquals("buzz", FizzBuzz.generate(5));
    }

    @Test
    public void sixGeneratesFizz() throws Exception {
        assertEquals("fizz", FizzBuzz.generate(6));
    }

    @Test
    public void tenGeneratesBuzz() throws Exception {
        assertEquals("buzz", FizzBuzz.generate(10));
    }


}
