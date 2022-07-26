package com.javafortesters.chap014junit.examples;

import org.junit.Test;

public class ASysOutJuniTest {
    @Test
    public void canOutputHelloWorldConsole() {
        AClassWithAmethod myClass = new AClassWithAmethod();
        myClass.aMethodOnAClass();
    }
}
