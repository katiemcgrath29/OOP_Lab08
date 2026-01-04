
public class Car extends Vehicle {
    private int horsepower;

    public Car(int _numDoors, int _horsepower){
        super(_numDoors);
        this.horsepower = _horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public int vehicleRange(int _roadQuality){
        int range = _roadQuality * 5;
        range += horsepower / 10;
        range -= getNumDoors() * 3;
        return range;
    }







}
