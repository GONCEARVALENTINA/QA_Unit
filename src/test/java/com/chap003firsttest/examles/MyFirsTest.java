package com.chap003firsttest.examles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirsTest {
    @Test
    public void canAddTwoPlus() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

}








