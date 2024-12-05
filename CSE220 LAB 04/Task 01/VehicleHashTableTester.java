//DO NOT TOUCH THIS TESTER CLASS
public class VehicleHashTableTester {
    //DO NOT TOUCH THIS TESTER MAIN METHOD
    public static void main(String[] args){

        //DO NOT TOUCH ANY CODE BELOW
        Object[][] vehicleInfo = {
            {"Toyota", "Private Car", 500, 4},
            {"Jeep", "SUV", 950, 6},
            {"Lamborghini", "SUV", 6900, 6},
            {"Hyundai", "Bike", 100, 1},
            {"BMW", "Private Car", 1000, 8},
            {"Honda", "Bike", 150, 1},
            {"Ferrari", "Private Car", 2500, 4},
            {"BMW", "Minivan", 5800, 7}
        };

        int totalVehicles = vehicleInfo.length;
        VehicleHashTable vt = new VehicleHashTable( totalVehicles );

        vt.createFromVehicleInfoArray(vehicleInfo);
        String expOut = ":::EXPECTED OUTPUT:::\n"
        + "0 : (Brand: Toyota, Type: Private Car, Rent: 500, Passengers: 4) --> null\n"
        + "1 : (Brand: Lamborghini, Type: SUV, Rent: 6900, Passengers: 6) --> null\n"
        + "2 : (Brand: Hyundai, Type: Bike, Rent: 100, Passengers: 1) --> null\n"
        + "3 : (Brand: Honda, Type: Bike, Rent: 150, Passengers: 1) --> null\n"
        + "4 : (Brand: Jeep, Type: SUV, Rent: 950, Passengers: 6) --> null\n"
        + "5 : (Brand: Ferrari, Type: Private Car, Rent: 2500, Passengers: 4) --> null\n"
        + "6 : (Brand: BMW, Type: Minivan, Rent: 5800, Passengers: 7) --> (Brand: BMW, Type: Private Car, Rent: 1000, Passengers: 8) --> null\n"
        + "7 : null";
        System.out.println(expOut);
        System.out.println("\n:::YOUR OUTPUT:::");
        vt.printVehicleHashtable();
        
   }

}