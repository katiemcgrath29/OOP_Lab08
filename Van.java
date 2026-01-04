
public class Van extends Vehicle {
    private String colour;

    public Van(int _numDoors, String _colour) {
        super(_numDoors);
        this.colour = _colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public int vehicleRange(int _roadQuality){
        int range = _roadQuality * 3;
        if (colour.toLowerCase().contains("grey")){
            range+=10;
        }
        return range;
    }








}
