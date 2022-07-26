package com.itvdn.junit.Jesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {
    @Test
    public void sum() {
        Number number = new Number();
        int actual = number.sum(6);
        int expected = 21;
        assertEquals(expected, actual);
    }

}