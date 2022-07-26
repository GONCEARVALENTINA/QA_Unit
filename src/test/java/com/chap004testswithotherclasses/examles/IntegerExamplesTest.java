package com.chap004testswithotherclasses.examles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        Integer five = new Integer(5);

        assertEquals("int value returns int 4", 4, four.intValue());
        assertEquals("int value returns int 5", 5, five.intValue());


    }
}

