
public class Driver {
    private String name;
    private Vehicle myVehicle;

    public Driver(String _name, int _numDoors, int _horsepower){
        this.name = _name;
        this.myVehicle = new Car(_numDoors, _horsepower);
    }

    public Driver(String _name, int _numDoors, String _colour){
        this.name = _name;
        this.myVehicle = new Van(_numDoors, _colour);
    }

    public Vehicle getVehicle(){
        return this.myVehicle;
    }

    public void setVehicle(Vehicle _myVehicle){
        this.myVehicle = _myVehicle;
    }

    public Vehicle createNewVehicle(int _option, int _numDoors, int _horsepower, String _colour){
        if (_option == 1){
            return new Car(_numDoors, _horsepower);
        } else {
            return new Van(_numDoors, _colour);
        }
    }



}
