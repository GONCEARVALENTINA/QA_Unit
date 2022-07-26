package Transport;

public class Truck extends Vehicle {

    int cargocap;

    public Truck() {
    }

    public Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void putCargo(int c) {
        cargocap = c;
    }
}
