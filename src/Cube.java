import java.util.Random;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube() {
        Random rand = new Random();
        this.side = 1 + rand.nextDouble() * 9; // Side length between 1 and 10
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube (Side: %.2f)", side);
    }
}
