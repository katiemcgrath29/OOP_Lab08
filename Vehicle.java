
public abstract class Vehicle {
    private int numDoors;

    public Vehicle(int _numDoors) {
        this.numDoors = _numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public abstract int vehicleRange(int _roadQuality);







}
