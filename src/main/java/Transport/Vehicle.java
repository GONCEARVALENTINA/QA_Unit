package Transport;

public class Vehicle {

    private int passenger;
    private int fuelcap;//емкость топливного бака
    private int mpg = 1;//потпебление топлива в милях на галлон

    public Vehicle() {
    }

    public Vehicle(int numberOfPassenger, int fuelCapVolume, int milerPerGalolon) {
        passenger = numberOfPassenger;
        fuelcap = fuelCapVolume;
        mpg = milerPerGalolon;
    }

    public int getMaxDistance() {
        System.out.println("Maximum distance with full fuelcap " + (fuelcap * mpg) + " miles");
        return mpg * fuelcap;
    }

    public double fueNeeded(int distance) {
        return (double) distance / mpg;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        if (mpg > 0) this.mpg = mpg;
        else setMpg(1);
    }
}

