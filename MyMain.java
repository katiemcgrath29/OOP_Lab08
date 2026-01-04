/**
 * Our main class for understanding abstraction in a software setting<br>.
 */
public class MyMain {

    //--------------------------------------------------
    //	testAbstraction
    //--------------------------------------------------
    /**
     * This function tests the Abstraction project.<br>
     */
    public static void testAbstraction(){
        System.out.println("\nTesting Abstraction\n");

        // 1. We create a couple of drivers.
        Driver d1 = new Driver("John", 2, 12);
        Driver d2 = new Driver("Mary", 3, "grey");

        // 2. We get their vehicles.
        Vehicle v1 = d1.getVehicle();
        Vehicle v2 = d2.getVehicle();

        // 3. We use their vehicles.
        System.out.println("Testing the vehicles of the drivers");
        int value = v1.vehicleRange(10);
        System.out.println(value);
        value = v1.vehicleRange(20);
        System.out.println(value);

        value = v2.vehicleRange(10);
        System.out.println(value);
        value = v2.vehicleRange(20);
        System.out.println(value);

        // 3. We make d1 to create a new vehicle.
        System.out.println("Testing the new vehicles created by the drivers");
        Vehicle v3 = d1.createNewVehicle(1, 4, 40, "red");
        value = v3.vehicleRange(10);
        System.out.println(value);
        value = v3.vehicleRange(20);
        System.out.println(value);

        // 4. We make d2 to create a new vehicle.
        Vehicle v4 = d2.createNewVehicle(2, 5, 50, "grey");
        value = v4.vehicleRange(10);
        System.out.println(value);
        value = v4.vehicleRange(20);
        System.out.println(value);

        // 5. We ensure d1 and d2 have not been assigned to the new vehicles v3 and v4, but to the ones they were assigned beforehand.
        System.out.println("Testing that the new vehicles created by the drivers have not been assigned to the drivers");
        Vehicle v5 = d1.getVehicle();
        Vehicle v6 = d2.getVehicle();

        value = v5.vehicleRange(10);
        System.out.println(value);
        value = v5.vehicleRange(20);
        System.out.println(value);

        value = v6.vehicleRange(10);
        System.out.println(value);
        value = v6.vehicleRange(20);
        System.out.println(value);

        // 6. We finally assign d1 and d2 to the new vehicles, for them to play now.
        System.out.println("Testing assigning new vehicles created by the drivers to the drivers");
        d1.setVehicle(v3);
        d2.setVehicle(v4);

        Vehicle v7 = d1.getVehicle();
        Vehicle v8 = d2.getVehicle();

        value = v7.vehicleRange(10);
        System.out.println(value);
        value = v7.vehicleRange(20);
        System.out.println(value);

        value = v8.vehicleRange(10);
        System.out.println(value);
        value = v8.vehicleRange(20);
        System.out.println(value);
    }


    //--------------------------------------------------
    //	MAIN
    //--------------------------------------------------
    /**
     * Main Method.<br>
     * @param args - We will run the program parameter free, so do not worry about it.
     */
    public static void main(String[] args) {
        // 1. We parse any parameter in
        ;

        // 2. We call to the method we want to try
        testAbstraction();
    }

}