package com.Transport;

import Transport.Truck;
import Transport.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {

    @Test
    public void vehicleTest() {
        Vehicle car = new Vehicle();
        assertEquals(0, car.getMaxDistance());
        assertEquals(10, car.fueNeeded(10), 0);
    }

    @Test
    public void vehicle1Test() {
        Vehicle car = new Vehicle(5, 20, 10);
        assertEquals(200, car.getMaxDistance());
        assertEquals(1, car.fueNeeded(10), 0);
    }

    @Test
    public void vehicle2Test() {
        Vehicle myclass = new Vehicle();
    }

    @Test
    public void vehicle3Test() {
        Vehicle myclass = new Vehicle();
        myclass.toString();
    }

    @Test
    public void truck1Test() {
        Truck myclass = new Truck();
        myclass.getCargocap();
    }

    @Test
    public void truck2Test() {
        Truck myclass = new Truck();
    }

    @Test
    public void truck3Test() {
        Truck myclass = new Truck();
    }

    @Test
    public void truck4Test() {
        Truck myclass = new Truck();
    }

    @Test
    public void truck5Test() {
        Truck myclass = new Truck();
    }

    @Test
    public void truck6Test() {
        Truck myclass = new Truck();
    }
}
