// class VehicleTest {
//     public static void main(String[] args) {
//         Vehicle bike = new Vehicle();
//         Vehicle car = new Vehicle();
//         bike.setNumberOfWheels(2);
//         bike.setColor("red");
//         int bikeWheels = bike.getNumberOfWheels();
//         String bikeColor = bike.getColor();
//         car.setNumberOfWheels(4);
//         car.setColor("green");
//         int carWheels = car.getNumberOfWheels();
//         String carColor = car.getColor();

//         System.out.println("This bike has " + bikeWheels + " wheels that are " + bikeColor +".");
//         System.out.println("This car has  " + carWheels + " wheels that are " + carColor + ".");
//     }
// }


class VehicleTest {
    public static void main(String[] args) {
        Vehicle redVehicle = new Vehicle("red", 4);
        String color = redVehicle.getColor();
        Integer numberOfWheels = redVehicle.getNum();
        System.out.println("The Vehicle color is: " + color + " and it has " + numberOfWheels + " wheels.");
    }
}